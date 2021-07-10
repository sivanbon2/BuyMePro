
import Pages.HomePage;
import Pages.PickBusiness;
import Pages.SenderAndReceiverInfo;
import Pages.SignUpPage;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BuyMeTest {

    @Test
    public void test01signUp() throws Exception {

        SignUpPage signUp = new SignUpPage();
        signUp.completeSignUp();
        Assert.assertEquals(signUp.getFirstName(), "Sivan");
        Assert.assertEquals(signUp.getPassword(), "Sivan12345");
        Assert.assertEquals(signUp.getPassword(), "Sivan12345");
        signUp.clickOnRegistrationButton();

    }

    @Test
    public void test02homePage() throws Exception {
        HomePage homePage = new HomePage();
        homePage.pickFromHome();
        assert homePage.getUrl().equals("https://buyme.co.il/search?budget=6&category=16&region=11");

    }

    @Test
    public void test03pickBusiness() throws Exception{

        PickBusiness pickb = new PickBusiness();
        pickb.pickABusiness();
        assert pickb.getUrl().equals("https://buyme.co.il/money/752649?price=590");


    }

    @Test
    public void test04sendAndReceived() throws Exception {

        SenderAndReceiverInfo sai = new SenderAndReceiverInfo();
        sai.receiver();
        Assert.assertEquals(sai.getReceiverName(), "Sivan");
        sai.senderAndReceiver();
        Assert.assertEquals(sai.getSenderName(), "Sivan ");


    }

}
