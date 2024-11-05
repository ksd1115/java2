package day5;

public class Method3 {//loTTo

	public static void main(String[] args) {
		int num=0;
		for(int i=1; i<=6; i++) {
			num=lotto();
			System.out.print(num+",");
		}
		
	}
	public static int lotto() {
		int lottosu =(int)(Math.random()*46);
		return lottosu;
	}

}
