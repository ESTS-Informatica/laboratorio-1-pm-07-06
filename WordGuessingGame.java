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
    /**
     * Returns the word to be guessed.
     * @return String returns the word to be guessed
     */
    public String getHiddenWord(){return hiddenWord;}
    /**
     * Returns the word guessed so far, with underscore for letters not yet guessed
     * @return String the word guessed so far
     */
    public String getGuessedWord(){return guessedWord;}
    /**
     * Returns the number of tries at guessing the word
     * @return int the number of tries at guessing the word
     */
    public int getNumOfTries(){return numberOfTries;}
    /**
     * Prints to the console the word guessed so far
     */
    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
    /**
     * Reads the letters the user types until he guesses the word
     */
    public void play(){
        showWelcome();
        do{
            showGuessedWord();
            char guessChar = reader.getChar("Digite uma letra: ");
            guess(guessChar);
        }while(!guessedWord.equals(hiddenWord));
        showGuessedWord();
        showResult();
    }
    /**
     * Shows the welcome message in the console
     */
    private void showWelcome(){
        System.out.println("Bem vindo ao Jogo da Forca!");
        System.out.println("Tenta adivinhar a palavra escondida.");
    }
    /**
     * Verifies if the letter is not already discovered and if it's in the word being guessed.
     * If it is, add the letter in the string with the word guessed so far.
     * Increases the number of tries, even if letter was already discovered.
     * @param guessChar char the letter to verify if it is in the word being guessed
     */
    private void guess(char guessChar){
        if(guessedWord.indexOf(guessChar) == -1 && Character.isLetter(guessChar)){
            char[] guessedWordChars = guessedWord.toCharArray();
            for(int i=0; i<hiddenWord.length(); i++){
                if(guessChar == hiddenWord.charAt(i)){
                    guessedWordChars[i] = guessChar;
                }
            }
            guessedWord = new String(guessedWordChars);
        }
        numberOfTries++;
    }
    /**
     * Shows the total of attempts at guessing the word in the console
     */
    private void showResult(){System.out.println("Total de tentativas: " + numberOfTries);}
}