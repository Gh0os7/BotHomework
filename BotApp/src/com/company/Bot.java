//WILL UPDATE NAMES AND A FEW VALIDATIONS HERE AND THERE.

package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dstoykov on 26.7.2016 г..
 */
public class Bot {

    private String botName;
    private ArrayList<String> friendsList;
    private ArrayList<String> shoppingList;
    private ArrayList<String> jokesList;
    private ArrayList<String> helpList;

    Bot(String botName) {
        this.botName = botName;
        friendsList = new ArrayList<>();
        shoppingList = new ArrayList<>();
        jokesList = new ArrayList<>();
        helpList = new ArrayList<>();
    }

    private void addFriend() {
        System.out.println("Add your friend's name");
        Scanner friendInput = new Scanner(System.in);
        String friendString = friendInput.nextLine();
        if (!friendString .equals("")) {
            friendsList.add(friendString);
        } else {
            System.out.println("Please enter a name");
            addFriend();
        }
    }

    private void printFriends() {
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.println(friendsList.get(i));
        }
    }

    private void addShoppingList() {
        System.out.println("Add your shopping item");
        Scanner shopItemInput = new Scanner(System.in);
        String shopItem = shopItemInput.nextLine();
        shoppingList.add(shopItem);
    }

    private void printShoppingList() {
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }

    private void removeShoppingItem () {
        Scanner removeItemInput = new Scanner(System.in);
        String removeItem = removeItemInput.nextLine();
            if (shoppingList.contains(removeItem)) {
                shoppingList.remove(removeItem);
                System.out.println("Shopping item removed");
            } else {
                System.out.println("This shopping item is not in the list.");
            }
        }

    private void tellJoke () {
        jokesList.add("Yo momma's so fat, that when she fell, no one was laughing but the ground was cracking up.\njo");
        jokesList.add("What did God say when he made the first black man? Damn, I burnt one.\n");
        jokesList.add("Anton, do you think I’m a bad mother? My name is Paul.\n");
        jokesList.add("It is so cold outside I saw a politician with his hands in his own pockets.\n");
        jokesList.add("Why do women live on average two years longer? Because the time they spend parking doesn’t count.\n");
        jokesList.add("What is short and would be very disturbing at breakfast?\n" +
                "-\n" +
                "\"Hitler\"\n");
        jokesList.add("A woman in a bikini reveals about 90% of her body.... " +
                "and yet most men are so polite they only look at the covered parts.\n");
        int randomJoke = new Random().nextInt(jokesList.size());
        System.out.println(jokesList.get(randomJoke));
    }

    private void help () {
        helpList.add("add friend");
        helpList.add("print friends");
        helpList.add("add to shopping list");
        helpList.add("print shopping list");
        helpList.add("remove item");
        helpList.add("joke");
        helpList.add("Help");
        for (int i = 0; i < helpList.size(); i++) {
            System.out.println(helpList.get(i));
        }
    }

    public void askQuestion() {
        System.out.println("What's your next question:");
    }

    void recognizeInput(String input) {
        if (input.equals("add friend")) {
            addFriend();
        } else if (input.equals("print friends")) {
            printFriends();
        } else if (input.equals("add to shopping list")) {
            addShoppingList();
        } else if (input.equals("print shopping list")) {
            printShoppingList();
        } else if (input.equals("remove item")) {
            removeShoppingItem();
        } else if (input.equals("joke")) {
            tellJoke();
        } else if (input.equals("Help")){
            help();
        } else {
            System.out.println("Command is not valid, to see the valid commands type 'Help'");
        }
    }
}
