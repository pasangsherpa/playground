// https://www.hackerrank.com/challenges/a-very-big-sum

import java.util.*;

public class Solution {
  private static int addBigNumbers(int[] arr) {
    long sum = 0;
    // loop and add all elements
    for (int num: arr) sum += num;

    return sum;
  }

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();

    final int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println(addBigNumbers(arr));
  }
}
