import java.util.ArrayList;

public class SpellChecker {
    private ArrayList<String> wordSet;

    public SpellChecker(ArrayList<String> wordSet) {
        this.wordSet = wordSet;
    }

    public ArrayList<String> spellCheck(String word) {

        ArrayList<String> suggestions = new ArrayList<>();

        if (wordSet.contains(word)) {
            suggestions.add(word);
            return suggestions;
        }
        for (int x = 0; x < word.length() - 1; x++) {//swap adjacent char
            String swapped = swap(word, x, x + 1);
            if (wordSet.contains(swapped)) {
                suggestions.add(swapped);
            }
        }
        for (int i = 0; i < word.length(); i++) {//insert single char
            for (char character = 'a'; character <= 'z'; character++) {
                String inserted = insert(word, i, character);
                if (wordSet.contains(inserted)) {
                    suggestions.add(inserted);
                }
            }
        }
        for (int i = 0; i < word.length(); i++) {//delete a single char
            String deleted = delete(word, i);
            if (wordSet.contains(deleted)) {
                suggestions.add(deleted);
            }
        }
        for (int i = 0; i < word.length(); i++) {//replace a char in a word with another char
            for (char character = 'a'; character <= 'z'; character++) {
                String replaced = replace(word, i, character);
                if (wordSet.contains(replaced)) {
                    suggestions.add(replaced);
                }
            }
        }
        return suggestions;
    }

    private String swap(String word, int i, int j) {
        char[] chars = word.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }

    private String insert(String word, int i, char character) {
        StringBuilder sb = new StringBuilder(word);
        sb.insert(i, character);
        return sb.toString();
    }

    private String delete(String word, int i) {
        StringBuilder sb = new StringBuilder(word);
        sb.deleteCharAt(i);
        return sb.toString();
    }

    private String replace(String word, int i, char character) {
        StringBuilder sb = new StringBuilder(word);
        sb.setCharAt(i, character);
        return sb.toString();
    }
}