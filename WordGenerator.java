import java.util.ArrayList;
import java.util.Random;
/**
 * Generates a word to be guessed.
 *
 * @Jose
 * @13/03/2024
 */
public class WordGenerator
{
    private ArrayList<String> words;
    /**
     * Adds the reserved java keywords to the list
     */
    private void fillArrayList(){
        String[] reservedWords = {"boolean", "break", "byte", "case", "char", "class", "continue", "do", "double", "else", "enum", "for", "if", "import", "int"};
        for(String s : reservedWords){
            words.add(s);
        }
    }
    /**
     * Returns a random word from the list
     * @return String a random word from the list
     */
    public String generateWord(){
        int numElements = words.size();
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(numElements);
        return words.get(randomNum);
    }
    /**
     * Adds a word to the list if it doesn't already contains it
     * @param word String the word to add to the list
     */
    public void addWord(String word){
        if(word != null && !words.contains(word)){
            words.add(word);
        }
    }
}