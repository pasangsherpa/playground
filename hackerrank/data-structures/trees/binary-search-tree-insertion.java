// https://www.hackerrank.com/challenges/binary-search-tree-insertion

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

static Node Insert (Node root, int value) {
  Node node = new Node();
  node.data = value;

  if (root == null) {
    root = node;
    return root;
  }

  Node current = root;

  while (current != null) {
    if (value > current.data) {
      if (current.right == null) {
        current.right = node;
        break;
      }

      current = current.right;
    } else {
      if (current.left == null) {
        current.left = node;
        break;
      }

      current = current.left;
    }
  }

  return root;
}

static Node InsertRecursive (Node root, int value) {
  if (root == null) {
    root = new Node();
    root.data = value;
    return root;
  }

  if (value > root.data) {
    root.right = InsertRecursive (root.right, value);
  } else {
    root.left = InsertRecursive (root.left, value);
  }

  return root;
}
