package learnings.week12;

import java.util.Arrays;

public class DividePlayers {


    public static void main(String[] args) {
     int[]   skill = {3,2,5,1,3,4};

        System.out.println(dividePlayers(skill));
    }

    public static long dividePlayers(int[] skill) {

        int left =1, right = skill.length-1, max = 0, sum = 0, min;
        long total = 0;
        Arrays.sort(skill);
        int sumInit = skill[0] + skill[right];
        total = skill[0] * skill[right];
        int len = right-1;
        while(left < len){
            sum = skill[left]+skill[len];
            if(sum != sumInit){
                return -1;
            }
            total +=  skill[left]*skill[len];
            left++;
            len--;
        }
        return total;

    }
}
