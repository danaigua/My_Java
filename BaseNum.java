package com.JiaBao;

/**
 * @author 12952
 *
 */
public class BaseNum {
	public static void main(String[] args) {
		//������������
		byte b = 10;//ռ��һ���ֽ�
		short  s = 10;//ռ�������ֽ�
		int i = 10;//ռ���ĸ��ֽ�
		long lon = 100L;//ռ�ð˸��ֽ�
		float f = 10.98F;//ռ���ĸ��ֽڣ�������
        double d = 10.1213;//˫���ȣ�ռ�ð˸��ֽ�
        char c = 'A';//ռ�������ֽڣ���ΧΪ0~65535
        boolean bool = true;//ռ���ֽڲ�ȷ��
        b = 20;//��ֵ
        char c2 = 92;//ascii���
        System.out.println(c2);
        //����
         short s1 = b;//��һ���ֽڸ�ֵ��һ�������α������Զ�ת��
         int i1 = s1;//��һ�������θ�ֵ��һ�����α������Զ�ת��
         char sex = '��';
         int sex2 = sex ;
         System.out.println(sex2);//�Զ�ת��
         float f1 = 20f;
         double d1 = f1;//�Զ�ת��
         //float��doubleת��ʱ���ܶ�ʧ����
         int num = 785865685;
         float num2 = num;
         //������ڱ�ʾ����ֵ������ʹ��float��double
         System.out.println(num2);//��ʧ����
         //������
         short s3 = 10;
         s3 = (short)(s3  +1) ;//���ȶ�ʧ,�������ǿ��ת��
         System.out.println(s3);
         int a = 1;
         int e = 2;
         a = e++;//�ȸ�ֵ������
         System.out.println(a);
         a = ++e;//��������ֵ
         System.out.println(a);
         System.out.println("---------------------------------------------------------------");
         
         //�߼������
         //�����⣺
         //��һ��
         //��ͨ��������������ν���������
         //a=1    b=2
         //a=a+b-(b=a)
         //�ڶ���
         //ͨ�����ʽ
         //a=a+b
         //b=a-b
         //a=a-b
         //λ�Ƶķ�ʽ
         //����죩
         //a = a ^b
         //b =a ^b
         //a=a^b
	}

}