package mandatoryHomeWork.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class AdjacentDuplicates {

    public static void main(String[] args) {

        String s = "abbaca";


        merge(s);

    }


    public static String merge(String s){
        StringBuilder sb=new StringBuilder() ;
        for(char c:s.toCharArray()){
            int size=sb.length();
            if(size>0 && sb.charAt(size-1)==c){
                sb.deleteCharAt(size-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
