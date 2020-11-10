package codility;

import java.util.Arrays;

public class Triangular {
    public int solution(int[] a) {
        int[] positiveValues = Arrays.stream(a).
                filter(e -> e >= 0).
                sorted().
                toArray();

        if (positiveValues.length < 3) {
            return 0;
        }
        for (int i = 0; i < positiveValues.length - 2; i++) {
            if (positiveValues[i] + positiveValues[i + 1] > positiveValues[i + 2]) {
                return 1;
            }
        }

        return 0;
    }

    public int solutionForCodility(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        Arrays.sort(a);
        for (int i = a.length; i > 2; i--) {
            if (a[i - 3] < 0) {
                return 0;
            }
            if (a[i - 2] + a[i - 3] > a[i - 1]) {
                return 1;
            }
        }

        return 0;
    }

    public int solutionForCodility2(int[] a) {
        if (a.length < 3) {
            return 0;
        }

        Arrays.sort(a);

        if (a.length == 3) {
            if (a[0] > 0 && a[0]  > a[2] - a[1]) {
                return 1;
            }
            return 0;
        }


        for (int i = a.length; i > 2; i--) {
            if (a[i - 3] < 0) {
                return 0;
            }
            if (a[i - 2] > a[i - 1] - a[i - 3]) {
                return 1;
            }
        }

        return 0;
    }
}
