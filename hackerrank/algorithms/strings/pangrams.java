// https://www.hackerrank.com/challenges/pangrams

import java.io.*;

public class Solution {
  private static final byte ALPHABET_COUNT = 26;
  private static final byte ASCII_ALPHABET_OFFSET = 97;

  private static boolean isPangram (String str) {
    if (str.length() < ALPHABET_COUNT) return false;

    boolean isPangram = true;
    // initialized with all bits false
    boolean[] alphabetBitMap = new boolean[ALPHABET_COUNT];
    int index;

    for (char c: str.toCharArray()) {
      index = c - ASCII_ALPHABET_OFFSET; // normalize ascii val to 0 based
      // enable bit in alphabet
      if (index >= 0 && index < ALPHABET_COUNT) {
        alphabetBitMap[index] |= true;
      }
    }

    // if all 26 bits is set, it's pangram
    for (boolean alphabetPresent: alphabetBitMap) {
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
