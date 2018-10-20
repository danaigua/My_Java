package JiaBao;

public class Xunhuan {
public static void main(String[] args) {
	//在写循环的时候把确定的放在前面，避免空指针
	//在写swich语句时，case不能重复，case可以加上{}表示作用域
	//在jdk1.7之后switch支持用String
	//do   while循环最少要执行一次，while循环可以不执行
	int i =10;
	do {
		System.out.println(i);
		i--;
		}while(i>=0);//
	//for(int i = 0;i<10;i++) {
		//if(i==5) {
			//continue;//跳过当次循环，进入下次循环
		//}
	//}
	//（2）
	int j = 0;
	for(;j<10;j++) {
		
	}
	//死循环
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
	//(6)死循环
	//for(;;) {
		
	// }
	//打印星星
	for(int a =1;a<=5;a++) {
		for(int b = 0;b<a;b++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	//打印九九乘法表格
	for(int a = 1;a<=9;a++) {
		for(int b = 1;b<=a;b++) {
			System.out.print(a+"x"+b+"="+a*b+"   ");
		}
		System.out.println();
	}
	//打印星星
	for(int a = 4;a>=0;a--) {
		for (int b =0;b<a;b++) {
			System.out.print("  ");
		}
		for(int b = 5;b>a;b--) {
		System.out.print("*");
		}
		System.out.println();
	}
	//打印星星
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
