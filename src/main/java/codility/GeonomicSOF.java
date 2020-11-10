package codility;

public class GeonomicSOF {
    public int[] solution(String s, int[] p, int[] q) {

        int[][] impacts = new int[3][s.length() + 1];
        short a, c, g;
        for (int i = 0; i < s.length(); i++) {
            a = 0;
            c = 0;
            g = 0;
            if ('A' == (s.charAt(i))) {
                a = 1;
            }
            if ('C' == (s.charAt(i))) {
                c = 1;
            }
            if ('G' == (s.charAt(i))) {
                g = 1;
            }

            impacts[0][i + 1] = impacts[0][i] + a;
            impacts[1][i + 1] = impacts[1][i] + c;
            impacts[2][i + 1] = impacts[2][i] + g;
        }

        int[] result = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            int fromIndex = p[i];
            int toIndex = q[i] + 1;
            if (impacts[0][toIndex] - impacts[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (impacts[1][toIndex] - impacts[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (impacts[2][toIndex] - impacts[2][fromIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }
}
