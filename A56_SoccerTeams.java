//This program calculates the number of soccer teams that a youth league may create from the number of available player.
//Input validation is demonstrared with while loops.

import javax.swing.JOptionPane;

public class A56_SoccerTeams {
    public static void main(String[] args) {
        final int MIN_PLAYERS = 9; // minimum players per team
        final int MAX_PLAYER = 15; // maximum players per team
        int players; // number of available players
        int teamSize; // number of players per team
        int teams; // number of teams
        int leftOver; // number of leftover players
        String input; // to hold the user inputs

        // Get the number of players per team

        input = JOptionPane.showInputDialog("Enter the number of players per team.");

        teamSize = Integer.parseInt(input);

        // validate the number entered

        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYER) {
            input = JOptionPane.showInputDialog("The number must be at least " + MIN_PLAYERS + " and no more than " + MAX_PLAYER +
                            ". \n Enter the number of players.");

            teamSize = Integer.parseInt(input);
        }
        // get the number of available players

        input = JOptionPane.showInputDialog("Enter the available nubmer of players.");

        players = Integer.parseInt(input);

        // validate the number entered

        while (players < 0) {
            input = JOptionPane.showInputDialog("Enter 0 or Greater.");

            players = Integer.parseInt(input);
        }

        // calculate the number of team

        teams = players / teamSize;

        // calculate teh number of left over players.

        leftOver = players % teamSize;

        // Display the results

        JOptionPane.showMessageDialog(null, "There will be " + teams + " team with " + leftOver + " players left over.");

        System.exit(0);
    }

}
