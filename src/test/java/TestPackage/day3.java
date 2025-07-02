package TestPackage;
//rahulonlinetutor@gmail.com

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Executing Any Methods in the class");
    }

    @Parameters({"URL"})
    @Test
    public void WebLoginCarLoan(String urlname) {
        System.out.println("Web Login Car Loan");
        System.out.println(urlname);
    }

    @BeforeMethod
    public void BeforeEvery() {
        System.out.println("I will execute before every test method in day 3 class");
    }

    @AfterMethod
    public void AfterEvery() {
        System.out.println("I will execute after every test method in day 3 class");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Executing All Methods in the class");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginCarLoan() {
        //Appium
        System.out.println("Mobile Login Car Loan");
    }

    @BeforeSuite
    public void BfSuite(){
        System.out.println("I am no 1 BfSuite");
    }

    @Test(enabled = true)
    public void MobileSignInCarLoan() {
        //Appium
        System.out.println("Mobile Sign In Car Loan");
    }

    @Test(timeOut = 4000)
    public void MobileSignOutCarLoan() {
        //Appium
        System.out.println("Mobile Sign Out Car Loan");
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan3() {
        //Rest API
        System.out.println("API Login Car Loan");
    }
}
