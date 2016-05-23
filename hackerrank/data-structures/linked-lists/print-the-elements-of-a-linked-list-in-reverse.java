// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse

/*
  Print elements of a linked list in reverse order as standard output
  head pointer could be NULL as well for empty list
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

void ReversePrint (Node head) {
  if (head == null) return;

  ReversePrint(head.next);
  System.out.println(head.data);
}
