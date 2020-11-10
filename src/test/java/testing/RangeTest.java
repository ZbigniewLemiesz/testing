package testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    private Range range;

    @BeforeAll
    private static void startingRangeTestMessage() {
        System.out.println("Starting RangeTest");
    }

    @BeforeEach
    void setRange() {
        range = new Range(5, 15);
        System.out.println("Starting single test - set Range with bounds :" + range.getLowerBound() + " - " + range.getUpperBound());
    }


    @Test
    void shouldBeInRange() {
        assertTrue(range.isInRange(15));
    }

    @Test
    void getLowerBound() {
        assertEquals(range.getLowerBound(),5);
    }

    @Test
    void getUpperBound() {
        assertEquals(range.getUpperBound(),15);
    }

    @Test
    void IllegalArgumentExceptionWhenCreateRangeWithUpperBoundLowerThanLowerBound() {
        //Given
        long lowerBound = 10;
        long upperBound = 0;

        //When
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Range(lowerBound, upperBound));

        String expectedMessage = "Invalid bounds - upperBound has to be higher than lowerBound";
        String actualMessage = exception.getMessage();

        //Then
        assertTrue(actualMessage.contains(expectedMessage));

    }
}