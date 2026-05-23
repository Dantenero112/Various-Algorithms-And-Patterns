/*
Using Two Pointers Technique to merge two sorted arrays
to reduce time complexity from O(n^2) to O(m+n)
 */

import java.util.ArrayList;

public class TwoPointersMergeSortedArray {
    public ArrayList<Integer> sort(int[] arr1, int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<arr2[p2]){
                list.add(arr1[p1]);
                p1++;
            }
            else{
                list.add(arr2[p2]);
                p2++;
            }
        }
        if(p1!=arr1.length){
            for(int i=p1;i<arr1.length;i++){
                list.add(arr1[i]);
            }
        }
        else{
             for(int i=p2;i<arr2.length;i++){
                list.add(arr2[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr1={2,2,4,4,10,12,13,13};
        int[] arr2={1,3,5,7,7};
        ArrayList<Integer> list=new ArrayList<>();
        TwoPointersMergeSortedArray ob = new TwoPointersMergeSortedArray();
        list = ob.sort(arr1, arr2);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
