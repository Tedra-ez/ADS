package Project2;

import java.util.Random;

public class HashTableTest {
    public static class MyTestingClass {
        private final int id;
        public MyTestingClass(int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MyTestingClass)) return false;
            MyTestingClass other = (MyTestingClass) o;
            return this.id == other.id;
        }

        @Override
        public String toString() {
            return "K" + id;
        }
    }

    public static void main(String[] args) {
        final int N = 10_000;
        final int M = 11;
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>(M);
        Random rnd = new Random();

        for (int i = 0; i < N; i++) {
            int randomId = rnd.nextInt(1_000_000);
            table.put(new MyTestingClass(randomId), i);
        }

        int[] buckets = table.getBucketSizes();
        for (int i = 0; i < buckets.length; i++) {
            System.out.printf("Bucket %2d: %4d elements%n", i, buckets[i]);
        }
    }
}
