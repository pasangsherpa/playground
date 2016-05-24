// https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

int countLongestRootToNodes (Node root) {
  if (root == null) return 0;

  int left = countLongestRootToNodes(root.left);
  int right = countLongestRootToNodes(root.right);

  return 1 + Math.max(left, right);
}

int height (Node root) {
  // total edges = total nodes - 1
  return countLongestRootToNodes(root) - 1;
}
