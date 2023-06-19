package mandatoryHomeWork.week1.day5;

public class CountOfMatches {
    public static void main(String[] args) {
        int n = 7;
        int count =0;
        while(n>1){
            if(n%2==0){
                count = count + (n/2);
                n = n/2;
            }else{
                count = count + ((n-1)/2);
                n=((n-1)/2)+1;
            }
        }
        System.out.println(count);
    }
}
