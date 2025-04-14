public class Task_9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    public static void main(String[] args) {
        System.out.println(binomialCoefficient(2, 1));
        System.out.println(binomialCoefficient(7, 3));
    }
}
