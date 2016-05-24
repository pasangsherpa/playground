// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list

/*
  Reverse a doubly linked list, input list may also be empty
  Node is defined as
  class Node {
    int data;
    Node next;
    Node prev;
  }
*/

Node Reverse (Node head) {
  if (head == null || head.next == null) return head;

  Node current = head;
  Node next = head.next;

  while (current != null) {
    // swap next and prev
    next = current.next;
    current.next = current.prev;
    current.prev = next;

    // set tail to be the head
    if (next == null) {
      head = current;
    }

    // move current pointer
    current = next;
  }

  return head;
}
