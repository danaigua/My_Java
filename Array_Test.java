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
		//数组：一组能够存储相同数据类型的变量的集合
		//四种方法定义一个数组
		//数组一定要有长度，如何数组都有长度
		//数组中的每一个数据称为元素，数组元素的位置从零开始
		//第一种
		int[] nums = new int[50];
//		nums[0] = 1;
		for(int i = 0 ;i<50;i++) {
			nums[i] = i+1;
			//第二种
			int[] num2 ;
			num2 = new int[50];
			//第三种
			int [] nums3 = new int [] {1,2,3,4};
			//第四种
			int [] num4= {1,2,3,4};
		}
	}
	public static int add(int a ,int b) {
		return a+b;
	}
	public static float add(float a ,float b) {
		return a+b;
	}
}

