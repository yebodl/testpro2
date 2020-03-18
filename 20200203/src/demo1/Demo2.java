package demo1;

public class Demo2 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(j==3) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println("------------------------");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==3) {
				break;
			}
		}
		System.out.println("------------------------");
		loop:for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(j==3) {
					break loop;
				}
			}
			System.out.println();
		}

	}

}
