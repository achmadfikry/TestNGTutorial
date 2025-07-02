package TestPackage;
//rahulonlinetutor@gmail.com

import org.testng.annotations.*;

public class day3 {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Executing Any Methods in the class");
    }

    @Parameters({"URL", "APIKey/username"})
    @Test
    public void WebLoginCarLoan(String urlname, String key) {
        System.out.println("Web Login Car Loan");
        System.out.println(urlname);
        System.out.println(key);
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

    @Test(dataProvider = "getData")
    public void MobileSignOutCarLoan(String username, String password) {
        //Appium
        System.out.println("Mobile Sign Out Car Loan");
        System.out.println(username);
        System.out.println(password);
    }

    @Test(dependsOnMethods = {"WebLoginCarLoan", "MobileSignOutCarLoan"})
    public void APICarLoan3() {
        //Rest API
        System.out.println("API Login Car Loan");
    }

    @DataProvider
    public Object[][] getData(){
        //1st combination - username password - good credit history
        //2nd - username password - no credit history
        //3rd - fraudelent credit history
        //defining array with row & columns (multidimentional object array)
        //3 -> how many combination that we have
        //2 -> how many values that we are passing
        Object[][] data = new Object[3][2];
        data[0][0] = "firstusername";
        data[0][1] = "firstpassword";
        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";
        data[2][0] = "thirdusername";
        data[2][1] = "thirdpassword";
        return data;
    }
}
