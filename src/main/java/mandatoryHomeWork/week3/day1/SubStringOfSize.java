package mandatoryHomeWork.week3.day1;

public class SubStringOfSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subStr("aababcabc");

	}
	
	
	public static void subStr(String str) {
		char[] splitStr = str.toCharArray();
		
		int left = 0, right=0, count=0;
		
		
		while(right < splitStr.length) {
			if(right - left+1 == 3) {
				if(splitStr[left] != splitStr[left+1] &&
						splitStr[left+1] != splitStr[left+2] &&
						splitStr[left+2] != splitStr[left]
						) {
					count++;
					
				}
				left++;
			}
			right++;
		}
		System.out.println(count);
	}

}
