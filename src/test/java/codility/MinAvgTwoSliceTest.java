package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {
    MinAvgTwoSlice minAvgTwoSlice;

    @BeforeEach
    void setMinAvgTwoSlice() {
        minAvgTwoSlice = new MinAvgTwoSlice();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsStartingPositionWithMinimalAverage(int expected, int[] a) {
        assertEquals(expected, minAvgTwoSlice.solution(a));
    }

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
//                Arguments.of(0, new int[]{2, -2, 5, 0, 1, 1}),
                Arguments.of(1, new int[]{4, 2, 2, 5, 1, 5, 8}),
  //              Arguments.of(2, new int[]{5, 6, 3, 4, 9}),
               Arguments.of(0, new int[]{0, 1, 1, 1})
        );
    }

}