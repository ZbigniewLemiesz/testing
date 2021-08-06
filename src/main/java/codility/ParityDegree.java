/*
A positive integer N is given. The goal is to find the highest power of 2 that divides N.
        In other words, we have to find the maximum K for which N modulo 2^K is 0.
        For example, given integer N = 24 the answer is 3, because 2^3 = 8 is the highest power of 2 that divides N.
*/

package codility;




/**
 * @author Zbigniew Lemiesz
 */
public class ParityDegree {
    public int solution(int N) {
        int result = 0;
        while (N > 0) {
            if (N % 2 == 0) {
                result++;
                N = N / 2;
            } else {
                break;
            }
        }
        return result;
    }
}
