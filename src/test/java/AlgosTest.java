import org.junit.Assert;
import org.junit.Test;

public class AlgosTest {
    @Test
    public void check1() {
        String str = "abbabbabbabbabb";
        String view = "babb";
        Assert.assertTrue(Algos.boyerMoore(str, view));
    }

    @Test
    public void check2() {
        String str = "abbabbabbabbabb";
        String view = "babbb";
        Assert.assertFalse(Algos.boyerMoore(str, view));
    }
}