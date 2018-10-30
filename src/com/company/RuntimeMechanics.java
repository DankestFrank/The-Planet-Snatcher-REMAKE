package com.company;
import java.util.*;
import com.company.inventory.ItemActions;
import com.company.inventory.ItemTemplate;
import com.company.locations.Sector;

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

    public static Sector runNode(Sector node){
        for(int i=0; i<node.connectedNodes.size();i++) {
            System.out.println(Display.alphabet2[i] +": "+ node.connectedNodes.get(i).displayNameMessage);
        }
        System.out.println("ENTER: HUD");
        return node;
    }

    public static void nextNode() {
        while(true){
            Sector node = runNode(Status.currentNode);
            String input = scan.nextLine();
            while (true) {
                if (input.equals("")) {
                    node = Status.currentNode;
                    Display.displayHud();
                } else if (Display.indexOfAlph.contains(scan.nextLine())) {
                    Status.currentNode = node;
                    runNode(node.connectedNodes.get(Display.indexOfAlph.indexOf((input))));
                } else {
                    System.out.println("Not a choice");
                }
            }
        }
    }

}
