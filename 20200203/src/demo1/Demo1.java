package demo1;

public class Demo1 {

	public static void main(String[] args) {
		
	 for(int j=1; j<=5; j++) {	
		for(int i=1; i<=5; i++) {//内循环，一行5个*
			System.out.print("*");
		}
		System.out.println();//外循环换行
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=5; j++) {
		 
		 for(int i=1; i<=j; i++) {//内循环,一行j个
			 System.out.print("*");
		 }
		 
		 System.out.println();//外循环换行
	 }
	 System.out.println("----------------------------");
	 for(int j=5; j>=1; j--) {
		 for(int i=1; i<=j; i++) {//内循环,一行j个
			 System.out.print("*");
		 }
		 
		 System.out.println();//外循环换行
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=9; j++) {
		 for(int i=1; i<=j; i++) {//内循环,打印乘法式子
			 System.out.print(j+"*"+i+"="+(i*j)+"\t");
		 }
		 System.out.println();
	 }
	 System.out.println("----------------------------");
	 for(int j=1; j<=5; j++) {
		 
		 for(int i=1; i<=j; i++) {//内循环,一行j个
			 System.out.print(i);
		 }
		 
		 System.out.println();//外循环换行
	 }
	}
	

}
