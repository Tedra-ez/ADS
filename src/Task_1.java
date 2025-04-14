public class Task_1 {
    public static int MinNum(int n, int[] arr) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println(MinNum(n, arr));
    }
}
