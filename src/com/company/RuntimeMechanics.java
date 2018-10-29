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
        String indexOf = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabet.length;i++){
            System.out.print(alphabet[i]);
            System.out.print(Status.char_items.get(i).Message);
            String chooseItem = scan.nextLine();
            while(temporary) {
                if (indexOf.contains(chooseItem)) {
                    ItemActions.activateItem(Status.char_items.get(i));
                    System.out.println("Completed!");
                }
                else
                    System.out.println("Not a choice, sorry");
            }
        }
    }
}
