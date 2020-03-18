package homework;

import java.util.Random;
import java.util.Scanner;

public class Hw3_2 {

	public static void main(String[] args) {
		// 解决问题1：如何产生1~100之间随机整数
//		double num = Math.random() *100 + 1;//返回0~1之间的小数[0,1)
//		//0~100之间的小数[0,100)
//		//1~101之间小数[1, 101)
//		int num2 = (int)num;//1~100之间的整数
		
		//int num = (int)(Math.random() *100 + 1);
		
		Random ran = new Random();
		int num = ran.nextInt(100) + 1;//0~100之间的整数[0,100), 返回[1, 101)
		Scanner input = new Scanner(System.in);
		//解决问题：死循环，如果相等就结束循环
		//循环体：输入，比较，如果相等结束循环，如果不等继续输入，比较
		int cnt = 0;//统计输入的次数
		while(true) {
			System.out.println("请输入1~100之间的整数");
			int num2 = input.nextInt();
			cnt++;
			if(num2 == num) {
				break;
			}
			if(num2 > num) {
				System.out.println("太大了，小一点");
			}else {
				System.out.println("太小了，大一点");
			}
		}
		System.out.println("恭喜你猜对了");
		if(cnt==1) {
			System.out.println("你太聪明了");
		}else if(cnt >=2 && cnt <=5) {
			System.out.println("不错，再接再厉！");
		}else {
			System.out.println("要努力了");
		}
	}

}
