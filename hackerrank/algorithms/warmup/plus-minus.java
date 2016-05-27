// https://www.hackerrank.com/challenges/plus-minus

import java.util.*;

public class Solution {
  private static void fractionCount(int[] nums) {
    int totalCount = nums.length;
    int positiveCount, negativeCount, zeroCount;
    positiveCount = negativeCount = zeroCount = 0;

    for (int num : nums) {
      if (num == 0) zeroCount++;
      else if (num > 0) positiveCount++;
      else negativeCount++;
    }

    System.out.println(String.format("%.6f", (float) positiveCount / totalCount));
    System.out.println(String.format("%.6f", (float) negativeCount / totalCount));
    System.out.println(String.format("%.6f", (float) zeroCount / totalCount));
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    fractionCount(arr);
  }
}
