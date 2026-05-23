//Two Pointers Demo
//can only be implemented on sorted array
//Demonstrating by using example: Sum of Pair Equal to Target

class TwoPointerDemo{
	public int[] TwoPointer(int[] arr, int target){
		int left=0,right=arr.length-1;
		int sum=0;
		int[] newArray = new int[2];
		while(left<right){
			sum=arr[left]+arr[right];
			if(sum==target) {
				newArray[0]=arr[left];
				newArray[1]=arr[right];
				return newArray;
			}
			else if(sum>target) right--;
			else left++;
		}
		newArray[0]=-1;
		newArray[1]=-1;
		return newArray;
	}
	public static void main(String[] args){
		int[] arr={-8,1,4,6,10,45};
		TwoPointerDemo tp = new TwoPointerDemo();
		int[] pairs=tp.TwoPointer(arr, 3);
		if(pairs[0]==-1 && pairs[1]==-1){
			System.out.println("No pair found");
		}
		else{
		for(int i=0;i<pairs.length;i++){
			System.out.println(pairs[i]);
		}
	}
}
}
