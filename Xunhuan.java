package JiaBao;

public class Xunhuan {
public static void main(String[] args) {
	//��дѭ����ʱ���ȷ���ķ���ǰ�棬�����ָ��
	//��дswich���ʱ��case�����ظ���case���Լ���{}��ʾ������
	//��jdk1.7֮��switch֧����String
	//do   whileѭ������Ҫִ��һ�Σ�whileѭ�����Բ�ִ��
	int i =10;
	do {
		System.out.println(i);
		i--;
		}while(i>=0);//
	//for(int i = 0;i<10;i++) {
		//if(i==5) {
			//continue;//��������ѭ���������´�ѭ��
		//}
	//}
	//��2��
	int j = 0;
	for(;j<10;j++) {
		
	}
	//��ѭ��
	//for(int i = o;;i++) {
		
	//}
	//(4)
	//for(int i=0;i<10;) {
		//i++;
	//}
	//(5)
	int x = 0;
	for(;x<10;) {
		x++;
	}
	//(6)��ѭ��
	//for(;;) {
		
	// }
	//��ӡ����
	for(int a =1;a<=5;a++) {
		for(int b = 0;b<a;b++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	//��ӡ�žų˷����
	for(int a = 1;a<=9;a++) {
		for(int b = 1;b<=a;b++) {
			System.out.print(a+"x"+b+"="+a*b+"   ");
		}
		System.out.println();
	}
	//��ӡ����
	for(int a = 4;a>=0;a--) {
		for (int b =0;b<a;b++) {
			System.out.print("  ");
		}
		for(int b = 5;b>a;b--) {
		System.out.print("*");
		}
		System.out.println();
	}
	//��ӡ����
	for(int a = 4;a>=0;a--) {
		for (int b =0;b<a;b++) {
			System.out.print("  ");
		}
		for(int b = 5;b>a;b--) {
		System.out.print("*");
		}
		for(int b = 4;b>a;b--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
