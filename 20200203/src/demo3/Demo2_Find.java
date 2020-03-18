package demo3;

import java.util.Scanner;

public class Demo2_Find {

	public static void main(String[] args) {
		// 12	23	34	45	56	67
		int[] nums = {12,	23,	34,	45,	56,	67};
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查找的数：");
		int n = input.nextInt();
		
		int start, end;
		start = 0;
		end = nums.length-1;
		boolean flg = true;//true表示不存在
		while(start <=end) {
			//确定比较的下标
			int index = (start + end)/2;
			if(nums[index] == n) {
				System.out.println(n+"存在，在序列的第"+(index+1)+"个位置");
				flg = false;//false表示存在
				break;				
			}else if(n > nums[index]) {
				//要查找的数在后半段，修改start
				start= index+1;
			}else {
				//要查找的数在前半段，修改end
				end = index -1;
			}
		}
		
		if(flg == true) {
			System.out.println(n+"在序列中不存在");
		}
		
//		if(start >end) {
//			System.out.println(n+"在序列中不存在");
//		}
	}

}
