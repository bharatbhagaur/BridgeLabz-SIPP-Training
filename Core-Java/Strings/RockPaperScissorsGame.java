import java.util.Scanner;

public class RockPaperScissorsGame {


    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "";
        };
    }

    public static String getWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "draw";
        }
        return switch (player) {
            case "rock" -> (computer.equals("scissors")) ? "player" : "computer";
            case "paper" -> (computer.equals("rock")) ? "player" : "computer";
            case "scissors" -> (computer.equals("paper")) ? "player" : "computer";
            default -> "invalid";
        };
    }

    public static String[][] getStats(int games, int playerWins, int computerWins, int draws) {
        double playerWinPct = (playerWins * 100.0) / games;
        double computerWinPct = (computerWins * 100.0) / games;

        return new String[][] {
            {"Category", "Player", "Computer"},
            {"Wins", String.valueOf(playerWins), String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws), String.valueOf(draws)},
            {"Win %", String.format("%.2f", playerWinPct) + "%", String.format("%.2f", computerWinPct) + "%"}
        };
    }

    public static void displayResults(String[][] resultTable) {
        System.out.println("\n----- Game Statistics -----");
        for (String[] row : resultTable) {
            System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWins = 0, computerWins = 0, draws = 0;

        System.out.print("Enter number of games to play: ");
        int games = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= games; i++) {
            System.out.print("\nGame " + i + " - Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = getWinner(playerChoice, computerChoice);

            System.out.println("Computer chose: " + computerChoice);

            switch (winner) {
                case "player" -> {
                    System.out.println("Result: You win!");
                    playerWins++;
                }
                case "computer" -> {
                    System.out.println("Result: Computer wins!");
                    computerWins++;
                }
                case "draw" -> {
                    System.out.println("Result: It's a draw!");
                    draws++;
                }
                default -> System.out.println("Invalid input!");
            }
        }

        String[][] stats = getStats(games, playerWins, computerWins, draws);
        displayResults(stats);
    }
}

