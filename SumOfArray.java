package Array;
import java.util.Scanner;
public class SumOfArray {
	public static int findArraySum (int [] num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<num.length;i++) {
			
		}

	}

}
