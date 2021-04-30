package testing;

/**
 * @author Zbigniew Lemiesz
 */
public class GreatestCommonFactor {

    public int gcf(int k, int n) {
        if(k==0) return n;
        return gcf((n % k), k);
    }
}

