// https://www.hackerrank.com/challenges/pangrams

import java.io.*;

public class Solution {

  private static final int ALPHABETS_COUNT = 26;

  private static boolean isPangram (String str) {
    boolean isPangram = true;
    int length = str.length();

    if (length <= ALPHABETS_COUNT) return false;

    boolean[] alphabets = new boolean[ALPHABETS_COUNT];

    for (char c: str.toCharArray()) {
      int index = c - 'a'; // normalize ascii val to 0 based
      // enable bit in alphabets
      if (index >= 0 && index < ALPHABETS_COUNT) {
        alphabets[index] |= true;
      }
    }

    // if all 26 bits is set, it's pangram
    for (boolean alphabetPresent: alphabets) {
      isPangram &= alphabetPresent;
    }

    return isPangram;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toLowerCase();

    System.out.println(isPangram(str) ? "pangram" : "not pangram");
  }
}
