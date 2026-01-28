package oops;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Pattern p1=new Pattern();
		System.out.println("Enter Box size");
//		p1.triangle(sc.nextInt());
		p1.fact(4);
	}

	private void triangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}
	
	private void box(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}
	private void rectangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}

	public void fact(int number) {
		long ans=1;
		for (int i=1;i<=number;i++) {
			ans=i*ans;
		}
		
		System.out.println(ans);
	}

	
	
	

}
