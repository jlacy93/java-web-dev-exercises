package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        HashMap<Character, Integer> characterCount = new HashMap<>();
        String reviewText;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to review: ");
        reviewText = input.nextLine();
        reviewText.toLowerCase();
        input.close();

        for(int i = 0; i < reviewText.length(); i++){
            char currentChar;
            currentChar = reviewText.charAt(i);
            if(characterCount.containsKey(currentChar)){
                characterCount.put(currentChar, characterCount.get(currentChar) + 1);
            } else {
                characterCount.put(currentChar, 1);
            }
        }
     System.out.println("Here's  the breakdown of characters in your text: ");
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
