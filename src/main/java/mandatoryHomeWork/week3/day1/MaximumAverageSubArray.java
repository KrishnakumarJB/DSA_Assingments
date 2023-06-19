package mandatoryHomeWork.week3.day1;

import org.junit.Test;



public class MaximumAverageSubArray {
	
	int [] nums = {1,12,-5,-6,50,3};
	int k = 4;
	
	
	@Test
	public void nm() {
		
		
		int sum = 0;
		
		
		for(int i = 0; i<k; i++) {
			sum += nums[i];
		}
		int avg = 0;
		
		if(avg < sum) {
			avg = sum;
		}
		
		for(int i = k; i<nums.length; i++) {
			sum += nums[i];
			sum -= nums[i-k];
			if(avg < sum) {
				avg = sum;
			}
		}
		
		System.out.println((double)avg/4);
		
//		int max = 0;
//		
//		int left = 0;
//		int right = 0;
//		int sum =0;
//		
//		while(right < nums.length) {
//			sum += nums[right];
//			System.out.println(sum);
//			if(right - left+1 < k) {
//				right++;
//			} else if(right - left+1 == k) {
//				max = Math.max(max, sum);
//				sum = sum - nums[left];
//				left++;
//				right++;
//				
//			}
//		}
//		System.out.println((double)max/k);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
