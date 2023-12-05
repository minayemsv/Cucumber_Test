package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Guru_Test_Steps {
    public WebDriver driver ;

    @Given("Open the Firefox and launch the application")
    public void user_is_on_Github_login_page() {
        System.out.println("User is on the Github login page");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.demo.guru99.com/v4/");
    }

    @When("Enter the Username and Password")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
        WebElement userIdInput = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        userIdInput.sendKeys("123456789");
        passwordInput.sendKeys("987654321");
    }

    @Then("Reset the credential")
    public void clicks_on_reset_button() {
        System.out.println("User clicks on login button");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]"));
        loginButton.click();
    }

}