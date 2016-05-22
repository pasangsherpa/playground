// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list

/*
  Print elements of a linked list on console
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

void Print(Node head) {
  if (head == null) return;

  Node current = head;
  while (current != null) {
    System.out.println(current.data);
    current = current.next;
  }
}
