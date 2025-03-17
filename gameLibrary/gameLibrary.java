package gameLibrary;

import javax.swing.*;
import java.io.*;

public class gameLibrary {
    public static void main(String[] args) {
        String gameName[] = { "Mario & Luigi", "Subway Surfers", "Guessing Game :Akinator", "Temple Run",
                "Zombie Apocslyse" };
        boolean choice = false;
        int i;
        do {
            String value = JOptionPane.showInputDialog("Which Element?");
            String answer = gameName[Integer.parseInt(value) - 1];
            JOptionPane.showMessageDialog(null, "The name of the game is " + answer);
            String choose = JOptionPane.showInputDialog("Do you want to continue?\n1 for Yes\n2 for No");
            if (choose.equals("2")) {
                choice = true;
            } else {
                choice = false;
            }

        } while (choice == false);
    }
}
