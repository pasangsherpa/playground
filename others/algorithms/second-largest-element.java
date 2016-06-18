/**
 * Objec­tive: Given an array of inte­gers. find the sec­ond largest ele­ment in the array.
 *
 * Exam­ple:
 *
 * int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
 *
 * Second largest Element : 44
 *
 */

public class SecondLargest {
  public static int secondLargest(int[] nums) {
    if (nums.length < 2) return -1;

    int largest, secondLargest;
    largest = secondLargest = nums[0];

    for (int num: nums) {
      if (num == nums[0]) continue;

      if (num > largest) {
        secondLargest = largest;
        largest = num;
      }
    }

    return secondLargest;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
    System.out.println(secondLargest(nums));
  }
}
