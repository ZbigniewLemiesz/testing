/*
Given two integers A and B, return a string which contains A letters "a" and B letters "b"
with no three consecutive letters being the same.
*/
package codility;

/**
 * @author Zbigniew Lemiesz
 */

class ThreeLetters {
    public String solution(int A, int B) {
        StringBuilder sb = new StringBuilder();
        int g,s;
        boolean isFirstA = true;
        if (A >= B){
            g = A;
            s = B;
        } else{
            g = B;
            s = A;
            isFirstA = false;
        }
        while(g>0 || s>0){
            if (g>s){
                if(s>0){
                    if(isFirstA){
                        sb.append("aab");
                    }else{
                        sb.append("bba");
                    }
                    g-= 2;
                    s--;
                }else{
                    if(isFirstA){
                        sb.append("a");
                    }else{
                        sb.append("b");
                    }
                    g--;
                }

            }else{
                if(isFirstA){
                    sb.append("ab");
                }else{
                    sb.append("ba");
                }
                g--;
                s--;
            }
        }
        return sb.toString();
    }
}