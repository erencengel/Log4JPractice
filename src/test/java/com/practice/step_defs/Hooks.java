package com.practice.step_defs;

import com.practice.Globals;
import com.practice.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Hooks {

    //we will make import from apache log4j
    //Logger log = LogManager.getLogger(this.getClass());
    //Logger log = LoggerFactory.getLogger(this.getClass());

    @Before
    public void beforeMethod(){
        Driver.get().manage().window().maximize();
        log.info("maximize window");
        Driver.get().get(Globals.ETSY_URL);
        log.info("navigate to " + Globals.ETSY_URL);
    }

    @After
    public void afterMethod(){
        Driver.get().quit();
        log.info("the session quit");
    }

}
