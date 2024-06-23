package com.javacourse.se.io;

import com.javacourse.se.caesarcipher.Cipher;

import javax.swing.*;

public class Main {

        public static void main(String[] args) {


            Cipher openCaesar = new Cipher();


            int goAgain = 1;


            while (goAgain == 1) {
                String answer = openCaesar.encryptDecrypt();
                switch (answer) {
                    case "E":
                        // System.out.println("Ми у зашифрувати");
                        openCaesar.getPlainText();
                        openCaesar.getKey();
                        openCaesar.encrypt();
                        break;
                    case "D":
                        // System.out.println("Ми у розшифрувати");
                        openCaesar.getPlainText();
                        openCaesar.getKey();
                        openCaesar.decrypt();
                        break;


                }
                String msg = "Ви б хотіли зробити це знову (Оберіть: Так(Y)/Ні(N)): ";
                answer = JOptionPane.showInputDialog(msg);


                //7JOptionPane.showMessageDialog(null, answer);


                if ((answer.equals("Y")) || (answer.equals("y")) || (answer.equals("Yes")) || (answer.equals("yes"))) {
                    goAgain = 1;
                }
                else {
                    goAgain = 0;
                    JOptionPane.showMessageDialog(null, "Дякую! Завітайте знову!");
                }

            }
        }
    }

