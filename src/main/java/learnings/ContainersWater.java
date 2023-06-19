package learnings;

public class ContainersWater {


    public static void main(String[] args) {


       int[] heights = {10, 1, 8, 6,22, 2, 5, 4, 8, 3, 7};
       System.out.println(container(heights));
    }

    public static int container(int[] heights){

        int left = 0, right =1;
        int sum =0, max =0;

        while(right < heights.length){
            if(heights[left] < heights[right]){
                sum = heights[right] - heights[left];
            }
            else if(heights[left] > heights[right]){
                sum = heights[left] - heights[right];
                left++;
            }
            max = Math.max(sum, max);
            right++;
        }

        return max*max;

    }
}
