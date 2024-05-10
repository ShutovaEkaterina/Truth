import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AccountTest {
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testValidName() {
        Account account = new Account("John Doe");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testCropName() {
        Account account = new Account("Jo");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testBigName() {
        Account account = new Account("Johann Vissmeisternamenananananananananan");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testNameWithSpaceInFront() {
        Account account = new Account(" Erndnmgk");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testNameWithSpaceInTheEnd() {
        Account account = new Account("Sasssk ");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testNameWithSpaceBetween() {
        Account account = new Account("Douee Salmon");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testNameWithMoreThenOneSpace() {
        Account account = new Account("Sisili  Falcon h");
        assertTrue(account.checkNameToEmboss());
    }
    @DisplayName("Like the first photo")
    @Description("This test is for liking the first photo on Mesto.")
    @Test
    public void testNameWithoutSpace() {
        Account account = new Account("Fartuk");
        assertTrue(account.checkNameToEmboss());
    }
}
