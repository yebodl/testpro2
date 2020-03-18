package demo1;

import java.util.Random;
import java.util.Scanner;

public class Lianxi3 {

	public static void main(String[] args) {
		String ans ;
		do {
			Random ran = new Random();
			int num = ran.nextInt(100) + 1;
			Scanner input = new Scanner(System.in);
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
			
			System.out.println("是否再来一局？y/n");
			ans = input.next();
		}while(ans.equalsIgnoreCase("y"));//equalsIgnoreCase()忽略大小写比较字符串

	}

}
