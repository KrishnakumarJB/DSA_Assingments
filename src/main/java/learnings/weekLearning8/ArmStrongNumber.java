package learnings.weekLearning8;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int one = in.nextInt();
        armStrong(one);
    }
    //123
    static int armStrong(int num){
        int sum = 0, rem, cube;

        while(num > 0){
            rem = num%10;
            cube = rem*rem*rem*rem;
            sum += cube;
            num = num/10;
        }
        System.out.println(sum);
        return sum;
    }
}
