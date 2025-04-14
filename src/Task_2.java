public class Task_2 {
    public static double findAverage(int n , int[] arr) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 1};
        System.out.println(findAverage(n, arr));
    }
}
