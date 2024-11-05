package day6;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int nums[] = new int[10];
		int i=0;
		while(i<nums.length) {
			System.out.print("nums["+i+"]=");
			nums[i] = scan.nextInt();
			i++;
		}
		for(i=0; i<nums.length; i++) {
			if(i%2==0)
				continue;
			
			else
				System.out.println("nums["+i+"]="+nums[i]);
		}

	}

}
