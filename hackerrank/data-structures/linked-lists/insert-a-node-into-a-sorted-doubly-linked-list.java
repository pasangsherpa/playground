// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list

/*
  Insert Node in a doubly sorted linked list
  After each insertion, the list should be sorted
  Node is defined as
  class Node {
    int data;
    Node next;
    Node prev;
  }
*/

Node SortedInsert (Node head, int data) {
  Node node = new Node();
  node.data = data;

  if (head == null) {
    head = node;
    return head;
  }

  Node current = head;

  while (current != null) {
    if (current.data >= data) {
      node.prev = current.prev;
      node.next = current;

      current.prev.next = node;
      current.prev = node;
      break;
    }

    // end of list case
    if (current.next == null) {
      current.next = node;
      node.prev = current;
      break;
    }

    current = current.next;
  }

  return head;
}
