public class Task_3 {
    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7, 2) ? "Prime" : "Composite");
        System.out.println(isPrime(10, 2) ? "Prime" : "Composite");
    }
}