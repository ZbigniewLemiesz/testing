package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {
    OddOccurrencesInArray oddOccurrencesInArray;

    @BeforeEach
    void setOddOccurrencesInArray(){
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void shouldReturnsValueOfUnpairedElement(int [] given, int expected){
        assertEquals(expected,oddOccurrencesInArray.solution(given));
    }

    static Stream<Arguments> argumentsProvider(){
        return Stream.of(
          Arguments.of(new int[]{11,11,12},12),
          Arguments.of(new int[]{11,12,12},11),
          Arguments.of(new int[]{11,5,5,4,4,3,3,12,12},11),
          Arguments.of(new int[]{11,4,11,12,12},4)

        );
    }


}