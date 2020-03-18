package homework;

import java.util.Random;
import java.util.Scanner;;

public class Test1 {

	public static void main(String[] args) {
		//输出 System.out.println();
		System.out.println("hello");
		//返回-10的绝对值
		System.out.println(Math.abs(9-19));
		
		//计算2的10方
		System.out.println(Math.pow(2, 10));
		
		int rs1 = (int)Math.pow(2, 10);
		System.out.println(rs1);
		
		//接受键盘输入的int
		Scanner input = new Scanner(System.in);
		int rs2 = input.nextInt();
		System.out.println("rs2 = "+rs2);
		
		//随机1~3之间数
		Random ran = new Random();
		int rs3 = ran.nextInt(3) + 1;
		System.out.println(rs3);
		System.out.println("over");

	}

}
