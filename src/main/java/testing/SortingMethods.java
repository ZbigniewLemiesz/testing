package testing;

/**
 * @author Zbigniew Lemiesz
 */

public class SortingMethods {
    public void swap(int[] t, int i, int k) {
        int temp = t[i];
        t[i] = t[k];
        t[k] = temp;
    }


    public void bubbles(int[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[j] > t[j + 1]) {
                    swap(t, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) break;
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
    }

    public void insertion2nd(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int tmp = t[i];
            int j = i - 1;
            while (j >= 0 && tmp < t[j]) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = tmp;
        }
    }

    public void quickSort(int[] a) {
        quickSortRecursion(a, 0, a.length-1);
    }

    public void quickSortRecursion(int[] array, int first, int last) {
        if (first >= last) return;
        int pivotValue = array[last];
        int border = first - 1;
        int i = first;
        while (i < last) {
            if (array[i] < pivotValue) {
                border++;
                if (border != i) {
                    swap(array, border, i);
                }
            }
            i++;
        }
        border++;
        if (border != i) {
            swap(array, border, last);
        }
        quickSortRecursion(array, first, border -1);
        quickSortRecursion(array, border+1, last);
    }
}
