package event;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Authentification {
    static int userid;

    public Authentification() {
    }

    public static int register(String email, String password) throws IOException {
        boolean checkEmail = false;
        boolean checkPassword = false;
        boolean flag = false;

        try {
            File userfile = new File("users.txt");
            Scanner myReader = new Scanner(userfile);

            while(myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] parts = data.split("/");
                if (parts[0].equals(email)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException var13) {
            System.out.println("User file not found.");
            var13.printStackTrace();
        }

        if (flag) {
            JOptionPane.showMessageDialog((Component)null, "The entered e-mail already exists");
        } else if (email.contains("@") && email.contains(".com")) {
            if (email.contains("/")) {
                JOptionPane.showMessageDialog((Component)null, "E-mail must not contain /.");
            } else {
                checkEmail = true;
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "The entered e-mail is invalid");
        }

        if (password.contains("/")) {
            JOptionPane.showMessageDialog((Component)null, "Password must not contain /.");
        } else {
            checkPassword = true;
        }

        String userformat = email + "/" + password + "/0-0-0-0-0/";
        int index = -1;
        if (checkEmail && checkPassword) {
            FileWriter fw = new FileWriter("users.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            try {
                bw.write(userformat + "0-");
            } catch (Throwable var12) {
                try {
                    bw.close();
                } catch (Throwable var11) {
                    var12.addSuppressed(var11);
                }

                throw var12;
            }

            bw.close();
            File userfile = new File("users.txt");
            Scanner myReader = new Scanner(userfile);

            while(myReader.hasNextLine()) {
                ++index;
                myReader.nextLine();
            }
        }

        return index;
    }

    public static int login(String email, String password) {
        int index = -1;
        boolean flag = false;

        File userfile;
        Scanner myReader;
        String data;
        String[] parts;
        try {
            userfile = new File("users.txt");
            myReader = new Scanner(userfile);

            while(myReader.hasNextLine()) {
                ++index;
                data = myReader.nextLine();
                parts = data.split("/");
                if (parts[0].equals(email)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException var9) {
            System.out.println("User file not found.");
            var9.printStackTrace();
        }

        if (flag) {
            try {
                userfile = new File("users.txt");
                myReader = new Scanner(userfile);

                for(int i = 0; i < index; ++i) {
                    myReader.nextLine();
                }

                data = myReader.nextLine();
                parts = data.split("/");
                if (password.equals(parts[1])) {
                    return index;
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Incorrect password, please try again");
                    return -1;
                }
            } catch (FileNotFoundException var8) {
                System.out.println("User file not found.");
                var8.printStackTrace();
                return index;
            }
        } else {
            JOptionPane.showMessageDialog((Component)null, "No user found using that e-mail");
            return -1;
        }
    }
}
