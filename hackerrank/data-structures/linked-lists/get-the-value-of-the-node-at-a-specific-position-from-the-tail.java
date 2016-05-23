// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail

/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

int GetNode (Node head, int n) {
  int length = 0;
  Node current = head;

  // get length
  while (current != null) {
    current = current.next;
    if (current != null) length++;
  }

  // reset current
  current = head;

  // fix index
  int index = length - n;

  while (current != null) {
    // node found
    if (index == 0) break;

    current = current.next;
    index--;
  }

  // node doesn't exist
  return current.data;
}
