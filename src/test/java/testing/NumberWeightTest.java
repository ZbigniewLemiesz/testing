package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Zbigniew Lemiesz
 */
class NumberWeightTest {

    private NumberWeight numberWeight;

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(125, 8),
                Arguments.of(999999999, 9),
                Arguments.of(1234567895, 5),
                Arguments.of(1, 1),
                Arguments.of(1000000009, 1),
                Arguments.of(1000000000, 1),
                Arguments.of(999999991, 1)
        );
    }

    @BeforeEach
    void setNumberWeight() {
        numberWeight = new NumberWeight();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnNumberWeight(int given, int expected) {
        assertEquals(expected, numberWeight.countNumberWeight(given));
    }
}