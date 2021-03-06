package testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Zbigniew Lemiesz
 */
class SortingMethodsTest {
    private SortingMethods sortingMethods;


    static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{3}, new int[]{3}),
                Arguments.of(new int[]{3, 0}, new int[]{0, 3}),
                Arguments.of(new int[]{3, -1, -4, 2, 2, 20}, new int[]{-4, -1, 2, 2, 3, 20}),
                Arguments.of(new int[]{1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}),
                Arguments.of(new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}),
                Arguments.of(new int[]{3, 1, 4, 2}, new int[]{1, 2, 3, 4})
        );
    }

    @BeforeEach
    void setSortingMethods() {
        sortingMethods = new SortingMethods();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnSortedArrayByBubbles(int[] given, int[] expected) {
        sortingMethods.bubbles(given);
        assertArrayEquals(expected, given);
    }


    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnSortedArrayByInsertion(int[] given, int[] expected) {
        sortingMethods.insertion(given);
        assertArrayEquals(expected,given);
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnSortedArrayBySelection(int[] given, int[] expected) {
        sortingMethods.selection(given);
        assertArrayEquals(expected, given);
    }
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnSortedArrayByQuickSort(int[] given, int[] expected) {
        sortingMethods.quickSort(given);
        assertArrayEquals(expected, given);
    }
}