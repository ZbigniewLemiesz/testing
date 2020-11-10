package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {
    CyclicRotation cyclicRotation;

    @BeforeEach
    void setCyclicRotation() {
        cyclicRotation = new CyclicRotation();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsArrayRotatedKTimes(int [] given, int numberRotations, int [] expected) {
        for (int i =0; i< given.length; i++){
            assertEquals(expected[i],cyclicRotation.solution(given,numberRotations)[i]);
        }

    }

    private static Stream<Arguments> argumentsProvider(){
        return Stream.of(
                Arguments.of(new int[]{3, 8, 9, 7, 6}, 3, new int[]{9, 7, 6, 3, 8}),
                Arguments.of(new int[]{0,0,0}, 1, new int[] {0,0,0}),
                Arguments.of(new int[]{1,2,3}, 2, new int[] {2,3,1})

        );
    }
}