// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list

/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/

Node InsertNth (Node head, int data, int position) {
  Node node = new Node();
  node.data = data;

  if (head == null || position == 0) {
    node.next = head;
    head = node;
    return head;
  }

  Node previous = null;
  Node current = head;
  while (current != null && position != 0) {
    previous = current;
    current = current.next;
    position--;
  }

  previous.next = node;
  node.next = current;

  return head;
}
