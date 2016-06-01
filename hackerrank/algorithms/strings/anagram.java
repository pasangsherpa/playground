// https://www.hackerrank.com/challenges/anagram

import java.io.*;

public class Solution {
  private static final byte ALPHABET_COUNT = 26;
  private static final byte ASCII_ALPHABET_OFFSET = 97;

  private static int numOfChangesToMakeItAnagram(String str) {
    int numOfChanges = 0;
    char[] chars = str.toCharArray();
    int length = chars.length;

    // if length is not even, 2 strings are not of equal length
    if (length % 2 != 0) return -1;

    short[] alphabetCounts = new short[ALPHABET_COUNT];
    int mid = length / 2;
    int index;

    // count alphabet on first string
    for (int i = 0; i < mid; i++) {
      index = chars[i] - ASCII_ALPHABET_OFFSET; // normalize ascii val to 0 based
      alphabetCounts[index]++;
    }

    // subtract count from 2nd string
    for (int j = mid; j < length; j++) {
      index = chars[j] - ASCII_ALPHABET_OFFSET; // normalize ascii val to 0 based
      if (alphabetCounts[index] > 0) alphabetCounts[index]--;
    }

    for (short count: alphabetCounts) {
      numOfChanges += count > 0 ? count : 0;
    }

    return numOfChanges;
  }

  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfStrings = Integer.parseInt(br.readLine());

    for (int i = 0; i < numOfStrings; i++) {
      System.out.println(numOfChangesToMakeItAnagram(br.readLine()));
    }
  }
}
