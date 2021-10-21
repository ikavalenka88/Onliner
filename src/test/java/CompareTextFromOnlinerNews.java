import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareTextFromOnlinerNews {

    private WebDriver driver;
    private final VerificationPage page = new VerificationPage();


    @BeforeClass
    public void prepareData() {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void check() {
        driver.get("https://www.onliner.by/");
        String text = page.getFirstNewsDescription(driver);
        Assert.assertNotNull(text, "First news are empty");
        String letter = "в";
        Assert.assertTrue(text.toLowerCase().contains(letter.toLowerCase()), "Not contains");
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}
