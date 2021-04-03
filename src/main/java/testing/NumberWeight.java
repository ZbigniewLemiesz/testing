package testing;

/**
 * @author Zbigniew Lemiesz
 */
public class NumberWeight {

    public int countNumberWeight(int number) {
        if (number < 9) {
            return number;
        }
        boolean isOnlyOneDigitInNumber = false;
        int result = 0;
        while (!isOnlyOneDigitInNumber) {
            while (number != 0) {
                result += number % 10;
                number = number / 10;
            }
            if (result > 9) {
                number = result;
                result = 0;
            } else {
                isOnlyOneDigitInNumber = true;
            }
        }
        return result;
    }
}
