import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static ChromeOptions options ;
    public static WebDriver driver ;
    @BeforeClass
    void Setup(){
        options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    @Test
    void teststeps() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[6]/button")).click();

        Thread.sleep(9000);
        driver.close();
    }
}
