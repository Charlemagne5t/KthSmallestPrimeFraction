import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] arr = {1,2,3,5};
        int k = 3;
        int[] expected = {2,5};
        int[] actual = new Solution().kthSmallestPrimeFraction(arr,k);

        Assert.assertArrayEquals(expected, actual);
    }
}
