package com.javacourse.se.caesarcipher;

import javax.swing.*;

public class Cipher {

        private String plainText = "";
        private String encodedText = "";
        private int key;
        private String answer = "";
        private String alpha = "абвгґдеєжзиіїйклмнопрстуфхцчшщьюя0123456789.:";
        //private String alpha = "abcdefghijklmnopqrstuwxyz0123456789";
        //Scanner kbd = new Scanner(System.in);
        public Cipher() {

            //System.out.println("Entered the Caesar constructor");

        }
        public String encryptDecrypt() {
            while (true) {
                //System.out.println("Ви хочете зашифрувати(E) чи розшифрувати(D) текст?");
                answer = JOptionPane.showInputDialog("Ви хочете зашифрувати(E) чи розшифрувати(D) текст? Оберіть:(E/D)");
                //answer = kbd.nextLine();
                //System.out.println("You have chosen: " + answer);
                answer = String.valueOf(answer.charAt(0)).toUpperCase();
                //answer = answer.substring(0).toUpperCase();
                if (answer.equals("E") || answer.equals("D")) {
                    break;
                }
                else {
                    //System.out.println("Error! Будь ласка спробуйте ще раз!");
                    JOptionPane.showMessageDialog(null, "Error! Будь ласка спробуйте ще раз!");
                }
            }
            //System.out.println(answer);
            return answer;




        }


        public void getPlainText() {
            //System.out.println("Please enter the plain text message");
            plainText = JOptionPane.showInputDialog("Будь ласка, введіть звичайний текст");
            plainText = plainText.toLowerCase();
            //plainText = kbd.next();
            //System.out.println("You have entered: " + plainText);
        }
        public void getKey() {
            //System.out.println("Please enter the shift key");
            //key = kbd.nextInt();
            String key = JOptionPane.showInputDialog("Будь ласка, введіть ключ до шифру");
            this.key = Integer.parseInt(key);
            //System.out.println("You have entered a shift key: " + key);


        }


        public void encrypt() {
            encodedText = "";
            for (int i = 0; i<plainText.length(); i++) {
                if (!alpha.contains(String.valueOf(plainText.charAt(i)))) {
                    encodedText += plainText.charAt(i);
                }
                else {
                    //System.out.println(plainText.charAt(i));

                    encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key)%alpha.length());

                }

            }

            //System.out.println(encodedText);
            JOptionPane.showMessageDialog(null, encodedText);


        }



        public void decrypt() {
            encodedText = "";

            for (int i = 0; i<plainText.length(); i++) {
                if (!alpha.contains(String.valueOf(plainText.charAt(i)))) {
                    encodedText += plainText.charAt(i);
                }
                else {
                    encodedText += alpha.charAt(((alpha.indexOf(plainText.charAt(i)) - key)+alpha.length())%alpha.length());
                    //System.out.println(encodedText);

                }

                //System.out.println(encodedText);

            }
            JOptionPane.showMessageDialog(null, encodedText);


        }
    }

