public class Task_7 {
        public static void printReverse(int[] arr, int index) {
            if (index < 0) {
                return;
            }
            System.out.print(arr[index] + " ");
            printReverse(arr, index - 1);
        }
        public static void main(String[] args) {
            int n = 4;
            int[] arr = {1, 4, 6, 2};
            printReverse(arr, n - 1);
        }
    }
