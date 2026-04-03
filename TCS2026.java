//import java.util.*;
//public class TCS2026 {
//    public static void main(String[] args) {
//        int arr[] = {12,12,6,7,26,6,6,26,12,12};
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i = 0;i<arr.length;i++){
//            int num = arr[i];
//            if(hm.containsKey(num)){
//                hm.put(num,hm.get(num)+1);
//            }else{
//                hm.put(num,1);
//            }
//        }
//        System.out.println(hm);
//        int maxval = Integer.MIN_VALUE;
//        int minval = Integer.MAX_VALUE;
//        for(int val:hm.values()){
//            if(val > maxval){
//                maxval = val;
//            }if(val < minval){
//                minval = val;
//            }
//        }
//        for(int mv:hm.keySet()){
//            if(hm.get(mv)==maxval){
//                System.out.println(maxval);
//            }
//        }
//        for(int mv:hm.keySet()){
//            if(hm.get(mv)==minval){
//                System.out.println(minval);
//            }
//        }
//        
//    }
//}
//
////to get heighest and lowest frequency of elements in an array.


import java.util.HashMap;

public class TCS2026 {
    public static void main(String[] args) {

        int[] arr = {12,12,6,7,26,6,6,26,12,12};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        int maxNum = arr[0];
        int minNum = arr[0];

        // Step 2: Traverse array (IMPORTANT for first occurrence logic)
        for (int num : arr) {
            int freq = map.get(num);

            // For max frequency
            if (freq > maxFreq) {
                maxFreq = freq;
                maxNum = num;
            }

            // For min frequency (first occurrence)
            if (freq < minFreq) {
                minFreq = freq;
                minNum = num;
            }
        }

        // Step 3: Output
        System.out.println("Highest Frequency Element: " + maxNum);
        System.out.println("Lowest Frequency Element: " + minNum);
    }
}

