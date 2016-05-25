// https://www.hackerrank.com/challenges/tree-level-order-traversal

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

void LevelOrder (Node root) {
  if (root == null) return;

  Queue<Node> queue = new LinkedList<Node>();
  Node current = null;

  // start with root
  queue.add(root);

  while (!queue.isEmpty()) {
    current = queue.remove();

    // print current node
    System.out.print(current.data + " ");

    // add left and right child
    if (current.left != null) queue.add(current.left);
    if (current.right != null) queue.add(current.right);
  }
}
