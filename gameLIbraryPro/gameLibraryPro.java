package gameLIbraryPro;

import javax.swing.*;
import java.util.*;

public class gameLibraryPro {
    public static void main(String[] args) {

        ArrayList game = new ArrayList();
        boolean choice = true;
        do {
            String option = JOptionPane.showInputDialog("Press 1 to add a new game.\nPress 2 to access a game");
            if (option.equals("1")) {
                String name = JOptionPane.showInputDialog("Enter game name: ");
                game.add(name);

            } else if (option.equals("2")) {
                String element = JOptionPane.showInputDialog("Which element?");
                Object value = game.get(Integer.parseInt(element));
                JOptionPane.showMessageDialog(null, "The game name is " + value);
            }
            String val = JOptionPane.showInputDialog("Do you want to continue\nPress 1 for yes\nPress 2 for No");
            if (val.equals("1")) {
                choice = true;
            } else if (val.equals("2")) {
                choice = false;
            }

        } while (choice == true);
    }
}
