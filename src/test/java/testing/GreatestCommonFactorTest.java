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
class GreatestCommonFactorTest {
    GreatestCommonFactor greatestCommonFactor = new GreatestCommonFactor();

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(24, 18, 6),
                Arguments.of(8, 6, 2),
                Arguments.of(100, 25, 25),
                Arguments.of(81, 27, 27)
        );
    }

    @BeforeEach
    void setNumberWeight() {
        greatestCommonFactor = new GreatestCommonFactor();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnGreatestCommonFactor(int given1, int given2, int expected) {
        assertEquals(expected, greatestCommonFactor.gcf(given1, given2));
    }

}