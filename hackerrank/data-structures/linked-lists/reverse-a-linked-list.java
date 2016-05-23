// https://www.hackerrank.com/challenges/reverse-a-linked-list

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

Node Reverse (Node head) {
  if (head == null || head.next == null) return head;

  Node previous = null;
  Node current = head;
  Node next = head.next;

  while (current != null) {
    next = current.next;
    current.next = previous;
    previous = current;
    current = next;
  }

  // set tail as head
  head = previous;

  return head;
}
