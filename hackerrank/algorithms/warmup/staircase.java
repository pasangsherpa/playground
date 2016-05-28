// https://www.hackerrank.com/challenges/staircase

import java.util.*;

public class Solution {
  private static void drawStairCase(int n) {
    final String format = "%" + n + "s\n";
    StringBuilder sb = new StringBuilder("#");

    for (int i = 0; i < n; i++) {
      System.out.print(String.format(format, sb));
      sb.append("#");
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    drawStairCase(n);
  }
}
