package crackTheCode;

import javax.swing.*;
import java.io.*;

public class crackTheCode {
    public static void main(String args[]) throws Exception {
        File file = new File("password.psswrd");
        String input = JOptionPane.showInputDialog("1.Press 1 to set the password\n2.Press 2 to unlock the message");
        if (input.equals("1")) {

            FileOutputStream outStream = new FileOutputStream(file);
            PrintWriter out = new PrintWriter(outStream);
            String text = JOptionPane.showInputDialog("Enter the password");
            out.println(text);
            out.flush();
            out.close();
            outStream.close();
        } else if (input.equals("2")) {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            String guess = JOptionPane.showInputDialog("Guess the password?");
            if (guess.equals(line)) {
                JOptionPane.showMessageDialog(null, "Success");
            } else {
                JOptionPane.showMessageDialog(null, "Failure");
            }
            br.close();
            fr.close();
        }
    }
}