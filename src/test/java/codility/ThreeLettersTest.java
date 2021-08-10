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
class ThreeLettersTest {

    ThreeLetters threeLetters = new ThreeLetters();

    private static Stream<Arguments> argumentsProvider() {

        return Stream.of(
                Arguments.of(0, 0, ""),
                Arguments.of(1, 0, "a"),
                Arguments.of(0, 2, "bb"),
                Arguments.of(3, 7, "bbabbabbab"),
                Arguments.of(6, 2, "aabaabaa")
        );
    }

    @BeforeEach
    void setParityDegree() {
        threeLetters = new ThreeLetters();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnStringWithNoThreeConsecutiveLettersBeingTheSame(int a, int b, String solution) {
        assertEquals(solution, threeLetters.solution(a, b));
    }
}