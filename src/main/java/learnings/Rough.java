package learnings;

public class Rough {


    public static void main(String[] args) {
        int sum;
       int[] nums = {-1,0,1,2,-1,-4};
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length-1; k++) {

                    if((nums[i]) + (nums[j]) + (nums[j]) == 0){
                        System.out.println("one");
                    }

                }
            }
        }






//        int[] height = {1,1,3,5,7,7};
//
//
//        int left = 0, right =1;
//        int sum = 0, max = 0;
//        System.out.println(height.length);
////        if(height.length <  1){
////            System.out.println( height[left] * height[right]);;
////        }
//        while(right <  height.length){
//
//            if(height[left] < height[right]){
//                sum = height[right] - height[left];
//            } else if (height[right] < height[left]) {
//                sum = height[left] - height[right];
//                left++;
//            } else if(height[right] == height[left]){
//                sum = height[left];
//                left++;
//            }
//
//            max = Math.max(sum, max);
//            right++;
//
//        }
//        System.out.println(max);
    }


}
