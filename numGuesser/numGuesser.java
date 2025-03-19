
import javax.swing.*;
import java.io.*;
import java.math.*;

public class numGuesser {

    public static void main(String[] args) {

        boolean choice = true;
        int count = 0;
        int val = -1;
        int number = (int) (Math.round(Math.random() * 100));

        do {
            String value = JOptionPane.showInputDialog("Guess a number between 1 and 100");
            val = Integer.parseInt(value);
            if (val == number) {
                count++;

                JOptionPane.showMessageDialog(null, "You guessed the number " + val + " in " + count);
                break;
            } else if (val < number) {
                count++;
                JOptionPane.showMessageDialog(null, "Too Low!");
            } else {
                count++;
                JOptionPane.showMessageDialog(null, "Too High!");
            }

        } while (true);
    }
}
