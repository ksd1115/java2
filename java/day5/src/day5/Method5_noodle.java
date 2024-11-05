package day5;

import java.util.Scanner;

public class Method5_noodle {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	Noodle noodle = new Noodle();
	//noodle.menu();
	//noodle.buy();
	//noodle.bow();
    //noodle.noodleput();
	//noodle.sourceput();
	//noodle.eggput();
	//noodle.eat();

	}

}
class Noodle{
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.사온다\n2.물끓인다\n3.넣는다>>");
		int choice =scan.nextInt();
		if(choice ==1)
			buy();
		else if(choice ==2)
			bow();
		else if(choice ==3)
			noodleput();
	}
	public void buy () {
		System.out.println("1.신라면\\n2.진라면\\n3.안성탕면>>");
		int choice =scan.nextInt();
		if(choice ==1)
			System.out.println("신라면 선택");
	}
	public void bow () {
		System.out.println("물을 끓인다");
	}
	public void noodleput () {
		System.out.println("라면을 넣는다");
	}
	public void sourceput () {
		System.out.println("스프를 넣는다.");
	}
	public void eggput () {
		System.out.println("계란을 넣는다");
	}
	public void eat () {
		System.out.println("먹는다");
	}
	
}
