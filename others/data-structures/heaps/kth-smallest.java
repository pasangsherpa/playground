/**
 * Given an array of inte­gers, find the Kth smallest/largest ele­ment
 * in the array.
 *
 * Example:
 * int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
 * K = 4;
 *
 * 4th smallest element in given array: 10
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallest {
  public static int kthSmallest(int[] nums, int k) {
    int kthSmallest = -1;
    Queue<Integer> q = new PriorityQueue<Integer>();

    for (int num: nums) {
      q.offer(num);
    }

    while (k-- > 0) {
      kthSmallest = q.poll();
    }

    return kthSmallest;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
    int k = 4;

    System.out.println(kthSmallest(nums, k));
  }
}
