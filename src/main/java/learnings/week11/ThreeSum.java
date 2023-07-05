package learnings.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {


    public static void main(String[] args) {
        int[] sum = {-1,0,1,2,-1,-4};

//        System.out.println(Arrays.toString(threeSum(sum)));
    }

    public static List<List<Integer>> threeSum(int[] sum){

        List<List<Integer>> newList = new ArrayList<>();
        int total = 0;

        for (int i = 0; i < sum.length - 2 ; i++) {
            for (int j = i+1; j < sum.length - 1; j++) {
                for (int k = j+1; k < sum.length; k++) {
                    total = sum[i] + sum [j] + sum[k];
                    if(total == 0){
                        List<Integer> newSubList = new ArrayList<>();
                        newSubList.add(sum[i]);
                        newSubList.add(sum[j]);
                        newSubList.add(sum[k]);
                        newList.add(newSubList);
//                        System.out.println(sum[i] +","+ sum [j] +","+ sum[k]);
                    }
                }
            }
        }
        return newList;
    }
}
