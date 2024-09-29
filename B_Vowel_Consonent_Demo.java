package array_prog;

import java.util.Scanner;

public class B_Vowel_Consonent_Demo {

	public void getdata() {
		char a[] = new char[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter char");
		for(char i=0;i<=4;i++) {
			a[i] = sc.next().charAt(0);
		}
		for(char k=0;k<=4;k++) {
			if(a[k]=='a'|a[k]=='e'|a[k]=='i'|a[k]=='o'|a[k]=='u') {
				System.out.println(a[k]+ " is vowel");
				
			}
			else {
				System.out.println(a[k]+ " is consonent");
			}
		}
	}
	public static void main(String[] args) {

		B_Vowel_Consonent_Demo ob = new B_Vowel_Consonent_Demo();
		ob.getdata();
	}

}
