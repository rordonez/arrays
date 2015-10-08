package rafael.ordonez.arrays;

/**
 * Created by rafa on 7/10/15.
 */
public class ArraysSample {
    public static int indexOfSubArray(int [] source, int [] target) {
        int result = -1;
        int j=0;
        boolean candidate = false;
        for(int i=0;i<source.length && j<target.length;i++) {
            candidate = source[i] == target[j];
            if(candidate) {
                if(result == -1) {
                    result = i;
                }
                j++;
            }
            else {
                j=0;
                result = -1;
            }
        }
        return candidate ? result : -1;
    }
}
