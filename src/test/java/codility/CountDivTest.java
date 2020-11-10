package codility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {


    @Test
    void shouldReturnsNumberIntegersDivisibleByK() {
        assertEquals(3, (new CountDiv()).solution(6, 11, 2));

    }

    @Test
    void shouldReturns0() {
        assertEquals(0, (new CountDiv()).solution(1, 3, 4));

    }

    @Test
    void shouldReturns1() {
        assertEquals(1, (new CountDiv()).solution(5, 7, 2));

    }
    @Test
    void shouldReturns2() {
        assertEquals(2, (new CountDiv()).solution(9, 12, 3));

    }
    @Test
    void shouldReturns4() {
        assertEquals(4, (new CountDiv()).solution(1, 84, 17));

    }

    @Test
    void shouldReturns20() {
        assertEquals(20, (new CountDiv()).solution(11, 345, 17));

    }

    @Test
    void shouldReturns17() {
        assertEquals(18, (new CountDiv()).solution(49, 345, 17));

    }

}