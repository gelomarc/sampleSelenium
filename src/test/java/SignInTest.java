import entities.User;
import org.junit.Before;
import org.junit.Test;

import java.time.format.TextStyle;
import java.util.Locale;

import static junit.framework.Assert.assertEquals;

public class SignInTest extends AbstractTest {

    User user = new User();

    @Override
    @Before
    public void openPage() {
        waiter.openPage("http://automationpractice.com/index.php");
        homePage.clickOnSignIn();
        signInPage.openSignUpForm(user.getEmail());
        signUpPage.fillInSignUpForm(user);
        myAccountPage.clickOnSignOut();
        homePage.clickOnSignIn();
        signInPage.signIn(user.getEmail(), user.getPassword());
    }

    @Test
    public void checkPersonalDetails() {
        myAccountPage.openPersonalInformation();
        assertEquals(myPersonalDetails.checkWhichTittleIsChecked(), user.getTitle());
        assertEquals(myPersonalDetails.getFirstNameUser(), user.getFirstName());
        assertEquals(myPersonalDetails.getLastNameUser(), user.getLastName());
        assertEquals(myPersonalDetails.getEmail(), user.getEmail());
        assertEquals(myPersonalDetails.getDateOfBirthDay(), String.valueOf(user.getBirthDate().getDayOfMonth()));
        assertEquals(myPersonalDetails.getDateOfBirthMonth(), user.getBirthDate().getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        assertEquals(myPersonalDetails.getDateOfBirthYear(), String.valueOf(user.getBirthDate().getYear()));
    }

    @Test
    public void checkAddressDetails() {
        myAccountPage.openAddresses();
        assertEquals(myAddresses.getAddressAlias(), user.getAddress().getAddressAlias().toUpperCase());
        assertEquals(myAddresses.getFirstName(), user.getAddress().getFirstName());
        assertEquals(myAddresses.getLastName(), user.getAddress().getLastName());
        assertEquals(myAddresses.getAddressLineOne(), user.getAddress().getAddressLineOne());
        assertEquals(myAddresses.getAddressLineTwo(), user.getAddress().getAddressLineTwo());
        assertEquals(myAddresses.getCity(), user.getAddress().getCity());
        assertEquals(myAddresses.getState(), user.getAddress().getState());
        assertEquals(myAddresses.getPostalCode(), user.getAddress().getPostalCode());
        assertEquals(myAddresses.getCountry(), user.getAddress().getCountry());
        assertEquals(myAddresses.getHomePhone(), user.getAddress().getHomePhone());
        assertEquals(myAddresses.getMobilePhone(), user.getAddress().getMobilePhone());
    }
}
