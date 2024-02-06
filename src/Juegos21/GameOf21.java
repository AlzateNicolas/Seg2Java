package src.Juegos21;

import java.util.Random;
import java.util.Scanner;

        public class GameOf21 {
            private int playerScore;
            private int computerScore;
            private Random random;
            private Scanner scanner;

            public GameOf21() {
                random = new Random();
                scanner = new Scanner(System.in);
                playerScore = random.nextInt(10) + 1 + random.nextInt(10) + 1;
                computerScore = random.nextInt(10) + 1 + random.nextInt(10) + 1;
            }

            public void playerTurn() {
                String decision;
                do {
                    System.out.println("Tu puntuación actual es: " + playerScore);
                    System.out.println("¿Quieres otra carta (S/N)?");
                    decision = scanner.nextLine().toUpperCase();
                    if (decision.equals("S")) {
                        playerScore += random.nextInt(10) + 1;
                        System.out.println("Has sacado una carta. Tu puntuación ahora es: " + playerScore);
                    }
                } while (decision.equals("S") && playerScore <= 21);
            }

            public void computerTurn() {
                while (computerScore < 16) {
                    computerScore += random.nextInt(10) + 1;
                }
            }

            public String checkWinner() {
                System.out.println("Tu puntuación final es: " + playerScore);
                System.out.println("La puntuación final de la computadora es: " + computerScore);
                if (playerScore > 21 && computerScore > 21) {
                    return "Ambos jugadores han perdido.";
                } else if (playerScore > 21) {
                    return "La computadora gana.";
                } else if (computerScore > 21) {
                    return "El jugador gana.";
                } else if (playerScore > computerScore) {
                    return "El jugador gana.";
                } else if (computerScore > playerScore) {
                    return "La computadora gana.";
                } else {
                    return "Es un empate.";
                }
            }
        }