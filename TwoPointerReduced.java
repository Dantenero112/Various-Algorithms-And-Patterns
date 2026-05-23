/*Two Pointers Demo
more reduced code cuz it can't be further optimized
in terms of time complexity which is O(n) 
*/
class TwoPointerReduced{
	public int[] TwoPointer(int[] arr, int target){
		int left=0,right=arr.length-1;
		while(left<right){
			if((arr[left]+arr[right])==target) {
				return new int[]{arr[left],arr[right]};
			}
			else if(arr[left]+arr[right]>target) right--;
			else left++;
		}
		return new int[]{-1,-1};
	}
	public static void main(String[] args){
		int[] arr={-8,1,4,6,10,45};
		TwoPointerDemo tp = new TwoPointerDemo();
		int[] pairs=tp.TwoPointer(arr, 10);
		if(pairs[0]==-1 && pairs[1]==-1){
			System.out.println("No pair found");
		}
		else{
            System.out.println(String.format("{%d,%d}", pairs[0],pairs[1]));
	}
}
}