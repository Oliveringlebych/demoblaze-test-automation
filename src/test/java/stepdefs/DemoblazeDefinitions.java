package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoblazeDefinitions {
    WebDriver driver;

    @Given("^I have accessed the demoblaze website$")
    public void i_have_a_configured_Cucumber_JVM_project() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //new
    }

    @When("^I have logged in")
    public void i_can_login() throws Exception {
        driver.findElement(By.id("login2")).click();
        driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("oingleby123");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("oingleby123");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(500);
        driver.navigate().refresh();
        Thread.sleep(2000);
    }

    @And("^I add an item to the basket$")
    public void i_run_it_within_my_IDE() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
    }

    @Then("^I can pay for that item$")
    public void i_will_be_able_to_run_connected_step_definitions() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("John Smith");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("Glamorgan");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Cardiff");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"card\"]")).sendKeys("4444333322221111");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("09");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("25");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
    }
}
