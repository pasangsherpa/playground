// https://www.hackerrank.com/challenges/alternating-characters

import java.io.*;

public class Solution {
  private static int minNumberOfDeletion(String str) {
    char prev = '\u0000';
    int counter = 0;

    for (char c: str.toCharArray()) {
      if (c != prev) prev = c;
      else counter++;
    }

    return counter;
  }

  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfInputs = Integer.parseInt(br.readLine());

    for (int i = 0; i < numOfInputs; i++) {
      System.out.println(minNumberOfDeletion(br.readLine()));
    }
  }
}
