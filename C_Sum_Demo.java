package array_prog;

import java.util.Scanner;

public class C_Sum_Demo {

	int z=0;
	public void getdata() {
		
		int num=0;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter input");
		for(int i=0;i<=4;i++) {
			a[i] = sc.nextInt();
		}
		for(int k=0;k<=4;k++) {
			num = num+a[k];
			System.out.println(num);
		}
	}
	public static void main(String[] args) {

		C_Sum_Demo ob = new C_Sum_Demo();
		ob.getdata();
	}

}
