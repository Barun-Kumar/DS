package algo.slidingwindow;

public class MaxSubArray {

    private static int maxSumOfSubArrayOfSizeK(int[] arr, int k){
        if(k==0 || arr.length==0){
            return 0;
        }
        int start=0, end=0,sum=0;
        int max=Integer.MIN_VALUE;
        while(end<arr.length){
            sum=sum+arr[end];
            if(k==end-start+1){
                System.out.println(sum);
                max=Math.max(sum,max);
                sum=sum-arr[start];
                start++;
            }
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, -1, 0, 7, 10};
        int ans=maxSumOfSubArrayOfSizeK(arr,3);
        System.out.println(ans);

    }
}
