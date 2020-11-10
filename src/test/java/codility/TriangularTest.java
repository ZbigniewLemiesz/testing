package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangularTest {
    Triangular triangular;

    @BeforeEach
    void setTriangular() {
        triangular = new Triangular();
    }


    @Test
    void shouldReturnsOnIfExistsTriangularTriplet() {
        assertEquals(1, triangular.solution(new int[]{5, 3, 3}));
    }

    @Test
    void shouldReturnsOnIfExistsTriangularTriplet2() {
        assertEquals(1, triangular.solutionForCodility(new int[]{5, 3, 3}));
    }

    @Test
    void shouldReturnsOnIfExistsTriangularTriplet3() {
        assertEquals(1, triangular.solutionForCodility2(new int[]{5, 3, 3}));
    }

    @Test
    void shouldReturnsOnIfExistsTriangularTripletMaxInst() {
        assertEquals(1, triangular.solutionForCodility2(new int[]{2_147_483_645, 2_147_483_646, 2_147_483_647}));


    }
}