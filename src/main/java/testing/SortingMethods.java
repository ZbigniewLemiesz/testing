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


    public void bubbles(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    swap(t, j);
                }
            }
        }
    }

    public void selection(int[] t) {
        int min, i, j, temp;
        for (i = 0; i < t.length; i++) {
            min = i;
            for (j = i + 1; j < t.length; j++) {
                if (t[j] < t[min]) {
                    min = j;
                }
            }
            temp = t[min];
            t[min] = t[i];
            t[i] = temp;
        }
    }

    public void insertion(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int tmp = t[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (t[j] > tmp) {
                    t[j + 1] = t[j];
                } else
                    break;
            }
            t[j + 1] = tmp;
        }
        //return t;
    }

    public int[] insertion2nd(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int tmp = t[i];
            int j = i - 1;
            while (j >= 0 && tmp < t[j]) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = tmp;
        }
        return t;
    }
}
