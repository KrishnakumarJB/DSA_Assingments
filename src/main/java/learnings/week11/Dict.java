package learnings.week11;


import java.util.ArrayList;
import java.util.List;

public class Dict {

    /**
     *
     * Take a window size of the list 1st element
     *
     * @param args
     */

    public static void main(String[] args) {
       String  s = "applepenapple";
       List<String> wordDict = new ArrayList<String>();
       wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak(s,wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        StringBuilder br = new StringBuilder();
        int i = 0;
        int count=0;
        for(String str : wordDict){
            System.out.println(str);
             count = str.length();

            for ( i = 0; i < count; i++) {
//                System.out.println(s.charAt(i));
                br.append(s.charAt(i));
            }
            System.out.println(br);
//            wordDict.equals(br);
            if(!wordDict.contains(br.toString())){
                return false;
            } else{

                i += count;
                System.out.println(i);
            }
            br.delete(0, str.length());
        }

        return true;
    }
}
