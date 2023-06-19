package mandatoryHomeWork.week3.day5;

import org.junit.Test;

public class Duplicate {

    @Test
    public void yu() {
        int[] arr = {1,2,3,1,2,3};

        int left=0, right=0, total=0, k=2;
        while(right < arr.length) {


            if(right - left+1 == 2) {
//				System.out.println(arr[left]+", "+arr[right]);
                total = Math.abs(arr[left]-arr[right]);
                System.out.println(total);
                if(total <= k) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
                left++;
            }
            right++;
        }
    }
}
