package learnings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        primeOrNor(n);

//        System.out.println(n);
    }

    static boolean primeOrNor(int num){

        if(num <=1){
            return false;
        }

        int c =2;
        boolean isPrime = true;

        while(c * c <= num){
            if(num % c == 0){
                System.out.println("false");
                isPrime = false;
            }
            if(isPrime == true){
                isPrime = true;
            }
            c++;
        }

        return isPrime;

//        while(c * c <=num){
//            if(num % c == 0){
//                System.out.println("false");
//                return false;
//            }
//            c++;
//        }
//        return c * c > num;

//        for(int i =2; i<= num; i++){
//            if(num / i == 0){
//                System.out.println("false");
//                return false;
//            }
//
//        }
//        System.out.println("true");
//        return true;
    }
}