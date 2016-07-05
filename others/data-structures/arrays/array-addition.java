/**
 * Given a number, e.g., 2789, as an array [2,7,8,9], increment it: Example,
 * change [2,7,8,9] to [2,7,9,0].
 */

public class Addition {
  public static int[] increment(int[] nums, int incrementer) {
    boolean hasCarry = false;
    int temp = 0;
    int length = nums.length - 1;

    for (int i = length; i > 0; i--) {
      if (hasCarry == true) {
        temp = nums[i] + 1;
        hasCarry = false;
      } else {
        temp = nums[i] + incrementer;
      }

      if (temp > 9) {
        nums[i] = temp % 10;
        hasCarry = true;
      } else {
        nums[i] = temp;
        break;
      }
    }

    // increase array
    if (hasCarry == true) {
      int[] res = new int[nums.length + 1];
      res[0] = 1;
      return res;
    }

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 8, 9 };
    int incrementer = 2;

    for (int num : increment(nums, incrementer)) {
      System.out.print(num + " ");
    }
  }
}
