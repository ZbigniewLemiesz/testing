package codility;

public class MissingInteger {

    public int solution(int[] a) {
        int[] positiveValues = new int[1_000_000];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positiveValues[a[i] - 1] = 1;
            }
        }
        for (int i = 0; i < positiveValues.length-1; i++) {
            if (positiveValues[i] == 0) {
                return i + 1;
            }
        }
        return positiveValues.length;
    }
}


//    This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
