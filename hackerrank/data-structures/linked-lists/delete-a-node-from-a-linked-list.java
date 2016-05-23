// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list

/*
  Delete Node at a given position in a linked list
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node Delete (Node head, int position) {
  if (head == null) return head;

  // delete head
  if (position == 0) {
    head = head.next;
    return head;
  }

  Node previous = null;
  Node current = head;
  while (current != null && position != 0) {
    previous = current;
    current = current.next;
    position--;
  }

  // delete current
  previous.next = current.next;

  return head;
}
