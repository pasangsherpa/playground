/**
 * Given a string, eliminate all “b” and “ac” in the string,
 * you have to replace them in-place, and you are only allowed
 * to iterate over the string once.
 *
 * Examples:
 * acbac   ==>  ""
 * aaac    ==>  aa
 * ababac  ==>  aa
 * bbbbd   ==>  d
 */

public class Solution {
  public static String sanitize(String str) {
    if (str == null || str.length() < 1)
      return str;

    char[] chars = str.toCharArray();
    int i, j;
    i = j = 0;
    char current;

    while (i < chars.length) {
      current = chars[i];

      if (current == 'b') {
        i++;
      } else if (current == 'a') {
        if (chars[i + 1] == 'c') {
          i += 2;
        } else {
          chars[j++] = chars[i++];
        }
      } else {
        chars[j++] = chars[i++];
      }
    }

    return new String(chars, 0, j);
  }

  public static void main(String[] args) {
    System.out.println(sanitize("acbac"));
    System.out.println(sanitize("aaac"));
    System.out.println(sanitize("ababac"));
    System.out.println(sanitize("bbbbd"));
  }
}
