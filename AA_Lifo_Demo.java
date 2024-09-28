package array_prog;

import java.util.Scanner;

public class AA_Lifo_Demo {

	public void getdata() {
		int a[] = new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		for(int i=0;i<=4;i++) {
			 a[i] = sc.nextInt();
		}
		for(int k=4;k>=0;k--) {
			System.out.println(a[k]);
		}
	}
	public static void main(String[] args) {

		AA_Lifo_Demo ob = new AA_Lifo_Demo();
		ob.getdata();
	}

}
