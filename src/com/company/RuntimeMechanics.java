package com.company;
import java.util.*;
import com.company.inventory.ItemActions;
import com.company.inventory.ItemTemplate;

public class RuntimeMechanics {

    int inventoryCapacity = 26;

    public static Scanner scan = new Scanner(System.in);
    public static void randomNumber(){
        int rand = (int)Math.random()*6;
    }
    public static void randomItemReward(int randomNum){
        switch(randomNum){
            case(1):
                ItemActions.createBottle();
            case(2):
                ItemActions.createFlameThower();
            case(3):
                ItemActions.createRustyRobotArm();
            case(4):
                ItemActions.createBoots();
            case(5):
                ItemActions.createShovel();
        }
    }


    public static void fabricateInventory(){
        boolean temporary = true;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String indexOfAlph = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabet.length;i++){
            System.out.print(alphabet[i] + ": ");
            System.out.print(Status.char_items.get(i).Message);
        }
        System.out.println("Enter: HUD");
        String chooseItem = scan.nextLine();
        while(temporary) {
            if (indexOfAlph.contains(chooseItem)) {
                ItemActions.activateItem(Status.char_items.get(indexOfAlph.indexOf(chooseItem)));
                System.out.println("Completed!");
            }
            else if(chooseItem.equals(""));
                // at some point we will have a hud to display, preferably with a 1.go back to last position 2.continue 3.items or 4.craft
            else
                System.out.println("Not a choice, sorry. Please choose another one or press enter to continue :)");
        }
    }
}
