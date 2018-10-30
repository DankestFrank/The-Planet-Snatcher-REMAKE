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


}
