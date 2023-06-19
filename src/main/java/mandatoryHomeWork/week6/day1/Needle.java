package mandatoryHomeWork.week6.day1;

public class Needle {

    public static void main(String[] args) {

        String h = "leetcode", needle = "leeto";

        System.out.println(strStr(h,needle));

    }

    public static int strStr(String h, String nee) {
        int n=nee.length();
        int hayLength=h.length();
        for(int i=0;i<hayLength-n+1;i++){
            if(h.substring(i,i+n).equals(nee)){
                return i;
            }
        }
        return -1;
    }
}
