// https://www.hackerrank.com/challenges/sparse-arrays

import java.util.*;

public class Solution {
  private static void countOccurence (String[] strings, String[] queries) {
    int counter;

    for (int i = 0; i < queries.length; i++) {
      counter = 0;
      String query = queries[i];
      for (int j = 0; j < strings.length; j++) {
        if (query.equals(strings[j])) {
          counter++;
        }
      }
      System.out.println(counter);
    }
  }

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    int numOfStrings = in.nextInt();
    String strings[] = new String[numOfStrings];
    for (int i = 0; i < numOfStrings; i++) {
      strings[i] = in.next();
    }

    int numOfQueries = in.nextInt();
    String queries[] = new String[numOfQueries];
    for (int j = 0; j < numOfQueries; j++) {
      queries[j] = in.next();
    }

    countOccurence(strings, queries);
  }
}
