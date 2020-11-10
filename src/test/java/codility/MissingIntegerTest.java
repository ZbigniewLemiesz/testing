package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {
    private MissingInteger missingInteger;


    @BeforeEach
    void setup() {
        missingInteger = new MissingInteger();
    }

    @Test
    void shouldReturnsSmallestPositiveIntegerThatDoesntOccurInArray() {
        // Given
        int[] ints = {1, 3, 6, 4, 1, 2};
        //When
        int smallest = missingInteger.solution(ints);
        //Then
        assertEquals(5, smallest);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsSmallestPositiveIntegerThatDoesntOccurInArray_Parametrized(int[] array, int smallest) {

        assertEquals(smallest, missingInteger.solution(array));
    }


    private static Stream<Arguments> argumentsProvider() {
        int[] a = {1, 3, 6, 4, 1, 2};
        int[] b = {-1, -3, -6, -4, 0};
        int[] c = {1, 2, 3};
        return Stream.of(
                Arguments.of(new int[]{3, 3, 6, 4, 5, 1_000}, 1),
                Arguments.of(new int[]{4, 5, 6, 2}, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 6),
                Arguments.of(new int[]{2, 3}, 1),
                Arguments.of(a, 5),
                Arguments.of(b, 1),
                Arguments.of(c, 4)
        );
    }
}