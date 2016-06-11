/**
 * The task is to complete merge() function which is used to implement Merge Sort.
 *
 * Input:
 * First line of the input denotes number of test cases 'T'. First line of the test
 * case is the size of array and second line consists of array elements.
 *
 * Output:
 * Sorted array in increasing order is displayed to the user.
 *
 * Constraints:
 * 1 <= T <= 50
 * 1 <= N <= 1000
 * 1 <= arr[i] <= 1000
 *
 * Example:
 * Input:
 * 2
 * 5
 * 4 1 3 9 7
 * 10
 * 10 9 8 7 6 5 4 3 2 1
 *
 * Output:
 * 1 3 4 7 9
 * 1 2 3 4 5 6 7 8 9 10
 */

import java.util.Scanner;

public class MergeSort {
  public static <T extends Comparable<? super T>> void sort(T[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  private static <T extends Comparable<? super T>> void sort(T[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      sort(arr, left, mid);
      sort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  @SuppressWarnings("unchecked")
  private static <T extends Comparable<? super T>> void merge(T[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    T[] leftArr = (T[]) new Comparable[n1];
    T[] rightArr = (T[]) new Comparable[n2];

    for (int i = 0; i < n1; i++) {
      leftArr[i] = arr[left + i];
    }

    for (int j = 0; j < n2; j++) {
      rightArr[j] = arr[mid + 1 + j];
    }

    int i, j, k = left;
    i = j = 0;

    while (i < n1 && j < n2) {
      if (leftArr[i].compareTo(rightArr[j]) <= 0) {
        arr[k++] = leftArr[i++];
      } else {
        arr[k++] = rightArr[j++];
      }
    }

    while (i < n1) {
      arr[k++] = leftArr[i++];
    }

    while (j < n2) {
      arr[k++] = rightArr[j++];
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numOfInputs = in.nextInt();

    Integer[] arr;
    for (int i = 0; i < numOfInputs; i++) {
      arr = new Integer[in.nextInt()];

      for (int j = 0; j < arr.length; j++) {
        arr[j] = in.nextInt();
      }

      sort(arr);

      for (int num : arr) {
        System.out.print(num + " ");
      }
    }

    in.close();
  }
}
