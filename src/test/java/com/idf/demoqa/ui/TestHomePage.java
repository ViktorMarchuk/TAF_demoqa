package com.idf.demoqa.ui;

import com.idf.demoqa.api.DataAPI;
import com.idf.demoqa.domain.UserData;
import com.idf.demoqa.steps.HomeStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePage extends BaseTest{

    @Test
    public void testHomePage(){
        HomeStep step = new HomeStep(driver);
        step.actionOnHomePage();
        Assert.assertEquals(step.getTextFromPage(), UserData.USER_NAME);
    }

    @Test
    public void testDateAPIAndUI(){
        HomeStep step = new HomeStep(driver);
        DataAPI dataAPI = new DataAPI();
        step.actionOnHomePage();
        Assert.assertEquals(step.getBooksListArray(), dataAPI.getJson());
    }
}
