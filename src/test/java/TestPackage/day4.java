package TestPackage;
//rahulonlinetutor@gmail.com

import org.testng.annotations.Test;

public class day4 {

    @Test
    public void WebLoginHomeLoan() {
        System.out.println("Web Login Home Loan");
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
