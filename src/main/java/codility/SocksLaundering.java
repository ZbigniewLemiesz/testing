package codility;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Zbigniew Lemiesz
 */
public class SocksLaundering {
    public int solution(int K, int[] C, int[] D) {
        int result = 0;
        int[] countedC = new int[51];
        int[] countedD = new int[51];
        for (int j : C) {
            countedC[j]++;
        }
        for (int k : D) {
            countedD[k]++;
        }
        for (int i = 0; i < countedC.length; i++) {
            result += countedC[i] / 2;
            countedC[i] = countedC[i] % 2;
        }
        for (int i = 0; i < countedC.length; i++) {
            if (K == 0) {
                return result;
            }
            if (countedC[i] == 1 && countedD[i] > 0) {
                result++;
                countedC[i]--;
                countedD[i]--;
                K--;
            }
        }
        for (int j = 0; j < countedD.length; j++) {
            if (K < 2) {
                return result;
            }

            if (countedD[j] > 1) {
                int pairObtainable = (countedD[j] < K) ? countedD[j] / 2 : K / 2;
                result += pairObtainable;
                K -= pairObtainable * 2;
                countedD[j] -= pairObtainable * 2;
            }

        }
        return result;
    }

    public void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + " ");
        }
        System.out.println();
    }


}
