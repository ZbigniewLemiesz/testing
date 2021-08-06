package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zbigniew Lemiesz
 */
class ParkingBillTest {
    ParkingBill parkingBill;

    @BeforeEach
    void setParityDegree(){
        parkingBill = new ParkingBill();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnTotalCostOfParkingBill(String E, String L, int totalCost){
        assertEquals(totalCost,parkingBill.solution(E, L));
    }

    private static Stream<Arguments> argumentsProvider() {

        return Stream.of(
                Arguments.of("10:00", "10:00", 2),
                Arguments.of("10:00", "13:21", 17),
                Arguments.of("09:50", "10:21", 5),
                Arguments.of("09:42", "11:42", 9),
                Arguments.of("23:42", "01:42", 9),
                Arguments.of("23:42", "01:43", 13),
                Arguments.of("10:00", "11:21", 9)
        );
    }
}