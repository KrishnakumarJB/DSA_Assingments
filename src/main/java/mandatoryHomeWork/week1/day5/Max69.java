package mandatoryHomeWork.week1.day5;

import java.util.Arrays;

public class Max69 {

    public static void main(String[] args) {
//        re69();
        num69();
    }


    public static int re69(){
        int num = 669;
        char[] str = String.valueOf(num).toCharArray();

        for (int i = 0; i < str.length-1; i++) {
            if(str[i] == '6'){
                str[i] = '9';
                break;
            }
        }
        int ans = Integer.valueOf(String.valueOf(str));
        System.out.println(ans);
        return ans;
    }

    public static void num69(){
        int num = 669;

        int left = 0, right = 0, rem =0 ,count =0;
        int length = String.valueOf(num).length();
        int[] arr = new int[length];
        int mi =arr.length-1;;
        while(right < arr.length){

            rem = num%10;
            num = num/10;
            arr[mi] = rem;
            mi--;
            right++;
        }

        System.out.println(Arrays.toString(arr));

        while(left < arr.length){
            if(arr[left] == 6){
                arr[left] = 9;
                break;
            }
            left++;
        }
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }

        System.out.println(result);
    }
}
