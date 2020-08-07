package com.bitrix24.step_definitons;

import com.bitrix24.utilities.Driver;
import io.cucumber.java.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void setUp(){


    }

    @After
    public void tearDown(){
        //Driver.getDriver().close();
    }

}
