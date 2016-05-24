// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle

/*
  Detect a cycle in a linked list.
  Note that the head pointer may be 'null' if the list is empty.
  A Node is defined as:
  class Node {
    int data;
    Node next;
  }
*/

boolean hasCycle (Node head) {
  boolean hasCycle = true;
  boolean hasNoCycle = false;

  if (head == null || head.next == null) return hasNoCycle;

  Node slowPtr = head;
  Node fastPtr = head.next;

  while (fastPtr != null && fastPtr.next != null) {
    if (fastPtr == slowPtr) return hasCycle;

    slowPtr = slowPtr.next;
    fastPtr = fastPtr.next.next;
  }

  return hasNoCycle;
}
