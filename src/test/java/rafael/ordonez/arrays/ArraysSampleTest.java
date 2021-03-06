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

    @Test
    public void testShouldReturnMinusOneWhenTargetArrayIsEmpty() throws Exception {
        int result = ArraysSample.indexOfSubArray(new int[]{1}, new int[]{});

        assertEquals(-1, result);
    }

    @Test
    public void testShouldReturnZeroWhenTargetArrayIsAPrefix() throws Exception {
        int resultOneLengthArrays = ArraysSample.indexOfSubArray(new int[]{1}, new int[]{1});
        int resultLongest = ArraysSample.indexOfSubArray(new int[]{1,2,3}, new int[]{1,2});

        assertEquals(0, resultOneLengthArrays);
        assertEquals(0, resultLongest);
    }

    @Test
    public void testShouldReturnIndexPositionWhenTargetArrayIsASubList() throws Exception {
        int result = ArraysSample.indexOfSubArray(new int[]{1,2,3,4}, new int [] {2,3});

        assertEquals(1, result);
    }

    @Test
    public void testShouldReturnIndexPositionWhenTargetArrayIsASufix() throws Exception {
        int result = ArraysSample.indexOfSubArray(new int[] {1,2,3,4}, new int[] {3,4});

        assertEquals(2, result);
    }

    @Test
    public void testShouldReturnMinusOneWhenSourceArrayDoesNotContainTargetArray() throws Exception {
        int result = ArraysSample.indexOfSubArray(new int[]{1,2,3,4}, new int[]{2,3,5});

        assertEquals(-1, result);
    }

    @Test
    public void testShouldReturnMinusOneWhenTargetArrayContainsExtraElements() throws Exception {
        int result = ArraysSample.indexOfSubArray(new int[]{1,2,3,4}, new int[]{4,5});

        assertEquals(-1, result);
    }
}
