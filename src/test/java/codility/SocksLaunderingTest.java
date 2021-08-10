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
class SocksLaunderingTest {
    SocksLaundering socksLaundering;

    private static Stream<Arguments> argumentsProvider() {

        return Stream.of(
                Arguments.of(3, 5, new int[]{1, 1, 3, 4}, new int[]{3, 3, 3, 5}),
                Arguments.of(4, 4, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(3, 3, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(4, 10, new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
                Arguments.of(3, 2, new int[]{1, 2, 1, 1}, new int[]{1, 4, 3, 2, 4}),
                Arguments.of(3, 3, new int[]{1, 1, 1}, new int[]{1, 2, 2}),
                Arguments.of(1, 0, new int[]{1, 1, 1}, new int[]{1, 2, 2}),
                Arguments.of(0, 0, new int[]{1, 2, 3}, new int[]{4, 5, 4}),
                Arguments.of(1, 2, new int[]{1, 2, 3}, new int[]{4, 5, 4}),
                Arguments.of(1, 0, new int[]{3, 2, 3}, new int[]{4, 5, 4}),
                Arguments.of(1, 2, new int[]{3, 2, 1}, new int[]{4, 4}),
                Arguments.of(1, 2, new int[]{}, new int[]{4, 4}),
                Arguments.of(1, 2, new int[]{4, 4}, new int[]{3, 2, 1}),
                Arguments.of(1, 0, new int[]{4, 4}, new int[]{}),
                Arguments.of(1, 10, new int[]{1}, new int[]{1}),
                Arguments.of(5, 20, new int[]{}, new int[]{3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5}),
                Arguments.of(2, 2, new int[]{3, 3, 3}, new int[]{3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5}),
                Arguments.of(4, 5, new int[]{3, 3, 3}, new int[]{3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5}),
                Arguments.of(3, 4, new int[]{3, 5, 5}, new int[]{3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5}),
                Arguments.of(5, 10, new int[]{3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 5}, new int[]{}),
                Arguments.of(5, 10, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, new int[]{}),
                Arguments.of(11, 11, new int[]{5, 5, 5, 5, 5, 1, 5, 5, 5, 5, 5}, new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1}),
                Arguments.of(4,4, new int[]{ 5, 5, 5, 7}, new int[]{ 5, 7, 7, 7, 7})
        );
    }

    @BeforeEach
    void setSocksLaundering() {
        socksLaundering = new SocksLaundering();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnMaximumNumberPairsSocks(int result, int K, int[] C, int[] D) {
        assertEquals(result, socksLaundering.solution(K, C, D));
    }

}