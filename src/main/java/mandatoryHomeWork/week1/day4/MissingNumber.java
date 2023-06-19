package mandatoryHomeWork.week1.day4;

public class MissingNumber {


    public static void main(String[] args) {

        int[] nums = {3,0,1};
        missingNumber(nums);
    }
    public static int missingNumber(int[] nums) {
        int expectedSum = 0;
        int sum = 0;
        int len = nums.length;

        for (int i=0; i<=len; i++){
            expectedSum += i;
        }

        for (int num:nums){
            sum += num;
        }

        int missing = expectedSum-sum;

        return missing;
    }
}
