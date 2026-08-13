package Array;
import java.util.Scanner;
public class NameArray {
	static void printarray(String[]names) {
		//print an array
		System.out.println("Names:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int size=sc.nextInt();
		//Declaring Array
		String names[]=new String[size];
		System.out.println("Enter array Elements:");
		//user input for array
		for(int i=0;i<size;i++) {
			names[i]=sc.next();
		}
		//Calling method to print array
		printarray(names);

	}

}
