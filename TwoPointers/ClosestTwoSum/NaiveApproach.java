// Finding the resultant sum of pairs that is closest to 0
// This is unoptimized code that results in O(n^2) time complexity
package ClosestTwoSum;
public class NaiveApproach {
    public int pairSum(int[] arr){
        int result=arr[0]+arr[1], sum=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i]+arr[j];
                //checking if new sum is closest to 0 by checking their distance irrespective of their signs
                if(Math.abs(sum)<Math.abs(result))
                    result = sum;
                //if two results are equal then we'll keep the max one
                else if(Math.abs(sum)==Math.abs(result))
                    result = Math.max(result, sum);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        NaiveApproach na = new NaiveApproach();
        int result = na.pairSum(new int[]{-7, 4, 1, -2});
        System.out.println("Result: "+result);
    }
}
