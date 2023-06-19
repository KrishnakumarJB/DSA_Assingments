package mandatoryHomeWork.week3.day4;

public class K4 {
    public static void main(String[] args) {
        int num = 430043;
        kb(num);
    }


    /**
     * Pseudo code
     *
     * Approach - Sliding window
     *
     * 1. convert the num to array
     * 2. initialize varibale left and right
     * 3. using while loop traverse right till the len of number array
     * 4. if right - left +1 is less than 2 increase left
     * 			a.
     * 5. if right is more then increment right
     * 6.
     *
     *
     *
     * @param num
     */

    private static void kb(int num) {
        int left = 0, right=0, count =0, mod =0;
        String arr = String.valueOf(num);
//		int[] arr = new int[num];
        while(right < arr.length()-1) {
//			if(arr[right] != 0 || arr[left] != 0) {
//				count++;
//			}
//			System.out.println("left "+ arr[left]);

            if(right - left+1 == 2) {
                String splString = arr.substring(left, right+left);
                int modu = Integer.valueOf(splString);
                System.out.println(modu);
                mod = num%(modu);
                if(mod == 0) {
                    count++;
                }
                left++;
            }

            right++;
        }
        System.out.println(count);


    }
}
