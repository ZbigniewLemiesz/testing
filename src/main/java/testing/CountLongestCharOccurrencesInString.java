package testing;

public class CountLongestCharOccurrencesInString {
    String displayOccurrences(String s) {
        StringBuilder sb = new StringBuilder();
        int mOcc = 1, tmp = 1;
        char mChar = s.charAt(0), tmpChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != tmpChar) {
                if (tmp > mOcc) {
                    mOcc = tmp;
                    mChar = tmpChar;
                }
                tmpChar = s.charAt(i);
                tmp = 1;
            } else tmp++;
        }if (tmp > mOcc) {
            mOcc = tmp;
            mChar = tmpChar;
        }
        return sb.append(mChar).append(" ").append(mOcc).toString();
    }
}
