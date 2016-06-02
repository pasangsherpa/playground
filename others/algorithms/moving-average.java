/**
 * A simple moving average is a method for computing an average of a stream of
 * numbers by only averaging the last P numbers from the stream, where P is
 * known as the period.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MovingAverage {
  private int period;
  private double sum;
  private Queue<Double> window = new LinkedList<Double>();

  public MovingAverage(int period) {
    this.period = period;
  }

  public void add(double num) {
    sum += num;
    window.add(num);

    // if window size greater than period,
    // evict the first number and fix the sum
    if (window.size() > period) {
      sum -= window.remove();
    }
  }

  public double getAverage() {
    if (window.isEmpty()) return -1;
    return sum / window.size();
  }

  public void printWindow() {
    StringBuilder sb = new StringBuilder();
    sb.append("Window: [");
    for (Double num : window) {
      sb.append(num + ",");
    }

    sb.deleteCharAt(sb.length() - 1);
    sb.append("], ");
    System.out.print(sb);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter the period for moving average: ");
    System.out.println();

    MovingAverage ma = new MovingAverage(in.nextInt());
    System.out.print("Enter number or `ctrl+d` to cancel: ");
    while (in.hasNext()) {
      ma.add(in.nextDouble());
      System.out.println();
      ma.printWindow();
      System.out.print("Moving Avg: " + ma.getAverage() + "\n\n");
      System.out.print("Enter next number or `ctrl+d` to cancel: ");
    }

    in.close();
  }
}
