import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp;
        System.out.print("Enter the Size of the Array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements of the Array:");
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the Element at Cell "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorting the Array:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
                }
            }
        }
        System.out.println("Your Sorted Array is:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
