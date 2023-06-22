package learnings.weekLearning8;

public class RemoveDuplicateInArray {


    public static void main(String[] args) {
        int[] array = {1,1, 2};

        int left =0, right=1, count =0;
        int len = array.length;

        while(right < len){
            if(array[left] == array[right]){
                count++;
            }
            left++;
            right++;
        }

        System.out.println(len - count);


    }
}
