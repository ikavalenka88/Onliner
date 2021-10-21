//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import java.util.Scanner;
//
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Please enter letter or symbol:");
//        Scanner scanner = new Scanner(System.in);
//        String letter = scanner.nextLine();
//
//        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
////        WebElement elementOne = driver.findElement(By.xpath("//*[@id='widget-1-1']//span"));
////        try {
//            driver.get("https://www.onliner.by/");
//            Thread.sleep(2000);
//            WebElement elementOne = driver.findElement(By.xpath("//*[@id='widget-1-1']//span"));
//            String text = elementOne.getText();
//            Assert.assertNotNull(text);
////            System.out.println(text);
//
//            Assert.assertEquals(text.contains(letter),letter);
////            Thread.sleep(2000);
//            driver.quit();
////            if (text.contains(letter)) {
////                System.out.println("Contains");
////            } else {
////                System.out.println("Does not contain");
////            }
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        } finally {
////            Thread.sleep(2000);
////            driver.quit();
////        }
//    }
//}
//
