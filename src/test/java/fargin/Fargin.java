package fargin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.AsposeOCRException;
import com.aspose.ocr.InputType;
import com.aspose.ocr.OcrInput;
import com.aspose.ocr.RecognitionResult;

import org.bytedeco.opencv.global.opencv_imgcodecs;
import org.bytedeco.opencv.global.opencv_imgproc;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.Size;

public class Fargin {

    @Test
    public void Login() throws IOException, AsposeOCRException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev-admin.farginconnect.com/login-page");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rupathanya.a@babujiventures.in");
        WebElement cat = driver.findElement(By.id("Bussiness category"));
        Select se = new Select(cat);
        cat.click();
        se.selectByVisibleText("Cable Services");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");

        WebElement captcha = driver.findElement(By.xpath("//input[@class='input']"));

        // Capture screenshot of CAPTCHA
        File temp = captcha.getScreenshotAs(OutputType.FILE);
        String originalPath = "C:\\Users\\DELL\\eclipse-workspace\\ci.com\\screenshot\\cpatcha.jpg";
        File permanent = new File(originalPath);
        FileHandler.copy(temp, permanent);

        Thread.sleep(3000);

        // Try multiple preprocessing variants
        String[] variants = { "adaptive", "otsu", "morph", "resize" };
        String bestText = "";
        AsposeOCR api = new AsposeOCR();

        for (String variant : variants) {
            String processedPath = preprocessVariant(originalPath, variant);
            OcrInput input = new OcrInput(InputType.SingleImage);
            input.add(processedPath);
            ArrayList<RecognitionResult> results = api.Recognize(input);
            String text = results.get(0).recognitionText;
            if (text.length() > bestText.length()) {
                bestText = text;
            }
        }

        System.out.println("Best Extracted Text: " + bestText);

        // Submit CAPTCHA and login
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Enter the Captcha']")).sendKeys(bestText.trim());
        driver.findElement(By.xpath("//button[.='Login']")).click();
    }

    public String preprocessVariant(String imagePath, String variant) {
        Mat image = opencv_imgcodecs.imread(imagePath);
        if (image.empty()) {
            throw new RuntimeException("Image not loaded. Check the path: " + imagePath);
        }

        Mat processed = new Mat();

        switch (variant) {
            case "adaptive":
                opencv_imgproc.cvtColor(image, image, opencv_imgproc.COLOR_BGR2GRAY);
                opencv_imgproc.adaptiveThreshold(image, processed, 255,
                        opencv_imgproc.ADAPTIVE_THRESH_GAUSSIAN_C,
                        opencv_imgproc.THRESH_BINARY_INV, 11, 2);
                break;

            case "otsu":
                opencv_imgproc.cvtColor(image, image, opencv_imgproc.COLOR_BGR2GRAY);
                opencv_imgproc.threshold(image, processed, 0, 255,
                        opencv_imgproc.THRESH_BINARY_INV + opencv_imgproc.THRESH_OTSU);
                break;

            case "morph":
                opencv_imgproc.cvtColor(image, image, opencv_imgproc.COLOR_BGR2GRAY);
                opencv_imgproc.threshold(image, processed, 150, 255, opencv_imgproc.THRESH_BINARY);
                Mat kernel = opencv_imgproc.getStructuringElement(opencv_imgproc.MORPH_RECT, new Size(2, 2));
                opencv_imgproc.morphologyEx(processed, processed, opencv_imgproc.MORPH_CLOSE, kernel);
                break;

            case "resize":
                opencv_imgproc.cvtColor(image, image, opencv_imgproc.COLOR_BGR2GRAY);
                opencv_imgproc.resize(image, image, new Size(image.cols() * 2, image.rows() * 2));
                opencv_imgproc.threshold(image, processed, 150, 255, opencv_imgproc.THRESH_BINARY);
                break;

            default:
                processed = image.clone();
        }

        String outputPath = "C:\\Users\\DELL\\eclipse-workspace\\ci.com\\screenshot\\processed_" + variant + ".jpg";
        opencv_imgcodecs.imwrite(outputPath, processed);
        return outputPath;
    }
}