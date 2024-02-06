package src.Juegos21;

public class PrincipalGO21 {
    public static void main(String[] args) {
            GameOf21 game = new GameOf21();
            game.playerTurn();
            game.computerTurn();
            System.out.println(game.checkWinner());
        }
    }
