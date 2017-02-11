package euclidean;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTest {

    private final int a = 40902;
    private final int b = 24140;
    private final int expectedResult = 34;

    @Test
    public void simpleTest() {
        int actualResult = GreatestCommonDivisor.find(a, b);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void negativeTest() {
        int actualResult = GreatestCommonDivisor.find(-a, -b);
        Assert.assertEquals(-expectedResult, actualResult);
    }

    /**
     * Given a binary operation, an element for the operation is a value for which the operation,
     * when given that value for both of its operands, gives that value as the result.
     */
    @Test
    public void idempotenceTest() {
        int actualResult = GreatestCommonDivisor.find(a, a);
        Assert.assertEquals(actualResult, a);
    }

    /**
     * An operation is commutative if changing the order of the operands does not change the result.
     */
    @Test
    public void commutativeTest() {
        int result1 = GreatestCommonDivisor.find(a, b);
        int result2 = GreatestCommonDivisor.find(b, a);
        Assert.assertEquals(result1, result2);
    }

    /**
     * Within an expression containing two or more occurrences in a row of the same associative operator,
     * the order in which the operations are performed does not matter
     * as long as the sequence of the operands is not changed.
     */
    @Test
    public void associativeTest() {
        final int c = 3125;

        int result1 = GreatestCommonDivisor.find(GreatestCommonDivisor.find(a, b), c);
        int result2 = GreatestCommonDivisor.find(a, GreatestCommonDivisor.find(b, c));

        Assert.assertEquals(result1, result2);
    }

}
