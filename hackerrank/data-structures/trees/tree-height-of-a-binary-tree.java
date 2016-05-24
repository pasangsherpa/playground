// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

int height (Node root) {
  int height = 0;

  Node current = root;

  while (current != null) {
    current = current.left;
    height++;
  }

  return height;
}
