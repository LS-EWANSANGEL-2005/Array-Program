package Array;
import java.util.Scanner;
public class Maximum {

				public static void findMax(int [] num){
				int max=num[0];
				for(int i=1;i<num.length;i++) {
					if(num[i]>max) {
						max=num[i];
					}
				}
				System.out.println("maximum values:" + max);
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter a array size");
				int n=sc.nextInt();
				int [] num=new int[n];
				for(int i =1;i<n;i++) {
				    num[i]=sc.nextInt();   
				}
		        findMax(num);
			}
	}

