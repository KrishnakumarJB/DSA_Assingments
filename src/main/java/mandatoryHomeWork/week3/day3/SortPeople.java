package mandatoryHomeWork.week3.day3;

import java.util.Arrays;

public class SortPeople {

    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
                sortPeople(names, heights);
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        int[][] people = new int[names.length][2];
        for (int i = 0; i < names.length; i++)
            people[i]  = new int[] {heights[i], i};


        Arrays.sort(people, (a, b) -> b[0] - a[0]);

        String[] res = new String[names.length];

        for (int i = 0; i < names.length; i++)
            res[i] = names[people[i][1]];

        return res;
    }
}
