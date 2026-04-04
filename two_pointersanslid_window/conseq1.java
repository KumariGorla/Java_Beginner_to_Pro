package two_pointersanslid_window;

public class conseq1 {
    public static void main(String[] args) {
        int arr[] = {1,0,1,1,0};
        int count  = 0;
        int count1 = 0;
        int l = 0;
        int ans = 0;
        int k = 2;
        for(int r = 0;r<arr.length;r++){
            if(arr[r] == 1){
                count++;

            }else{
                count1++;
            }
            while(Math.min(count,count1) > k){
                if(arr[l] == 0){
                    count--;
                }else{
                    count1--;
                }
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        
        System.out.println(ans);
    }
}
