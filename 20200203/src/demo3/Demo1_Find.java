package demo3;

import java.util.Scanner;

public class Demo1_Find {

	public static void main(String[] args) {
		//8,4,2,1,23,344,12
		int[] nums = {8,4,2,1,23,344,12};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查找的数：");
		int n = input.nextInt();
		//假设序列中不存在
		boolean isExits = false;
		int i;
		for( i=0; i< nums.length; i++) {
			if(nums[i] == n) {
				System.out.println(n+"存在，在序列的第"+(i+1)+"个位置");
				isExits = true;
				break;
			}
		}
//		if(i == nums.length) {
//			System.out.println(n+"在序列中不存在");
//		}
		if(isExits==false) {
			System.out.println(n+"在序列中不存在");
		}

	}

}
