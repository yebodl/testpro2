package homework;

import java.util.Scanner;

public class Hw2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三角形三边的长度");
		int b1 = input.nextInt();
		int b2 = input.nextInt();
		int b3 = input.nextInt();
		//两边之和大于第三边
		if(b1+b2>b3 && b1+b3>b2 && b2+b3>b1) {
			//两边之差小于第三边
			//Math.abs(num) 返回num的绝对值
			if(Math.abs(b1-b2)<b3 && Math.abs(b1-b3)<b2 && Math.abs(b2-b3)<b1) {
				System.out.println("这三边可以构成三角形");
			}else {
				System.out.println("这三边不可以构成三角形");
			}
		}else {
			System.out.println("这三边不可以构成三角形");
		}

	}

}
