import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class MyStepdefstore {

    public WebDriver driver;

    @Given("I visit {string}")
    public void iVisit(String arg0) {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");
    }
    @When("I press the login button")
    public void iPressTheLoginButton()  throws Exception  {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a")).click();
        Thread.sleep(3000);
    }

    @Then("I verify the text AUTHENTICATION in step")
    public void iVerifyTheTextAUTHENTICATIONInStep()  throws Exception  {
        String actualString = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1")).getText();
        assertTrue(actualString.contains("AUTHENTICATION"));
        Thread.sleep(3000);
        driver.close();
    }

    @When("I press the keranjang button")
    public void iPressTheKeranjangButton() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[4]/div/a")).click();
        Thread.sleep(3000);
    }

    @Then("I verify the text YOUR BOOKING CART in step")
    public void iVerifyTheTextYOURBOOKINGCARTInStep() {
        String actualString = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).getText();
        assertTrue(actualString.contains("YOUR BOOKING CART"));
        driver.close();
    }


    @Given("I press the burger Menu")
    public void iPressTheBurgerMenu() throws Exception {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
    }

    @When("I press the Home Menu")
    public void iPressTheHomeMenu() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a")).click();
        Thread.sleep(3000);
    }

    @Then("I verify the text Welcome To in step")
    public void iVerifyTheTextWelcomeToInStep() throws Exception {
        By verifyElementWelcome = By.xpath("//*[@id=\"header\"]/div[4]/div/div/div/div[1]/div/p");
        String message = driver.findElement(verifyElementWelcome).getText();
        Assert.assertTrue(message.contains("Welcome To"));
        driver.close();
    }
}
