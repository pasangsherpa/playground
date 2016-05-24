// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list

/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as
    class Node {
      int data;
      Node next;
    }
*/

Node RemoveDuplicates (Node head) {
  if (head == null || head.next == null) return head;

  Node current = head;

  while (current != null && current.next != null) {
    if (current.data == current.next.data) {
      current.next = current.next.next;
    } else {
      current = current.next;
    }
  }

  return head;
}
