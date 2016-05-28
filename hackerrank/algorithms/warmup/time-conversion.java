// https://www.hackerrank.com/challenges/time-conversion

import java.util.*;

public class Solution {
  private static String toMilitaryTime(String time) {
    String period = time.substring(8, time.length());
    int hour = Integer.parseInt(time.substring(0, 2));

    if (period.equals("PM")) {
      hour += 12;
    } else {
      if (hour == 12) hour = 0;
    }

    return String.format("%02d", hour) + time.substring(2, 8);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String time = in.next();

    System.out.println(toMilitaryTime(time));
  }
}
