package mandatoryHomeWork.week4.day5;

public class LogFold {

    public static void main(String[] args) {
        String[] s = {"d1/","d2/","../","d21/","./"};
        minOperations(s);
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        int length = logs.length;

        for(int i = 0; i < length; i++) {
            if(logs[i].equals("../")) {
                count--;
            } else if(logs[i].equals("./")) {
                continue;
            } else {
                count++;
            }
            if(count <= 0) {
                count = 0;
            }
        }

        return count;
    }
}
