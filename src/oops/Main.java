package oops;

import java.util.Scanner;

public class Main {
	static Main p1; Scanner sc;
	Patterns pattern;
	Main (){
		sc=new Scanner(System.in);
		p1=new Main();		
		pattern=new Patterns();
	}
	
	public static void main(String[] args) {	
		p1.acceptCount();
	}

	public void acceptCount() {
		System.out.println("Enter no to check factorial");
		pattern.fact(sc.nextInt());
	}
	
	
	
	
	

}
