package learnings.weeklearning9;

public class BinarySearch_String {

    public static void main(String[] args) {
//        char[] arr = {'x','x','y','y'};
        char[] arr = {'c','f','j'};
        int target = 'c';
        char ans =  binarySear(arr, target);
        System.out.println(ans);
    }

    public static char binarySear(char[] letters, int target){

        int left =0, right = letters.length-1;
        int mid = 0;
        while(left <= right){
            mid = left + (right-left)/2;

            if(target < letters[mid]){
                right = mid-1;
            } else{
                left = mid+1;
            }

        }
         if(left <= letters.length){
                 return letters[0];
             }
        System.out.println(left % letters.length);
        return letters[left];


    }
}
