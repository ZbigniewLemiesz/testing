package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CountLongestCharOccurrencesInStringTest {
    private CountLongestCharOccurrencesInString occurrences;

    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of("xxxx", "x 4"),
                Arguments.of("xyy","y 2"),
                Arguments.of("x", "x 1"),
                Arguments.of("xxyyyzzz", "y 3"),
                Arguments.of("xyz", "x 1")
        );
    }

    @BeforeEach
    void setNumberWeight() {
        occurrences = new CountLongestCharOccurrencesInString();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnCountLongestCharOccurrencesInStringTest(String given, String expected) {
        assertEquals(expected, occurrences.displayOccurrences(given));
    }

}