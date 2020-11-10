package codility;


public class TapeEquilibrium {
    public int findMinimalDifference(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        int[] leftSum = new int[a.length];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            leftSum[i] = sum;
        }
        int minDifference = 2_000;
        int currentDiff;
        for (int i = 0; i < leftSum.length - 1; i++) {
            currentDiff = Math.abs(2 * leftSum[i] - leftSum[leftSum.length - 1]);
            if (currentDiff < minDifference) {
                minDifference = currentDiff;
            }
        }
        return minDifference;

    }
}

//    A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
//
//        Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
//
//        The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
//
//        In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
//
//        For example, consider array A such that:
//
//        A[0] = 3
//        A[1] = 1
//        A[2] = 2
//        A[3] = 4
//        A[4] = 3
//        We can split this tape in four places:
//
//        P = 1, difference = |3 − 10| = 7
//        P = 2, difference = |4 − 9| = 5
//        P = 3, difference = |6 − 7| = 1
//        P = 4, difference = |10 − 3| = 7
//        Write a function:
//
//      class Solution { public int solution(int[] A); }
//
//      that, given a non-empty array A of N integers,
//      returns the minimal difference that can be achieved.