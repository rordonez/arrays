package rafael.ordonez.arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rafa on 6/10/15.
 */
public class ArraysSampleTest {

    @Test
    public void testReturnMinusOneWhenSourceArrayLengthIsZero() throws Exception {

        int result = ArraysSample.indexOfSubArray(new int[]{}, new int[]{});
        int resultWithNonEmptyTarget = ArraysSample.indexOfSubArray(new int[]{}, new int[]{1});

        assertEquals(-1, result);
        assertEquals(-1, resultWithNonEmptyTarget);
    }
}
