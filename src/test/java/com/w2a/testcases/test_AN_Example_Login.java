package com.w2a.testcases;

import base.TestBase;
import com.w2a.PO.FormsFieldPage;
import com.w2a.PO.HomePage;
import com.w2a.PO.ModalsPage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class test_AN_Example_Login extends TestBase {
    public static JSONObject LoginData;

    @Test
    public void test_Login() throws FileNotFoundException, InterruptedException {
        String jsonPath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\user.json";
        System.out.println(jsonPath);
        try (FileReader reader = new FileReader(jsonPath)){
            JSONTokener tokener = new JSONTokener(reader);
            LoginData = new JSONObject(tokener);
            } catch (IOException e) {
            e.getStackTrace();
        }
        System.out.println(LoginData);
        JSONArray users = LoginData.getJSONArray("userslogin");

        String username = users.getJSONObject(0).getString("username");
        String password = users.getJSONObject(0).getString("password");
        System.out.println(username);
        System.out.println(password);
        Thread.sleep(3000);



    }



}

