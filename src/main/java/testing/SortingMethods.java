package testing;

/**
 * @author Zbigniew Lemiesz
 */

public class SortingMethods {
    public void swap(int[] t, int j) {
        int temp = t[j];
        t[j] = t[j + 1];
        t[j + 1] = temp;
    }


    public int[] bubbles(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    swap(t, j);
                }
            }
        }
        return t;
    }

    public int[] insertion(int[] t) {
        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < i; j++) {
                if (t[j] > t[i]) {
                    int tmp = t[i];
                    for (int k = i - 1; k >= j; k--) {
                        t[k + 1] = t[k];
                    }
                    t[j] = tmp;
                    break;
                }
            }
        }
        return t;
    }

    public int[] insertion2nd(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int tmp = t[i];
            int j = i - 1;
            while (j >= 0 && tmp < t[j] ) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = tmp;
        }
        return t;
    }

}
