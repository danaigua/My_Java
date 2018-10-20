package JiaBao;

public class maopao {
	public static void main(String[] args) {
		//冒泡排序
		int[] nums = {253,24,64,654,423,52,45,32};//待排序的数列
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
		//以下是我的错误逻辑：不可以这样子写，因为这样子写的话就只能保证个别的数得到排序，必须用双重循环来实现排序，冒泡排序是稳定的排序算法，如果两个数相同的话他不会改变数的位置
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
