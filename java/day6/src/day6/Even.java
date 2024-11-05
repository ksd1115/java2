package day6;

public class Even {

	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		for(i=1; i<30; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		for(n=1; n<30; n++) {
			if(n%2!=0)
				System.out.println(n);
		}

	}

}
