package JiaBao;

import java.util.Scanner;
import java.util.Random;

public class Guess_number {
public static void main(String[] args) {
	//��ά���飬Java��û�������Ķ�ά���飬��ά�����еı�ʾ��ʽ�������е�Ԫ�ػ��Ƕ�ά����
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
		System.out.println("��"+(i+1)+"���ƽ���ɼ��ǣ�"+avg);
	}
	Scanner input = new Scanner(System.in);
	//int [] nums = {30,17,6,2,22,27};
	int [] nums = new int [5];
	Random r = new Random();
	int len = nums.length;
	for (int i=0;i<len;i++) {
		nums [i] = r.nextInt(50);
	}
	System.out.println("��������Ҫ�µ�������50���ڣ�");
	int userNum = input.nextInt();
	boolean flag = false;
	for (int x:nums) {
		if (userNum==x) {
			flag = true;
			break;
		}
	}
	if(flag) {
		System.out.println("��ϲ��¶��ˣ�");
	}else {
		System.out.println("����Ŭ����");
	}
}
}
