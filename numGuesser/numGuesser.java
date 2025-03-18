
import javax.swing.*;
import java.io.*;
import java.math.*;

public class numGuesser {
    boolean choice = true;
    int count = 0;
    int number = (int) (Math.random() * 100);do
    {
        String value = JOptionPane.showInputDialog("Guess a number between 1 and 100");
        int val = Integer.parseInt(value);
        if (val == number) {
            count++;

            JOptionPane.showMessageDialog(null, "You guessed the number " + val + " in " + count);
        } else if (val < number) {
            count++;
            JOptionPane.showMessageDialog(null, "Too Low!");
        } else if (val > number) {
            count++;
            JOptionPane.showMessageDialog(null, "Too High!");
        } else {
            count++;
            JOptionPane.showMessageDialog(null, " Enter in range");
        }
        String guess = JOptionPane.showInputDialog("Do you want to continue(y/n)?");
        if (guess == "y" || guess == "Y" || guess == "yes") {
            choice = true;
        } else if (guess == "n" || guess == "N" || guess == "no") {
            choice = false;
        } else {
            JOptionPane.showMessageDialog(null, "Enter correct value");
        }
    }while(choice==true);
}