package JiaBao;

public class Array_Test {
	//�����������ض����ܵĴ���飬��߳���ĸ����ԺͿɶ���
	//static��̬���η��������ķ�������ֱ�ӵ���
	//����ֵ���ǹ��ܽ������������
	//�������շ�������
	//�βΣ���������ʱ�Ĳ�����Ϊ�β�
	//ʵ�Σ��ڵ��÷���ʱ����Ĳ�����Ϊʵ��
	//�����������ɹ��ܵĴ���
    //����������:��������ͬ�������б�ͬ
	//����ֵ������Ϊ���ص�����
	public static void main(String[] args) {
		int result = add (10,20);
		System.out.println(result);
		//���飺һ���ܹ��洢��ͬ�������͵ı����ļ���
		//���ַ�������һ������
		//����һ��Ҫ�г��ȣ�������鶼�г���
		//�����е�ÿһ�����ݳ�ΪԪ�أ�����Ԫ�ص�λ�ô��㿪ʼ
		//��һ��
		int[] nums = new int[50];
//		nums[0] = 1;
		for(int i = 0 ;i<50;i++) {
			nums[i] = i+1;
			//�ڶ���
			int[] num2 ;
			num2 = new int[50];
			//������
			int [] nums3 = new int [] {1,2,3,4};
			//������
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

