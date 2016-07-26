package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dstoykov on 26.7.2016 г..
 */
public class Bot {

  private String botName;
  private ArrayList<String> friendsList;
  private ArrayList<String> shoppingList;

  Bot(String botName) {
    this.botName = botName;
    friendsList = new ArrayList<>();
    shoppingList = new ArrayList<>();
  }

  private void addFriend() {
    System.out.println("Add your friend's name");
    Scanner friendInput = new Scanner(System.in);
    String friendString = friendInput.nextLine();
    friendsList.add(friendString);
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

  public void askQuestion() {
    System.out.println("What's your next question:");
  }
//  It should return all the valid commands
//  Validations for empty strings
//

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
      //removeFromShoppingList
    } else if (input.equals("joke")) {
//      tellJoke
    } else if (input.equals("Help")){
//      help
    } else {
      System.out.println("Command is not valid, to see the valid commands type 'Help'");
    }
  }
}
