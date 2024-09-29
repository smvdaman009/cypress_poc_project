package array_prog;

import java.util.Scanner;

public class A_Lifo_Demo {
	//yhfyftftftd
	public void getdata() {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input ");
		for(int i=0;i<=4;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("lifo......");
		for(int k=4;k>=0;k--) {
			System.out.println(a[k]);
		}
	}
	
	// check git
	public static void main(String[] args) {

		A_Lifo_Demo ob = new A_Lifo_Demo();
		ob.getdata();
	}

}
