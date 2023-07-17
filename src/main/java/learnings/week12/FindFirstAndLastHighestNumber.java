package learnings.week12;

import java.util.Arrays;

public class FindFirstAndLastHighestNumber {


    public static void main(String[] args) {
        int[] arr = {5,1,1,1,1};
       firstAndLastNumber(arr);




    }

    public static void firstAndLastNumber(int[] arr){

        int first = 0, sum  =0;
        int count = 0;
        boolean non = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] != arr[j]){

                } else{
                    count = 0;
                    break;
                }
                count++;
            }
            sum += count;

        }

//        for (int i = 0; i < arr.length; i++) {
//            if(first < arr[i]){
//                second = first;
//                first = arr[i];
//            } else if (second < arr[i]) {
//                second = arr[i];
//            }
//        }
        System.out.println(sum);
    }




}
class Test1{

    public int value;
    public int hasCode(){
        return (int) (value^5);
    }

}
class Test2 {

    public int value;

    public int hasCode() {
        return (int) (value ^ 5);
    }

}
