package oops;

public class Patterns {
	void triangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}
	
	 void box(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}
	 void rectangle(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++)
			{System.out.print("*");}
			System.out.println();
		}
		
	}

	public void fact(int number) {
		long answer=1;
		for (int i=1;i<=number;i++) {
			answer=i*answer;
		}
		
		System.out.println(answer);
	}

}
