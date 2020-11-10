package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingCarsTest {
    PassingCars passingCars;

    @BeforeEach
    void setPassingCars(){
        passingCars = new PassingCars();
    }

    @Test
    void shouldReturnsNumberOfCars(){
        assertEquals(5, passingCars.solution(new int[] {0,1,0,1,1}));
    }
    @Test
    void shouldReturnsZero(){
        assertEquals(0, passingCars.solution(new int[] {1,1,0,0,0,0}));
    }

}