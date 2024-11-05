package day4_1;

public class Aircon {

	public static void main(String[] args) {
		// 함수호출
		int temp =23;
		turnOn(temp);
		
		buybear(18);
	}//main
	public static void turnOn(int temp) {
		if(temp>25) {
			System.out.println("현재온도:"+temp+"에어컨동작중");
		}//if
		else
			System.out.println("가을온도여서 에어컨 동작안함");
	}//turn0n
	public static void buybear(int age) {
		if(age>=19)
			System.out.println("맥주구매강능");
		else
			System.out.println("맥주구매불가");
	}
}//class
