package JiaBao;

public class Array_Test {
	//方法就是有特定功能的代码块，提高程序的复用性和可读性
	//static静态修饰符：描述的方法可以直接调用
	//返回值就是功能结果的数据类型
	//命名：驼峰命名法
	//形参：方法定义时的参数称为形参
	//实参：在调用方法时传入的参数称为实参
	//方法体就是完成功能的代码
    //方法的重载:方法名相同，参数列表不同
	//返回值不能作为重载的条件
	public static void main(String[] args) {
		int result = add (10,20);
		System.out.println(result);
	}
	public static int add(int a ,int b) {
		return a+b;
	}
	public static float add(float a ,float b) {
		return a+b;
	}
}

