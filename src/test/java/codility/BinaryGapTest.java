package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    BinaryGap binaryGap;

    @BeforeEach
    void setBinaryGap(){
        binaryGap = new BinaryGap();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsLengthLongestBinaryGap(int number, int longestGap){
        assertEquals(longestGap,binaryGap.solution(number));

    }

    private static Stream<Arguments> argumentsProvider() {

        return Stream.of(
                Arguments.of(1041,5),
                Arguments.of(529,4),
                Arguments.of(32,0)
        );
    }

}