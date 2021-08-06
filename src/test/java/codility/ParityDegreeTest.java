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
class parityDegreeTest {
    ParityDegree parityDegree;

    @BeforeEach
    void setParityDegree(){
        parityDegree = new ParityDegree();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnHighestPowerOf2(int number, int highestPowerOf2){
        assertEquals(highestPowerOf2,parityDegree.solution(number));

    }

    private static Stream<Arguments> argumentsProvider() {

        return Stream.of(
                Arguments.of(24,3),
                Arguments.of(12,2),
                Arguments.of(96,5),
                Arguments.of(15,0)
        );
    }

}