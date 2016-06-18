/**
 * Given two dimen­sional matrix, write an algo­rithm to
 * print all the diag­o­nals of matrix.
 *
 * Input:
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 *
 * Output:
 * 1
 * 5  2
 * 9  6  3
 * 13 10 7 4
 * 14 11 8
 * 15 12
 * 16
 */

public class Matrix {
  int[][] elements;

  public Matrix(int[][] elements) {
    this.elements = elements;
  }

  public void printAllDiagonals() {
    /**
     * 00, 01, 02, 03
     * 10, 11, 12, 13
     * 20, 21, 22, 23
     * 30, 31, 32, 33
     */

    int tmp, row, col;
    for (row = 0; row < elements.length; row++) {
      tmp = row;
      for (col = 0; col <= row; col++) {
        System.out.print(elements[tmp][col] + " ");
        tmp--;
      }
      System.out.println();
    }

    for (col = 1; col < elements.length; col++) {
      tmp = col;
      for (row = elements.length - 1; row >= col; row--) {
        System.out.print(elements[row][tmp] + " ");
        tmp++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] elements = {
      { 1,  2,  3,  4 },
      { 5,  6,  7,  8 },
      { 9,  10, 11, 12 },
      { 13, 14, 15, 16 }
    };

    Matrix m = new Matrix(elements);
    m.printAllDiagonals();
  }
}
