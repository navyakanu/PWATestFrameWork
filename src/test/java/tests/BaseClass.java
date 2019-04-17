package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    @BeforeSuite
    public void initialiseDriver(){


    }



    @AfterSuite
    public void closeOpenConnections(){


    }




}
