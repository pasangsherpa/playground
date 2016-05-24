// https://www.hackerrank.com/challenges/tree-preorder-traversal

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

void preOrder (Node root) {
  if (root == null) return;

  System.out.print(root.data + " ");
  preOrder(root.left);
  preOrder(root.right);
}
