package com.JiaBao;

/**
 * @author 12952
 *
 */
public class BaseNum {
	public static void main(String[] args) {
		//八种数据类型
		byte b = 10;//占用一个字节
		short  s = 10;//占用两个字节
		int i = 10;//占用四个字节
		long lon = 100L;//占用八个字节
		float f = 10.98F;//占用四个字节，单精度
        double d = 10.1213;//双精度，占用八个字节
        char c = 'A';//占用两个字节，范围为0~65535
        boolean bool = true;//占用字节不确定
        b = 20;//赋值
        char c2 = 92;//ascii码表
        System.out.println(c2);
        //补码
         short s1 = b;//把一个字节赋值给一个短整形变量，自动转换
         int i1 = s1;//把一个短整形赋值给一个整形变量，自动转换
         char sex = '男';
         int sex2 = sex ;
         System.out.println(sex2);//自动转换
         float f1 = 20f;
         double d1 = f1;//自动转换
         //float和double转换时可能丢失精度
         int num = 785865685;
         float num2 = num;
         //如果由于表示货币值不建议使用float和double
         System.out.println(num2);//丢失精度
         //面试题
         short s3 = 10;
         s3 = (short)(s3  +1) ;//精度丢失,必须加上强制转换
         System.out.println(s3);
         int a = 1;
         int e = 2;
         a = e++;//先赋值后自增
         System.out.println(a);
         a = ++e;//先自增后赋值
         System.out.println(a);
         System.out.println("---------------------------------------------------------------");
         
         //逻辑运算符
         //面试题：
         //第一种
         //不通过第三个变量如何交换两个数
         //a=1    b=2
         //a=a+b-(b=a)
         //第二种
         //通过表达式
         //a=a+b
         //b=a-b
         //a=a-b
         //位移的方式
         //（最快）
         //a = a ^b
         //b =a ^b
         //a=a^b
	}

}