// https://www.hackerrank.com/challenges/diagonal-difference

import java.util.*;

public class Solution {
  private static int getAbsoluteDiagonalDiff(int[][] matrix) {
    int primarySum, secondarySum;
    primarySum = secondarySum = 0;

    for (int i = 0; i < matrix.length; i++) {
      primarySum += matrix[i][i];
      secondarySum += matrix[i][matrix.length - 1 - i];
    }

    return Math.abs(primarySum - secondarySum);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    final int matrix[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = in.nextInt();
      }
    }

    System.out.print(getAbsoluteDiagonalDiff(matrix));
  }
}
