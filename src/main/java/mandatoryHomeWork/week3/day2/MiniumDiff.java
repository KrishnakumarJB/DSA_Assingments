package mandatoryHomeWork.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniumDiff {

    public static void main(String[] args) {

        int[] arr = {4,2,1,3};

        System.out.println(minimumAbsDifference(arr));


    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int diff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            diff = Math.min(diff,arr[i+1]-arr[i]);
        }

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return result;
    }
}
