package codility;

import java.util.Arrays;

public class
PermMissingElem {
    public int solution(int[] a) {
        if (a.length == 0) {
            return 1;
        }
        if (a[0] != 1) {
            return 1;
        }

        if (a.length == 1) {
            return 2;
        }


        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] != 1) {
                return a[i] + 1;
            }
        }
        return a[a.length - 1] + 1;
    }

}
