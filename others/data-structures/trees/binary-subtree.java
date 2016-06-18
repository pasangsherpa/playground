/**
 * Objec­tive: Given two binary trees, check if one binary tree is a sub­tree of another
 *
 * Input: Two binary trees
 * Out­put: True or false based on whether one tree is sub­tree of another
 *
 * Exam­ple:
 * Tree A ->      1
 *           2        4
 *       3        5       6
 *
 * Tree B ->      4
 *            5       6
 *
 * Tree B is a subtree of Tree A
 *
 */

class Node {
  int element;
  Node left, right;

  Node(int element) {
    this.element = element;
  }
}

public class SubTree {
  public static boolean isSubTree(Node treeA, Node treeB) {
    return inorder(treeA).contains(inorder(treeB));
  }

  public static String inorder(Node tree) {
    return inorder(tree, "");
  }

  private static String inorder(Node tree, String str) {
    if (tree == null) return "";

    return inorder(tree.left, str) + tree.element + inorder(tree.right, str);
  }

  public static void main (String[] args) {
    Node one = new Node(1);
    Node two = new Node(2);
    Node three = new Node(3);
    Node four = new Node(4);
    Node five = new Node(5);
    Node six = new Node(6);

    one.left = two;
    one.right = four;
    two.left = three;
    four.left = five;
    four.right = six;

    System.out.println(isSubTree(one, four)); // true
    System.out.println(isSubTree(four, one)); // false
  }
}
