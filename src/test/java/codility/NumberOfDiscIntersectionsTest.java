package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDiscIntersectionsTest {
    NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeEach
    void setNumberOfDiscIntersections() {
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @Test
    void shouldReturnsNumberOfDiscIntersections() {
        assertEquals(11, numberOfDiscIntersections.solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    @Test
    void shouldReturnsNumberOfDiscIntersections2() {
        assertEquals(5, numberOfDiscIntersections.solution(new int[]{1, 1, 1, 1}));
    }

    @Test
    void shouldReturnsNumberOfDiscIntersections3() {
        assertEquals(2, numberOfDiscIntersections.solution(new int[]{1, 1, 0}));
    }


    @Test
    void shouldReturnsNumberOfDiscIntersections4() {
        assertEquals(1, numberOfDiscIntersections.solution(new int[]{1, 0, 0}));
    }

    @Test
    void shouldReturnsNumberOfDiscIntersections5() {
        assertEquals(2, numberOfDiscIntersections.solution(new int[]{3, 0, 0}));
    }
    @Test
    void shouldReturnsNumberOfDiscIntersections6() {
        assertEquals(2, numberOfDiscIntersections.solution(new int[]{1, 2147483647, 0}));
    }
}