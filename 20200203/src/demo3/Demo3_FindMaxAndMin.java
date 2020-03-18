package demo3;

public class Demo3_FindMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,4,2,1,23,344,12};
		//假设第一个数是最小值
		int min = nums[0];
		//假设第一个数是最大值
		int max = nums[0];
		//循环和其余元素比较，如果比某个元素大，最值修改
		for(int i=1; i < nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i]; 
			}
			if(max < nums[i]) {
				max = nums[i];
			}
			
		}
		
		System.out.println("序列中的最小值："+min);
		System.out.println("序列中的最大值："+max);
	}

}
