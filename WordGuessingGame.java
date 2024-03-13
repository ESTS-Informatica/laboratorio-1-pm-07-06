/**
 * A word guessing game.
 *
 * @jose (202300558)
 * @13/03/2024
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    /**
     * Constructor for the word guessing game
     */
    public WordGuessingGame(){
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        reader = new InputReader();
    }
    public String getHiddenWord(){return hiddenWord;}
    public String getGuessedWord(){return guessedWord;}
    public int getNumOfTries(){return numberOfTries;}
    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
    /*
    public void play(){}
    private void showWelcome(){}
    private boolean guess(char guessChar){
        if(guessedWord.indexOf(guessChar) != -1){
            return false;
            // Word already guessed
        }
        for(int i=0; i<hiddenWord.length(); i++){
            if(guessChar == hiddenWord.charAt(i)){
                guessedWord = guessedWord.substring(0, i) + guessChar + guessedWord.substring(i, guessedWord.length());
            }
        }
        return true;
    }*/
}