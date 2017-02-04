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

public class TwoSum {
  private static class Pair {
    private int index1, index2;

    public Pair(int index1, int index2) {
      this.index1 = index1;
      this.index2 = index2;
    }
  }

  // Time complexity: O(n)
  public static int[] twoSum (int[] nums, int target) {
    int left = 0, right = nums.length - 1, sum;

    while (left < right) {
      sum = nums[left] + nums[right];

      if (sum == target) return new Pair(left, right);
      else if (sum < target) left++;
      else right--;
    }

    return null;
  }

  public static void main (String[] args) {
    int [] nums = { 2, 7, 11, 15 };
    int target = 9;

    Pair p = twoSum(nums, target);
    if (p != null) {
      System.out.printf("index1: %d, index2: %d", p.index1, p.index2);
    } else {
      System.out.printf("No pair found for: %d", target);
    }
  }
}
