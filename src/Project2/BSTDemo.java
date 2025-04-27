package Project2;

public class BSTDemo {
    public static void main(String[] args) {
        BST<Integer,String> tree = new BST<>();
        tree.put(5, "five");
        tree.put(2, "two");
        tree.put(8, "eight");
        tree.delete(2);

        System.out.println("Size = " + tree.size());
        for (var elem : tree) {
            System.out.println("key is " + elem.getKey()
                    + " and value is " + elem.getValue());
        }
    }
}
