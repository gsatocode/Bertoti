package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        boolean flag = true;

        while(flag) {

            Scanner user = new Scanner(System.in);

            System.out.println("Digite: ");
            String conversation = user.nextLine();

            if (conversation.equals("close")) {
                factory.turnOffModel();
                factory.desligarServidor();

                break;
            } else {

                factory.setContent(conversation);

                String prompt = factory.getPrompt();

                System.out.println("Prompt mysql: " + prompt);
            }
        }
    }
}
