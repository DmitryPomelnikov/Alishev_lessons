package CodeWar;

public class RockPaperScissors {
    /**
     * Rock Paper Scissors
     * Let's play! You have to return which player won! In case of a draw return Draw!.
     * <p>
     * Examples(Input1, Input2 --> Output):
     * <p>
     * "scissors", "paper" --> "Player 1 won!"
     * "scissors", "rock" --> "Player 2 won!"
     * "paper", "paper" --> "Draw!"
     */
    public static void main(String[] args) {
        System.out.println(RPSKata.rps("scissors", "rock"));
        System.out.println(RPSKata.rps("scissors", "scissors"));
        System.out.println(RPSKata.rps("scissors", "paper"));
    }
}

class RPSKata {
    public static String rps(String p1, String p2) {
        String winner = "";
        if (p1.equals("scissors")) {
            winner = p2.equals("paper") ? "Player 1 won!" : p2.equals("rock") ? "Player 2 won!" : "Draw!";
        } else if (p1.equals("paper")) {
            winner = p2.equals("rock") ? "Player 1 won!" : p2.equals("scissors") ? "Player 2 won!" : "Draw!";
        } else if (p1.equals("rock")) {
            winner = p2.equals("scissors") ? "Player 1 won!" : p2.equals("paper") ? "Player 2 won!" : "Draw!";
        }
        return winner;
    }

    //чужое решение
    public static String rps2(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1 + p2) ? 1 : 2) + " won!";
    }
}
