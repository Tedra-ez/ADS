public class Task_8 {
        public static boolean isAllDigits(String s) {
            return s.matches("\\d+");
        }
        public static void main(String[] args) {
            String s1 = "123456";
            String s2 = "123a12";
            System.out.println(s1 + " -> " + (isAllDigits(s1) ? "Yes" : "No"));
            System.out.println(s2 + " -> " + (isAllDigits(s2) ? "Yes" : "No"));
        }
    }
