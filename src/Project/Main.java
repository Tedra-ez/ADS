package Project;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(7);
        printList(arrayList);
        arrayList.add(2, 10);
        printList(arrayList);
        arrayList.remove(4);
        printList(arrayList);
        arrayList.sort();
        printList(arrayList);
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.getLast());
        System.out.println(arrayList.indexOf(10));
        System.out.println(arrayList.exists(8));

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("delta");
        linkedList.add("alpha");
        linkedList.add("charlie");
        linkedList.add("bravo");
        printList(linkedList);
        linkedList.add(2, "echo");
        printList(linkedList);
        linkedList.remove(3);
        printList(linkedList);
        linkedList.sort();
        printList(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.indexOf("charlie"));
        System.out.println(linkedList.exists("bravo"));

        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("first");
        queue.enqueue("second");
        queue.enqueue("third");
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());

        MyMinHeap<Integer> minHeap = new MyMinHeap<>();
        minHeap.insert(45);
        minHeap.insert(15);
        minHeap.insert(75);
        minHeap.insert(10);
        minHeap.insert(30);
        System.out.println(minHeap.peekMin());
        System.out.println(minHeap.removeMin());
        System.out.println(minHeap.peekMin());
    }

    public static <T> void printList(MyList<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
