package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    private int rounds = 0;
    private int playerScore = 0;
    private int computerScore = 0;
    private boolean end = false;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.print("What's your name?: ");
        String name = scanner.nextLine();
        System.out.print("How many winning rounds for victory? : ");
        int roundsToWin = scanner.nextInt();

        while (!end) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Pick your option: 1 - rock, 2 - paper, 3 - scissors, x - end game, n - new game: ");
            String userChoice = sc.nextLine();
            int computerChoice = computerTurn();

            if (userChoice.equals(String.valueOf(computerChoice))) {
                rounds++;
                System.out.println("Rounds: " + rounds + ", DRAW" +
                        "\nScore: you: " + playerScore + ", computer: " + computerScore);
            } else {
                switch (userChoice) {
                    case "1":
                        if (computerChoice == 2)
                            roundForComputer();
                        else
                            roundForPlayer();
                        break;
                    case "2":
                        if (computerChoice == 3)
                            roundForComputer();
                        else
                            roundForPlayer();
                        break;
                    case "3":
                        if (computerChoice == 1)
                            roundForComputer();
                        else
                            roundForPlayer();
                        break;
                    case "x":
                        System.out.println("Are you sure to end the game? (y/n)");
                        if (sc.nextLine().equals("y")) {
                            end = true;
                            System.out.println("Game stopped!");
                        }
                        break;
                    case "n":
                        System.out.println("Are you sure to restart the game? (y/n)");
                        if (sc.nextLine().equals("y")) {
                            rounds = 0;
                            computerScore = 0;
                            playerScore = 0;
                            System.out.println("New game has started!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
            if (playerScore == roundsToWin) {
                sc.close();
                end = true;
                System.out.println("You won the game " + name + "!");
            } else if (computerScore == roundsToWin) {
                sc.close();
                end = true;
                System.out.println("You lost the game! Computer won");
            }
        }
        scanner.close();
    }

    private int computerTurn() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    private void roundForComputer() {
        rounds++;
        computerScore++;
        System.out.println("Rounds: " + rounds + ", Computer won this round" +
                "\nScore: you: " + playerScore + ", computer: " + computerScore);
    }

    private void roundForPlayer() {
        rounds++;
        playerScore++;
        System.out.println("Rounds: " + rounds + ", You won this round" +
                "\nScore: you: " + playerScore + ", computer: " + computerScore);
    }
}
