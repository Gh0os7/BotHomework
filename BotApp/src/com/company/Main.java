package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Bot bot = new Bot("Jhonny");
        Scanner scanner = new Scanner(System.in);
        String userInput;
      do {
        bot.askQuestion();
        userInput = scanner.nextLine();
        bot.recognizeInput(userInput);
      } while (!userInput.contains("bye"));
    }
}
