// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list

/*
  Insert Node at the end of a linked list
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

Node Insert (Node head, int data) {
  Node node = new Node();
  node.data = data;

  if (head == null) {
    head = node;
    return head;
  }

  Node current = head;

  while (current.next != null) {
    current = current.next;
  }

  current.next = node;
  return head;
}
