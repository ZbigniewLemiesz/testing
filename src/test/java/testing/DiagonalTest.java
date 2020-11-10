package testing;

import org.junit.jupiter.api.Test;


class DiagonalTest {



    @Test
    void shouldSeeDiagonal(){

        Diagonal.showDiagonal(new Diagonal(5).createAndPopulateArrayDiagonal());

    }

}