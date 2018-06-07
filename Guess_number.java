package JiaBao;

import java.util.Scanner;
import java.util.Random;

public class Guess_number {
public static void main(String[] args) {
	//多维数组，Java中没有真正的多维数组，多维数组中的表示方式是数组中的元素还是多维数组
	/*
	 * 78   23   43
	 * 32   43   54
	 * 45   54   32
	 */
	int[] [] scores = {{78,23,43},{32,43,54},{45,54,32}};
	int classLen = scores.length;
	for(int i=0;i<classLen;i++) {
		int sum = 0;
		int count  = scores[i].length;
		for (int j = 0;j<count;j++) {
			sum+=scores[i][j];
		}
		int avg = sum/count;
		System.out.println("第"+(i+1)+"班的平均成绩是："+avg);
	}
	Scanner input = new Scanner(System.in);
	//int [] nums = {30,17,6,2,22,27};
	int [] nums = new int [5];
	Random r = new Random();
	int len = nums.length;
	for (int i=0;i<len;i++) {
		nums [i] = r.nextInt(50);
	}
	System.out.println("请输入您要猜的数：（50以内）");
	int userNum = input.nextInt();
	boolean flag = false;
	for (int x:nums) {
		if (userNum==x) {
			flag = true;
			break;
		}
	}
	if(flag) {
		System.out.println("恭喜你猜对了！");
	}else {
		System.out.println("继续努力！");
	}
}
}
