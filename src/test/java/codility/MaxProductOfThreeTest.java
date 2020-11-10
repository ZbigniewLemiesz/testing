package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {
    MaxProductOfThree maxProductOfThree;

    @BeforeEach
    void setMaxProductOfThree() {
        maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    void shouldReturnsMaxValueOfAnyTriplet() {
        assertEquals(60, maxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    void shouldReturnsMaxValueOfAnyTriplet2() {
        assertEquals(400, maxProductOfThree.solution(new int[]{-9, -10, 1, 2, -10, 4}));
    }

    @Test
    void shouldReturnsMaxValueOfAnyTriplet3() {
        assertEquals(105, maxProductOfThree.solution(new int[]{4, 7, 3, 2, 1, -3, -5}));
    }

}