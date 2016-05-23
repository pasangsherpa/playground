// https://www.hackerrank.com/challenges/compare-two-linked-lists

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not.
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

int CompareLists (Node headA, Node headB) {
  int isNotEqual = 0;
  int isEqual = 1;

  if ((headA == null && headB != null) ||
      (headA != null && headB == null)) {
    return isNotEqual;
  }

  Node currentA = headA;
  Node currentB = headB;

  while (currentA != null && currentB != null) {
    if (currentA.data != currentB.data) {
      return isNotEqual;
    }

    currentA = currentA.next;
    currentB = currentB.next;
  }

  if (currentA == null && currentB == null) {
    return isEqual;
  } else {
    return isNotEqual;
  }
}
