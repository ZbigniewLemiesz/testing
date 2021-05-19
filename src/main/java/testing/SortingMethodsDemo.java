package testing;

import java.util.Random;

/**
 * @author Zbigniew Lemiesz
 */
public class SortingMethodsDemo {
    public static void main(String[] args) {

        Random random = new Random();
        final int N = 100_000;
        int[] arrayToSort = new int[N];
        for (int i = 0; i < arrayToSort.length; i++) {
            arrayToSort[i] = random.nextInt(1000);
        }
        int[] arrayToQuickSort = arrayToSort.clone();

        SortingMethods sortingMethods = new SortingMethods();
        long start = System.currentTimeMillis();
        sortingMethods.quickSort(arrayToQuickSort);
        System.out.println("\nQuickSort= " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        sortingMethods.bubbles(arrayToSort);
        System.out.println("\nBubbleSort= " + (System.currentTimeMillis() - start));
    }
}
