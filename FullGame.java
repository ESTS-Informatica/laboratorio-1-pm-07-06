/**
 * The full game
 *
 * @Jose
 * @13/03/2023
 */
public class FullGame
{
    private WordGuessingGame game;
    private InputReader reader;
    /**
     * Construtor for the full game
     */
    public FullGame(){
        game = new WordGuessingGame();
        reader = new InputReader();
    }
    /**
     * Start the game
     */
    public void play(){
        char answer;
        do{
            game.play();
            game.reset();
            answer = reader.getChar("Para continuar a jogar escreva S: ");
        }while(answer == 'S' || answer == 's');
    }
}