package Array;
import java.util.Scanner;
public class SecondLargest {
     static int findSecondLargest(int[]nums) {
    	 int largest=Integer.MIN_VALUE;
    	 int secondLargest=Integer.MIN_VALUE;
    	 for(int i=0;i<nums.length;i++) {
    		 if(nums[i]>largest) {
    			 secondLargest=largest;
    			 largest=nums[i];
    		 }
    		 
    	 }
    	 if(secondLargest==Integer.MIN_VALUE) {
    		 return
    	 }
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}

	}

}
