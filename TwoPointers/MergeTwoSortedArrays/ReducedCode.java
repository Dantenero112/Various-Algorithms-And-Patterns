/*
Using Two Pointers Technique to merge two sorted arrays
to reduce time complexity from O(n^2) to O(m+n)
Code can't be further optimized, so reducing it
 */

import java.util.ArrayList;

public class ReducedCode {
    public ArrayList<Integer> sort(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                list.add(arr1[p1++]);
            }
            else{
                list.add(arr2[p2++]);
            }
        }
        while(p1<arr1.length){
            list.add(arr1[p1++]);
        }
        while(p2<arr2.length){
            list.add(arr2[p2++]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr1={2,2,4,4,10,12,13,13};
        int[] arr2={1,3,5,7,7,14};
        ArrayList<Integer> list=new ArrayList<>();
        TwoPointersMergeSortedArray ob = new TwoPointersMergeSortedArray();
        list = ob.sort(arr1, arr2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
