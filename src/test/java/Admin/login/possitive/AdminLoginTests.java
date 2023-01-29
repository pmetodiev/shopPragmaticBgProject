package Admin.login.possitive;

import org.openqa.selenium.devtools.v100.browser.Browser;
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
        AdminLoginPage.login("admin","parola123!");
        CommonVerifications.verifyTitle("Dashboard","The expected title is not matching the actual one");
        AdminDashboardPage.logOut();
//                //new html = new class
//        //LOGOUT BECAUSE OF TOKEN SESSION
    }

    @AfterMethod
    /**
     * Method tha closes all the open of the browser windows
     */
    public void tearDown(){
       BrowserActions.driver.quit();

    }
}
