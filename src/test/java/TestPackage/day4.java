package TestPackage;
//rahulonlinetutor@gmail.com

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

    @Parameters({"URL"})
    @Test
    public void WebLoginHomeLoan(String uname) {
        System.out.println("Web Login Home Personal Loan");
        System.out.println(uname);
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan() {
        //Appium
        System.out.println("Mobile Login Home Loan");
    }

    @Test
    public void LoginAPIHomeLoan3() {
        //Rest API
        System.out.println("API Login Home Loan");
    }
}
