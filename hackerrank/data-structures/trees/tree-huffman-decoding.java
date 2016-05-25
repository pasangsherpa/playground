// https://www.hackerrank.com/challenges/tree-huffman-decoding

/*
  Node is defined as
  class Node {
    int data;
    Node left;
    Node right;
  }
*/

void decode (String S, Node root) {
  if (root == null || S == null) return;

  char[] arr = S.toCharArray();
  Node current = root;

  for (char c: arr) {
    // if 0 move left else move right
    current = (c == '0') ? current.left : current.right;

    if (current.data != '\0') {
      System.out.print(current.data);
      current = root; // reset
    }
  }
}
