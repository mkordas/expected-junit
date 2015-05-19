import org.junit.Test;

public class ExpectedExceptionTest {
    @Test(expected = IllegalStateException.class)
    public void testExpected() {
        throw new IllegalStateException();
    }
}
