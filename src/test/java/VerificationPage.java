import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationPage {
    public String getFirstNewsDescription(WebDriver driver) {
        WebElement elementOne = driver.findElement(By.xpath("//*[@id='widget-1-1']//span"));
        String text = elementOne.getText();
        return text;
    }
}
