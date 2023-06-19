package mandatoryHomeWork.week3.day5;

public class GreaterLetter {

    static String letaaters = "abfj";
    //"cfj"
    static char target = 'a';

    static char [] letters = letaaters.toCharArray();


    public static void main(String[] args) {
        nui(letters,target);
    }

//	char target = 'a';

    //	@Test
    public static char nui(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
//	            char target = 'a';
            if (letters[i] > target) {
                System.out.println(letters[i]);
                return letters[i];
            }


        }
        System.out.println(letters[0]);
        return letters[0];
    }
}
