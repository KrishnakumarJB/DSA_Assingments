package mandatoryHomeWork.week3.day2;

import org.junit.Test;

public class RecolorBlackAndWhite {
	
	@Test
	public void bw() {
		String blocks = "WBWBBBW";
		
		char[] arr = blocks.toCharArray();
		
		int max=Integer.MAX_VALUE;
		int left= 0, right=0, count=0, w=0;
		
		while(right < arr.length) {
			if(arr[right] == 'W') {
				count++;
			}	
			if(right - left+1 == 4) {
				max=Math.min(count,max);
				if(arr[left] == 'W') {
					count--;
				}
				left++;
			}
			
			right++;
		}
		
		System.out.println(max);
	}

}
