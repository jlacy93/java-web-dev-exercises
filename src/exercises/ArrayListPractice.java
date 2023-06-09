package exercises;
import java.util.ArrayList;
import java.util.Scanner;
;

public class ArrayListPractice {
        public static int sumEven(ArrayList<Integer> arr) {
            int total = 0;
            for (int integer : arr) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        };

        public static ArrayList<String> fiveLetterWord(ArrayList<String> arr){
            ArrayList<String> fiveLetterList = new ArrayList();
            for(String word : arr){
               if(word.length() == 5){
                   fiveLetterList.add(word);
               }
            }
            return fiveLetterList;
        };

        public static ArrayList<String> wordSearchByEntry(ArrayList<String> arr){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word length: ");
            ArrayList<String> returnList = new ArrayList();
            int numChars = input.nextInt();
            for(String word : arr){
                if(word.length() == numChars){
                    returnList.add(word);
                }
            } return returnList;
        }
    public static void main(String[] args) {
        ArrayList<Integer> practiceList = new ArrayList();
        practiceList.add(1);
        practiceList.add(2);
        practiceList.add(3);
        practiceList.add(4);

        System.out.println(ArrayListPractice.sumEven(practiceList));

        ArrayList<String> practiceListTwo = new ArrayList();
        practiceListTwo.add("hello");
        practiceListTwo.add("darkness");
        practiceListTwo.add("my");
        practiceListTwo.add("old");
        practiceListTwo.add("friend");
        practiceListTwo.add("sleep");

        System.out.println(fiveLetterWord(practiceListTwo));
        System.out.println(wordSearchByEntry(practiceListTwo));

    }


}
