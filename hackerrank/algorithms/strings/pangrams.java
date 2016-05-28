// https://www.hackerrank.com/challenges/pangrams

import java.io.*;

public class Solution {

  private static final int ALPHABET_COUNT = 26;

  private static boolean isPangram (String str) {
    if (str.length() < ALPHABET_COUNT) return false;

    boolean isPangram = true;
    // initialized with all bits false
    boolean[] alphabet = new boolean[ALPHABET_COUNT];

    for (char c: str.toCharArray()) {
      int index = c - 'a'; // normalize ascii val to 0 based
      // enable bit in alphabet
      if (index >= 0 && index < ALPHABET_COUNT) {
        alphabet[index] |= true;
      }
    }

    // if all 26 bits is set, it's pangram
    for (boolean alphabetPresent: alphabet) {
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
