// https://www.hackerrank.com/challenges/gem-stones

import java.io.*;

public class Solution {
  private static final int TOTAL_ELEMENTS = 26; // a - z

  private static byte[] getComposition(String rock) {
    byte[] comps = new byte[TOTAL_ELEMENTS];
    int index = 0;

    for (char el : rock.toCharArray()) {
      index = el - 'a'; // normalize to 0 based;
      comps[index]++;
    }

    return comps;
  }

  private static int getGemCount(byte[] elements, int numOfRocks) {
    int counter = 0;

    for (byte el : elements) {
      if (el == numOfRocks) counter++;
    }

    return counter;
  }

  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int numOfRocks = Integer.parseInt(br.readLine());

    byte[] elements = new byte[TOTAL_ELEMENTS];
    byte[] rockComposition ;

    for (int i = 0; i < numOfRocks; i++) {
      rockComposition = getComposition(br.readLine());

      for (int j = 0; j < rockComposition.length; j++) {
        if (rockComposition[j] > 0) elements[j]++;
      }
    }

    System.out.println(getGemCount(elements, numOfRocks));
  }
}
