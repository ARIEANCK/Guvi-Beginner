package set4;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1=in.nextInt(),n2=in.nextInt(),t1=0;
		t1=n1;n1=n2;n2=t1;
		System.out.println(n1+" "+n2);
		in.close();
	}
}
