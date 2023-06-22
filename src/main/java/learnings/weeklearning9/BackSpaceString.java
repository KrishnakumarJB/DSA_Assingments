package learnings.weeklearning9;

import org.junit.Test;

import java.util.Stack;

public class BackSpaceString {

    @Test
    public void bb(){
       String  s = "ab#c", t = "ad#c";

        Stack<Character> stack1= new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(!stack1.isEmpty() && c =='#') {
                stack1.pop();
            }
            else{
                if(c!='#')
                    stack1.push(c);

            }
        }
        for(int i=0;i<t.length();i++){
            char c= t.charAt(i);
            if(!stack2.isEmpty() && c =='#') {
                stack2.pop();
            }
            else{
                if(c!='#')
                    stack2.push(c);

            }
        }

        if(stack1 == stack2){
//            return true;
        }
//        int left = 0, right = s.length()-1;
//        StringBuilder bd = new StringBuilder();
//
//        while(left < right){
//            if(s.charAt(left) != '#' && s.charAt(left+1) !='#' ){
//                bd.append(s.charAt(left));
//                left++;
//            }  if (s.charAt(right) != '#' && s.charAt(right-1) !='#') {
//                bd.append(s.charAt(right));
//                right--;
//            }
//
//
//        }
    System.out.println(stack1);
//    return false;
    }
}
