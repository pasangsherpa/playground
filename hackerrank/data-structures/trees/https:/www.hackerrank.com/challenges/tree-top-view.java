// https://www.hackerrank.com/challenges/tree-top-view

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

void left_view (Node node) {
  if (node == null) return;

  left_view(node.left);
  System.out.print(node.data + " ");
}

void right_view (Node node) {
  if (node == null) return;

  Node current = node;

  while (current != null) {
    System.out.print(current.data + " ");
    current = current.right;
  }
}

void top_view (Node root) {
  if (root == null) return;

  left_view(root); // print left and root
  right_view(root.right); // print right
}
