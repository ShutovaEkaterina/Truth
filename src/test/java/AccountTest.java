import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AccountTest {
    @Test
    public void testValidName() {
        Account account = new Account("John Doe");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testCropName() {
        Account account = new Account("Jo");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testBigName() {
        Account account = new Account("Johann Vissmeisternamenananananananananan");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithSpaceInFront() {
        Account account = new Account(" Erndnmgk");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithSpaceInTheEnd() {
        Account account = new Account("Sasssk ");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithSpaceBetween() {
        Account account = new Account("Douee Salmon");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithMoreThenOneSpace() {
        Account account = new Account("Sisili  Falcon h");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testNameWithoutSpace() {
        Account account = new Account("Fartuk");
        assertTrue(account.checkNameToEmboss());
    }
}
