package Admin.login.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdminDashboardPage;
import pages.AdminLoginPage;
import utils.BrowserActions;
import utils.CommonVerifications;

public class AdminLoginTests {

    @BeforeMethod
    public void setUp(){
        BrowserActions.open("chrome");

    }

    @Test
    public void successfullyCanLoginAsAdminValidCredentials(){
        AdminLoginPage.goTo();
        AdminLoginPage.login("admin","parola1234!");
        AdminLoginPage.verifyErrorValidationMessageInCaseOffUnssuccesfulLogin(" No match for Username and/or Password.","The error validation message is incorrect");

    }

    @AfterMethod
    /**
     * Method tha closes all the open of the browser windows
     */
    public void tearDown(){
        BrowserActions.driver.quit();

    }
}
