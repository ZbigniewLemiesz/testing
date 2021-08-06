package codility;

import java.time.Duration;
import java.time.LocalTime;

/**
 * @author Zbigniew Lemiesz
 */
public class ParkingBill {
    public int solution(String E, String L) {
        LocalTime entry = LocalTime.parse(E);
        LocalTime exit = LocalTime.parse(L);
        Duration duration = Duration.between(entry, exit);
        int entranceFee = 2;
        int firstHour = 3;
        int secondAndNextHour = 4;
        double minutes = duration.toMinutes();
        int fullAndPartialHour = (int) Math.ceil(minutes/60);
        System.out.println(fullAndPartialHour);
        int result = entranceFee;
        if(fullAndPartialHour<0){
            fullAndPartialHour+=24;
        }
        if (fullAndPartialHour > 0 && fullAndPartialHour <= 1) {
            result += firstHour;
        }
        System.out.println("next Day: "+fullAndPartialHour);
        if (fullAndPartialHour > 1) {
            result += firstHour + secondAndNextHour * (fullAndPartialHour - 1);
        }
        return result;
    }
}
