// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists

/*
  Merge two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

Node MergeLists (Node headA, Node headB) {
  if (headA == null) return headB;
  if (headB == null) return headA;

  Node currentA = headA;
  Node currentB = headB;

  if (currentA.data < currentB.data) {
    currentA.next = MergeLists(currentA.next, currentB);
    return currentA;
  } else {
    currentB.next = MergeLists(currentA, currentB.next);
    return currentB;
  }
}
