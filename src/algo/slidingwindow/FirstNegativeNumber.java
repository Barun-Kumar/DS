package algo.slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumber {


    /**
     * Bruteforce approach, Time : O(n*k)
     * @param arr : Input array
     * @param k : Size of the window
     * @return : List of all negative numbers
     */
    private static List<Integer> firstNegativeNumberOfSizeK(int[] arr, int k){
        List<Integer> ans= new ArrayList<>();
        if(k==0 || arr.length==0){
            return ans;
        }
        int start=0, end=0;
        while(end<arr.length){
            if(end-start+1!=k){
                end++;
            }else{
                for(int i=start;i<end;i++){
                    if(arr[i]<0){
                        ans.add(arr[i]);
                        end++;
                        start++;
                        break;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,-6, -2, 3 , -1, 8, -5, 10};
        List<Integer> ans=firstNegativeNumberOfSizeK(arr,3);
        System.out.println(ans);

    }
}
