import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver
public class TestRegistration{
   public static void main(String[] args){
      WebDriver driver = new ChromeDriver();
      driver.get("http://www.facebook.com");
      driver.manage().window().maximize();
      driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("Name");
      driver.findElement(By.xpath(".//*[@id='u_0_e']")).click();
      
      Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
      sel1.selectByIndex("3"); // selectByVisibleText("Sep");
      
      Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
      sel2.selectByValue("6");
      
      driver.quit();
   }
}