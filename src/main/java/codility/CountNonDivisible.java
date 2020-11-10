package codility;

import java.util.Arrays;

public class CountNonDivisible {
    public int[] solution(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int number = a[i];
            result[i] = (int) Arrays.stream(a).
                    filter(e -> number % e != 0).
                    count();
        }
        return result;
    }
}
