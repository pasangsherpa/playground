// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists

/*
  Find merge point of two linked lists
  Node is defined as
  class Node {
    int data;
    Node next;
  }
*/

private int getLength (Node head) {
  int length = 0;
  Node current = head;

  while (current != null) {
    current = current.next;
    length++;
  }

  return length;
}

int FindMergeNode (Node headA, Node headB) {
  // get lengths
  int headALength = getLength(headA);
  int headBLength = getLength(headB);

  int excess = 0;
  Node currentA = headA;
  Node currentB = headB;

  // skip excess nodes from the longer list
  if (headALength > headBLength) {
    excess = headALength - headBLength;
    while (excess-- > 0) {
      currentA = currentA.next;
    }
  } else {
    excess = headBLength - headALength;
    while (excess-- > 0) {
      currentB = currentB.next;
    }
  }

  // both lists are of same length now
  while (currentA != null && currentB != null) {
    if (currentA == currentB) break;

    currentA = currentA.next;
    currentB = currentB.next;
  }

  return currentA.data;
}
