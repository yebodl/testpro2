package demo1;

import java.util.Scanner;

public class Lianxi1 {

	public static void main(String[] args) {
		// 编写程序，从键盘输入6名学生的5门成绩，分别统计出每个学生的平均成绩
		Scanner input= new Scanner(System.in);
		double sum = 0;
		for(int j=1; j<=6; j++) {
			//sum = 0;
			for(int i=1; i<=5; i++) {//输入5个成绩，求和
				System.out.println("请输入第"+i+"门课成绩");
				int cj = input.nextInt();
				sum = sum + cj;
			}
			System.out.println("第"+j+"个学生的平均成绩："+(sum/5));
		}

	}

}
