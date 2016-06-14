/**
 * Given an array of integers, find two numbers such that they add up
 * to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that
 * they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are
 * not zero-based.
 *
 * For example:
 *
 * Input: numbers = { 2, 7, 11, 15 }, target = 9
 * Output: index1 = 0, index2 = 1
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  private static class Pair {
    private int index1, index2;

    public Pair(int index1, int index2) {
      this.index1 = index1;
      this.index2 = index2;
    }
  }

  public static Pair twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Pair pair = null;

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        pair = new Pair(map.get(nums[i]), i);
        break;
      }

      map.put(target - nums[i], i);
    }

    return pair;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15 };
    int target = 22;

    Pair p = twoSum(nums, target);
    if (p == null) System.out.println("No pair found");
    else System.out.println(p.index1 + ", " + p.index2);
  }
}
