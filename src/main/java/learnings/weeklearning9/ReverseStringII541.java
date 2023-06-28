package learnings.weeklearning9;

import java.util.Arrays;

public class ReverseStringII541 {

    /**
     * Input: s = "abcdefg", k = 2
     * Output: "bacdfeg"
     * @param args
     */
    public static void main(String[] args) {
        String s = "abcdefg";
          int      k = 2;
          System.out.println(reverseStr(s,k));
    }

    public static String reverseStr(String s, int k) {


        char[] arr = s.toCharArray();

        for (int i = 0; i <= arr.length-1; i += 2*k) {

            if(i + k-1 <= arr.length ){
                swap(arr, i,  i + k-1 );
            } else{
                swap(arr, i , k-1);
            }


//            System.out.println(right);


        }


//        System.out.println(Arrays.toString(arr));
        String ans = new String(arr);
        return ans;
    }

    static  void swap(char[]arr, int left, int right){

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }


    }
}
