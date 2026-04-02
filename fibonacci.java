public class fibonacci {
    public static void main(String[] args) {
        int n = 8;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series:");
        for(int i = 0;i<n;i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
//Time complexity: O(n)
//Space complexity: O(1)