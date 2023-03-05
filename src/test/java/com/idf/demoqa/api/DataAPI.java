package com.idf.demoqa.api;

import com.idf.demoqa.domain.UserData;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class DataAPI{
    @Test
    public ArrayList <String> getJson(){
        ArrayList <String> list = new ArrayList <>();
        Response res = given().when().get(UserData.URL_API);
        JsonPath jsonPath = new JsonPath(res.asString());
        String title1 = jsonPath.getString("books[0].title");
        String title2 = jsonPath.getString("books[1].title");
        String title3 = jsonPath.getString("books[2].title");
        String title4 = jsonPath.getString("books[3].title");
        String title5 = jsonPath.getString("books[4].title");
        String title6 = jsonPath.getString("books[5].title");
        String title7 = jsonPath.getString("books[6].title");
        String title8 = jsonPath.getString("books[7].title");
        list.add(title1);
        list.add(title2);
        list.add(title3);
        list.add(title4);
        list.add(title5);
        list.add(title6);
        list.add(title7);
        list.add(title8);
        return list;
    }
}
