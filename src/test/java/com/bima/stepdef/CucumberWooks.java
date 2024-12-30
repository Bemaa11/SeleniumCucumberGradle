package com.bima.stepdef;


import com.bima.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class CucumberWooks extends BaseTest {

        @Before
        public void beforeTest() {
            getDriver();
        }

        @After
        public void afterTest() {
            driver.close();
        }
}
