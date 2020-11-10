package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GeonomicSOFTest {
    GeonomicSOF geonomicSOF;

    @BeforeEach
    void setGeonomicSOF(){
        geonomicSOF = new GeonomicSOF();
    }
    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsArrayOfMinimalImpact(int[] expected, String s, int[] p, int[] q) {
        assertArrayEquals(expected, geonomicSOF.solution(s, p, q));
    }


    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 4, 1}, "CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}),
                Arguments.of(new int[]{1, 4, 1}, "AAACTT", new int[]{2, 5, 0}, new int[]{3, 5, 5}),
                Arguments.of(new int[]{1}, "A", new int[]{0}, new int[]{0}),
                Arguments.of(new int[]{3, 3}, "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG" +
                        "GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG", new int[]{0, 200}, new int[]{500, 550}),
                Arguments.of(new int[]{2}, "C", new int[]{0}, new int[]{0})
        );
    }

}