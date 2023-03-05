package com.idf.demoqa.steps;

import com.idf.demoqa.domain.UserData;
import com.idf.demoqa.pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class HomeStep extends HomePage{
    private final static Logger LOGGER = LogManager.getLogger();

    public HomeStep(WebDriver driver){
        super(driver);
    }

    public void actionOnHomePage(){
        try{
            clickButtonLogin();
        }catch(Exception e){
            LOGGER.error(UserData.URL + " not found");
        }
        clickButtonLogin();
        inputUserName();
        inputPassword();
        clickButtonLoginOnNextPage();
    }
}
