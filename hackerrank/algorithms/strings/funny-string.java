// https://www.hackerrank.com/challenges/funny-string

import java.io.*;

public class Solution {
  private static boolean isFunny(String str) {
    boolean isFunny = true;
    int diffA, diffB;
    int length = str.length() - 1;

    for (int i = 1; i <= length; i++) {
      diffA = Math.abs(str.charAt(i) - str.charAt(i - 1));
      diffB = Math.abs(str.charAt(length - i) - str.charAt(length + 1 - i));
      isFunny &=  diffA == diffB;
    }

    return isFunny;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfStrings = Integer.parseInt(br.readLine());

    boolean isFunnyString = false;
    for (int i = 0; i < numOfStrings; i++) {
      isFunnyString = isFunny(br.readLine());
      System.out.println(isFunnyString ? "Funny" : "Not Funny");
    }
  }
}
