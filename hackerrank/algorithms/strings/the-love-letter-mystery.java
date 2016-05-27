// https://www.hackerrank.com/challenges/the-love-letter-mystery

import java.io.*;

public class Solution {
  private static int minOperationsPalindrome(String str) {
    final char[] chars = str.toCharArray();
    int counter = 0;
    char tmp;

    for (int i = 0; i < chars.length / 2; i++) {
      tmp = chars[chars.length - 1 - i];
      if (chars[i] > tmp) {
        counter += chars[i] - tmp;
      } else if (chars[i] < tmp) {
        counter += tmp - chars[i];
      }
    }

    return counter;
  }

  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfInputs = Integer.parseInt(br.readLine());

    for (int i = 0; i < numOfInputs; i++) {
      System.out.println(minOperationsPalindrome(br.readLine()));
    }
  }
}
