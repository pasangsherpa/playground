/**
 * Given an unsorted array of non-negative integers, find a continous
 * subarray which adds to a given number.
 *
 * Input:
 *
 * The first line of input contains an integer T denoting the number of test
 * cases. Then T test cases follow. Each test case consists of two lines. The
 * first line of each test case is N and S, where N is the size of array and S
 * is the sum. The second line of each test case contains N space separated
 * integers denoting the array elements.
 *
 * Output:
 *
 * Corresponding to each test case, in a new line, print the starting and
 * ending positions of first such occuring subarray if sum equals to subarray,
 * else print -1.
 *
 * Note: Position of 1st element of the array should be considered as 1.
 *
 * Expected Time Complexity: O(n)
 *
 * Constraints:
 * 1 ≤ T ≤ 50
 * 1 ≤ N ≤ 100
 * 1 ≤ an array element ≤ 200
 *
 * Example:
 *
 * Input:
 * 2
 * 5 12
 * 1 2 3 7 5
 * 10 15
 * 1 2 3 4 5 6 7 8 9 10
 *
 * Output:
 * 2 4
 * 1 5
 *
 * Explanation :
 * In first test case, sum of elements from 2nd position to 4th position is 12
 * In second test case, sum of elements from 1st position to 5th position is 15
 *
 */

public class Solution {
  public static void subArraySum(int[] elements, int sum) {
    int start, end, runningSum;
    start = end = runningSum = 0;

    for (int element: elements) {
      runningSum += element;

      if (runningSum > sum){
        runningSum = runningSum - elements[start];
        start++;
      }

      if (runningSum < sum) {
        end++;
      }

      if (runningSum == sum) {
        System.out.print(++start + ", " + ++end);
        return;
      }
    }

    System.out.print(-1);
  }

  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int[] elements = null;
    int size, sum;
    size = sum = 0;

    while (n-- > 0) {
      size = in.nextInt();
      sum = in.nextInt();

      elements = new int[size];

      for (int i = 0; i < size; i++) {
        elements[i] = in.nextInt();
      }

      subArraySum(elements, sum);
      System.out.printf("\n");
    }

    in.close();
  }
}
