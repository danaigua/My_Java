package JiaBao;

public class maopao {
	public static void main(String[] args) {
		//ð������
		int[] nums = {253,24,64,654,423,52,45,32};//�����������
		int len = nums.length;
		for (int i =0;i<len-1;i++) {
		      for(int j = 0;j<(len-1-i);j++) {
		    	  if(nums[j]>nums[j+1]) {
		    		  nums[j] = nums[j+1] + nums[j];
		    		  nums[j+1] = nums[j]  - nums[j+1];
		    		  nums[j] = nums[j]  - nums[j+1];
		    	  }
		      }
		}
		//�������ҵĴ����߼���������������д����Ϊ������д�Ļ���ֻ�ܱ�֤��������õ����򣬱�����˫��ѭ����ʵ������ð���������ȶ��������㷨�������������ͬ�Ļ�������ı�����λ��
//		for(int i = 0;i<len-1;i++) {
//				if(nums[i]<nums[i+1] ){
//					nums[i] = nums[i]+nums[i+1];
//					nums[i+1] = nums[i] - nums[i+1];
//					nums[i] = nums[i] - nums[i+1];
//				}
//		}
		for(int num:nums) {
			System.out.println(num);
		}
	}

}
