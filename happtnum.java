public class happtnum {
    public static boolean fun(int n){
        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
        while(n !=1 && !seen.contains(n) ){
            seen.add(n);
            int d = 0;
            while(n!=0){
                int temp = n % 10;
                d += temp * temp;
                n = n/10;

            }
            n = d;
            
        }
        return n==1;
    }
    public static void main(String[] args) {
        int n = 19;
        boolean res = fun(n);
        System.out.println("Is " + n + " a happy number? " + res);
    }
}
