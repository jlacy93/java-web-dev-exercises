package exercises;
import java.util.Scanner;

public class AliceWonderland {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String aliceLowerCase = alice.toLowerCase();
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a word from the first sentence of Alice and Wonderland: ");
        String word = input.next();
        String wordLowerCase = word.toLowerCase();
        boolean contains = aliceLowerCase.contains(wordLowerCase);

        if(contains){
            System.out.println("Your word is in the sentence! It is the index: " + aliceLowerCase.indexOf(wordLowerCase) + " and your search word is " + wordLowerCase.length() + " characters long.");
        } else {
                    System.out.println("Your word is not in the sentence.");
                }
    }
}
