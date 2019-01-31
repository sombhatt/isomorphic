import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsomorphicTests {

    private static IIsomorphic isomorphic;



    @DataProvider(name = "IsomorphicInputs")
    public static Object[][] validInputs() {
        return new Object[][]{{"aab", "xxy"}, {"egg", "add"}, {"abc", "xyz"}};
    }

    @DataProvider(name = "IsomorphicInvalidInputs")
    public static Object[][] invalidInputs() {
        return new Object[][]{{"aab", "xyz"}, {"abc", "xzz"}};
    }

    @Test(dataProvider = "IsomorphicInputs")
    public void testValidInputs(String input1, String input2) {
        isomorphic = new Isomorphic();
        Assert.assertEquals(isomorphic.areIsomorphic(input1, input2), true);
    }

    @Test(dataProvider = "IsomorphicInvalidInputs")
    public void testInvalidInputs(String input1, String input2) {
        isomorphic = new Isomorphic();
        Assert.assertEquals(isomorphic.areIsomorphic(input1, input2), false);
    }
}
