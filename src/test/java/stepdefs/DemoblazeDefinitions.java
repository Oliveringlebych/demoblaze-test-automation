package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DemoblazeDefinitions {
    WebDriver driver;

    @Given("I have accessed the demoblaze website")
    public void I_have_accessed_the_demoblaze_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @When("I have logged in")
    public void I_have_logged_in() throws Exception{
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
    @When("I add an item to the basket")
    public void I_add_an_item_to_the_basket() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
    }

    @When("I add an item to the basket to buy")
    public void I_add_an_item_to_the_basket_to_buy() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
    }

    @Then("I can pay for that item")
    public void I_can_pay_for_that_item() throws Exception {
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
        driver.quit();
    }

    @Then("I delete that item from the basket")
    public void I_delete_that_item_from_the_basket() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(" /html/body/div[6]/div/div[1]/div/table/tbody/tr/td[4]/a")).click();
        Thread.sleep(1500);
        driver.quit();

    }

    @Then("I can use the contact us link to send a message")
    public void I_can_use_the_contact_us_link_to_send_a_message() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"recipient-email\"]")).sendKeys("oingleby123@email.co.uk");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"recipient-name\"]")).sendKeys("Oliver Ingleby");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"message-text\"]")).sendKeys("Hello World");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(500);
        driver.quit();
    }
}
