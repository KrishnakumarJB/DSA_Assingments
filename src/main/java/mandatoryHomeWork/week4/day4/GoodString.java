package mandatoryHomeWork.week4.day4;

import java.util.Stack;

public class GoodString {

    public static void main(String[] args) {
        String s ="";
        makeGood(s);
    }

    public static String makeGood(String s) {

        Stack<Character> stk1 = new Stack();

        for(Character c : s.toCharArray()){

            if(!stk1.empty() &&  Math.abs(c - stk1.peek())==32 ){

                stk1.pop();
            } else{
                stk1.push(c);
            }

        }

        StringBuilder s1 = new StringBuilder();
        for(Character ch:stk1)
        {
            s1.append(ch);

        }
        return s1.toString();



    }
}
