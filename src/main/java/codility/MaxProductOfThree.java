package codility;

import java.util.Arrays;


public class MaxProductOfThree {
    public int solution(int[] a) {
        Arrays.sort(a);
        if (a[0] * a[1] > a[a.length - 2] * a[a.length - 3] && a[a.length - 1] > 0) {
            return a[0] * a[1] * a[a.length - 1];
        }

        return a[a.length - 1] * a[a.length - 2] * a[a.length - 3];
    }
}
