import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> wordSet = new ArrayList<>();
        wordSet.add("banana");
        wordSet.add("pineapple");
        wordSet.add("mango");
        wordSet.add("ant");
        wordSet.add("orange");
        wordSet.add("apple");
        wordSet.add("kiwi");
        wordSet.add("papaya");
        wordSet.add("cherry");
        wordSet.add("spider");

        SpellChecker spellChecker = new SpellChecker(wordSet);

        System.out.print("Enter your word : ");
        String word = scanner.nextLine();

        ArrayList<String> suggestions = spellChecker.spellCheck(word);

        if (suggestions.contains(word)) {
            System.out.println("Word is correct.");
            return;
        }else if (suggestions.isEmpty()) {
            System.out.println("Word isn't found.");
        } else {
            for (String s : suggestions) {
                System.out.println("Word is incorrect.\nDid you mean "+s+" ?");
                break; //stop printing several times
            }
        }
        scanner.close();
    }
}