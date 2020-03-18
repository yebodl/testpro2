package homework;

public class Hw3_1 {

	public static void main(String[] args) {
		//定义前两个数
		int num1 = 1, num2 = 1;
		System.out.print(num1+"\t"+num2+"\t");
		//循环输出其余数据
		for(int cnt = 3; cnt <= 10; cnt++) {
			int num = num1 + num2;
			System.out.print(num+"\t");
			if(cnt == 5) {
				System.out.println();
			}
			//改变num1 和num2
			num1 = num2;
			num2 = num;
		}

	}

}
