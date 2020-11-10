package testing;

public class Diagonal {
    int sizeSquare;


    public Diagonal(int sizeSquare) {
        this.sizeSquare = sizeSquare;
    }


    char[][] createAndPopulateArrayDiagonal() {
        char[][] diagonal = new char[sizeSquare][sizeSquare];
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (j == i) {
                    diagonal[i][j] = 'X';
                } else {
                    diagonal[i][j] = '-';
                }

            }
        }
        return diagonal;
    }


    public static void showDiagonal(char[][] diagonal) {
        for (char[] chars : diagonal) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.print('\n');
        }
    }

}


