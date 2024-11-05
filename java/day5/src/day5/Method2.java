package day5;
import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
			Scanner scan =new Scanner(System.in);
			System.out.print("반지름>>");
			double r= scan.nextDouble();
			System.out.print("높이>>");
			double h =scan.nextDouble();
			double v = volumn(r, h);
			System.out.println("원기둥의 부피:"+v);
			//stem.out.printf("원기둥의 부피:
		
	}
	public static double volumn(double r, double h) {
		double areav=Math.PI*r*r*h;
		return areav;
	}

}
