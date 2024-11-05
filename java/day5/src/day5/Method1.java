package day5;

public class Method1 {

	public static void main(String[] args) {
		int result=square(4);
		System.out.println("square(4) ="+ result);
		System.out.println("square(4) ="+ square(4));
		System.out.println("Math.abs(-100)="+ Math.abs(-100));
		result=Math.max(2,  7);
		System.out.println("Math.max(2, 7):"+result);
		result=Math.min(2,  7);
		System.out.println("Math.min(2, 7):"+result);
		System.out.println("-------------");
			result =area(5,120);
			System.out.println("area(5,120):"+ result);
			
			result =add(4,5);
			result =sub(50,3);
		
	}
	private static int sub(int i, int j) {
		
		return i-j;
	}
	private static int add(int i, int j) {
		
		return i+j;
	}
	private static int square(int i) {
		
		return 0;
	}
	public static int area(int w, int h){
		int squre =w*h;
		return squre;
	
	}
}
