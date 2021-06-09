package week7.day2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class MyBST {
    private Node root;

    public void add(Integer val) {
        root = add(root, val);
    }

    public boolean contains(Integer val) {
        return find(root, val) != null;
    }

    public void BFS() {
        Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node temp = nodes.poll();
            if (temp.getLeft() != null) {
                nodes.add(temp.getLeft());
            }
            if (temp.getRight() != null) {
                nodes.add(temp.getRight());
            }
            System.out.print(temp.getValue() + " ");
        }
    }

    public void iterativePreorder() {
        iterativePreorder(root);
    }

    private Node add(Node current, Integer val) {
        if (current == null) {
            return new Node(val);
        } else if (current.getValue() < val) {
            current.setRight(add(current.getRight(), val));
        } else if (current.getValue() > val) {
            current.setLeft(add(current.getLeft(), val));
        }
        return current;
    }

    public void remove(Integer val) {
        remove(root, val);
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (root == null) {
            return 0;
        }
        int leftHeight = 0;
        int rightHeight = 0;
        if (node.getRight() != null) {
            rightHeight = height(node.getRight());
        }
        if (node.getLeft() != null) {
            leftHeight = height(node.getLeft());
        }

        int max = 0;
        if (rightHeight > leftHeight) {
            max = rightHeight;
        } else {
            max = leftHeight;
        }
        return max + 1;
    }

    private Node remove(Node node, Integer val) {
        if (node == null) {
            return null;
        }
        if (val < node.getValue()) {
            node.setLeft(remove(node.getLeft(), val));
        } else if (val > node.getValue()) {
            node.setRight(remove(node.getRight(), val));
        } else {
            if (node.getLeft() != null && node.getRight() != null) {
                //minimum node from right subtree
                Node min = minimum(node.getRight());
                node.setValue(min.getValue());
                node.setRight(remove(node.getRight(), min.getValue()));
            } else if (node.getLeft() != null) {
                Node delete = node;
                node = node.getLeft();
                delete = null;
            } else if (node.getRight() != null) {
                Node delete = node;
                node = node.getRight();
                delete = null;
            } else {
                node = null;
            }
        }
        return node;
    }

    private void iterativePreorder(Node node) {
        if (node == null) {
            return;
        }
        Stack<Node> nodes = new Stack<>();
        nodes.push(node);
        while (!nodes.isEmpty()) {
            Node temp = nodes.pop();
            System.out.print(temp.getValue() + " ");
            if (temp.getRight() != null) {
                nodes.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                nodes.push(temp.getLeft());
            }
        }
    }

    private Node minimum(Node node) {
        if (node.getLeft() == null) {
            return node;
        }
        return minimum(node.getLeft());
    }

    private Node find(Node current, Integer val) {
        if (current == null) {
            return null;
        }
        if (current.getValue().equals(val)) {
            return current;
        } else if (current.getValue() > val) {
            return find(current.getLeft(), val);
        }
        return find(current.getRight(), val);
    }

}
