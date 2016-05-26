// https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

static Node lca (Node root, int v1, int v2) {
  // base case for recursion
  if (root == null) return null;

  // if v1 or v2 equals root, then lca is root
  if (v1 == root.data || v2 == root.data) return root;

  Node leftLca = lca(root.left, v1, v2);
  Node rightLca = lca(root.right, v1, v2);

  // if both left and right returned value, then lca is found
  if (leftLca != null && rightLca != null) return root;

  // look for lca in either left or right based on the value
  return leftLca != null ? leftLca : rightLca;
}
