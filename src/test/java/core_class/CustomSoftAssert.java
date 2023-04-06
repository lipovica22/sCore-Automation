package core_class;

import org.testng.asserts.SoftAssert;

public class CustomSoftAssert extends SoftAssert {
    @Override
    public void assertAll() {
        try {
            super.assertAll();
        } catch (AssertionError e) {
            throw new RuntimeException(e);
            //Assertions.fail(e.getMessage());
        }
    }
}
