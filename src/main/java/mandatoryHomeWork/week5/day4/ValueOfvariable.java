package mandatoryHomeWork.week5.day4;

public class ValueOfvariable {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public  static int finalValueAfterOperations(String[] operations) {
        StringBuilder sb = new StringBuilder();

        for(String strName : operations) {
            sb.append(strName);
        }

        System.out.println(sb);

        int right = 0, count = 0;

        while(right<sb.length()) {

            if(sb.charAt(right) == 'X' &&
                    ((sb.charAt(right+1) == '-') || (sb.charAt(right-1) == '-'))) {
                count--;
            } else if(sb.charAt(right) == 'X' &&
                    ((sb.charAt(right-1) == '+') || (sb.charAt(right+1) == '+'))){
                count++;
            }

            right++;
            // System.out.println(count);
        }
        return count;
    }
}
