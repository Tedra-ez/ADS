package Project;

public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        T data;
        Node next;
        Node prev;
        Node(T data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void set(int index, T item) {
        Node node = getNode(index);
        node.data = item;
    }

    @Override
    public void add(int index, T item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node newNode = new Node(item);
            Node current = getNode(index);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public T get(int index) {
        return getNode(index).data;
    }

    @Override
    public T getFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }
        return tail.data;
    }

    @Override
    public void remove(int index) {
        Node node = getNode(index);
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        } else {
            tail = node.prev;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        remove(0);
    }

    @Override
    public void removeLast() {
        if (tail == null) {
            throw new RuntimeException("List is empty");
        }
        remove(size - 1);
    }

    @Override
    public void sort() {
        if (size < 2) return;
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current != null && current.next != null) {
                Comparable<T> comp = (Comparable<T>) current.data;
                if (comp.compareTo(current.next.data) > 0) {
                    T temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        for (Node current = head; current != null; current = current.next, index++) {
            if ((object == null && current.data == null) ||
                    (object != null && object.equals(current.data))) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = size - 1;
        for (Node current = tail; current != null; current = current.prev, index--) {
            if ((object == null && current.data == null) ||
                    (object != null && object.equals(current.data))) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[size];
        int i = 0;
        for (Node current = head; current != null; current = current.next) {
            arr[i++] = current.data;
        }
        return arr;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node current = head;
            public boolean hasNext() {
                return current != null;
            }
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        Node current;
        if (index < size / 2) {
            current = head;
            for (int i = 0; i < index; i++)
                current = current.next;
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--)
                current = current.prev;
        }
        return current;
    }
}
