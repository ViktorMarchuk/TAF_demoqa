package com.idf.demoqa.pages;

import com.idf.demoqa.domain.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    private String xpathButtonLogin = "//button[@id='login']";
    private String xpathFieldUserName = "//input[@id='userName']";
    private String xpathFieldPassword = "//input[@id='password']";
    private String xpathButtonLoginOnNextPage = "//button[@id='login']";
    private String xpathText = "//label[@id='userName-value']";
    private String xpathBooksList = "//span[@class='mr-2']";

    public HomePage(WebDriver driver){
        super(driver);
    }


    public void clickButtonLogin(){
        By buttonLogin = By.xpath(xpathButtonLogin);
        WebElement elementButtonLogin = driver.findElement(buttonLogin);
        elementButtonLogin.click();
    }

    public void inputUserName(){
        By fieldUserName = By.xpath(xpathFieldUserName);
        WebElement elementFieldUserName = driver.findElement(fieldUserName);
        elementFieldUserName.sendKeys(UserData.USER_NAME);
    }

    public void inputPassword(){
        By fieldPassword = By.xpath(xpathFieldPassword);
        WebElement elementFieldPassword = driver.findElement(fieldPassword);
        elementFieldPassword.sendKeys(UserData.PASSWORD);
    }

    public void clickButtonLoginOnNextPage(){
        By buttonLoginOnNextPage = By.xpath(xpathButtonLoginOnNextPage);
        WebElement elementButtonLoginOnNextPage = driver.findElement(buttonLoginOnNextPage);
        elementButtonLoginOnNextPage.click();
    }

    public String getTextFromPage(){
        By text = By.xpath(xpathText);
        WebElement elementText = driver.findElement(text);
        return elementText.getText();
    }

    public ArrayList <String> getBooksListArray(){
        ArrayList<String>list=new ArrayList<>();
        List <WebElement> elements = driver.findElements(By.xpath(xpathBooksList));
        for(int i = 0; i < elements.size(); i++){
            list.add(elements.get(i).getText());
        }
        return list;
    }
}
