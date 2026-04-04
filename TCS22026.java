//public class TCS22026 {
//
//    public static int josephus(int n, int k) {
//        int res = 0; // 0-based result
//
//        for (int i = 2; i <= n; i++) {
//            res = (res + k) % i;
//        }
//
//        return res + 1; // convert to 1-based
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        int k = 2;
//
//        System.out.println(josephus(n, k)); // Output: 3
//    }
//}

//optimal solution
public class TCS22026 {

    public static int josephus(int n, int k) {
        if (n == 1) return 1;

        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        System.out.println(josephus(n, k)); // Output: 3
    }
}