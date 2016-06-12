import java.util.Stack;

/**
 * Design a generic stack that supports push, pop, peek, and retrieving
 * the minimum element in constant time.
 *
 * push(x) -- Adds the given item to the top of the stack.
 * pop() -- Removes the top item from the stack and returns it.
 * peek() -- Returns the top item from the stack without popping it.
 * getMin() -- Retrieve the minimum element in the stack.
 */

interface StackADT<T extends Comparable<? super T>> {
  /**
   * Adds the given item to the top of the stack.
   */
  void push(T item);

  /**
   * Removes the top item from the stack and returns it.
   * @exception java.util.EmptyStackException if the stack is empty.
   */
  T pop();

  /**
   * Returns the top item from the stack without popping it.
   * @exception java.util.EmptyStackException if the stack is empty.
   */
  T peek();

  /**
   * Retrieves the minimum element in the stack.
   * @exception java.util.EmptyStackException if the stack is empty.
   */
  T getMin();

  /**
   * Returns the number of items currently in the stack.
   */
  int size();

  /**
   * Returns whether the stack is empty or not.
   */
  boolean isEmpty();
}

class MinStack<T extends Comparable<? super T>> implements StackADT<T> {
  private Stack<T> stack = new Stack<T>();
  private Stack<T> minStack = new Stack<T>();

  @Override
  public void push(T item) {
    if (minStack.isEmpty() || item.compareTo(minStack.peek()) < 0) {
      minStack.push(item);
    }

    stack.push(item);
  }

  @Override
  public T pop() {
    T el = stack.pop();

    // if popping minimum, adjust the min stack
    if (el.compareTo(minStack.peek()) == 0) {
      minStack.pop();
    }
    return el;
  }

  @Override
  public T getMin() {
    return minStack.peek();
  }

  @Override
  public T peek() {
    return stack.peek();
  }

  @Override
  public int size() {
    return stack.size();
  }

  @Override
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    MinStack<Integer> minStack = new MinStack<Integer>();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin()); //--> Returns -3.
    minStack.pop();
    System.out.println(minStack.peek()); //--> Returns 0.
    System.out.println(minStack.getMin()); //--> Returns -2.
  }
}

