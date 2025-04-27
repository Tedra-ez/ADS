package Project2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class BST<K extends Comparable<K>, V> implements Iterable<BST<K,V>.Node> {
    public class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return val;
        }
    }

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public void put(K key, V val) {
    }

    public V get(K key) {
        return null;
    }

    public void delete(K key) {
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<Node> iterator() {
        return new BSTIterator();
    }

    private class BSTIterator implements Iterator<Node> {
        private final Stack<Node> stack = new Stack<>();

        public BSTIterator() {
            pushLeft(root);
        }

        private void pushLeft(Node x) {
            while (x != null) {
                stack.push(x);
                x = x.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node node = stack.pop();
            if (node.right != null) {
                pushLeft(node.right);
            }
            return node;
        }
    }
}
