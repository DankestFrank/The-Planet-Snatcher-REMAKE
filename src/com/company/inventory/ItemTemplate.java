package com.company.inventory;

import com.company.status;

import javax.print.attribute.Attribute;
import java.util.ArrayList;

public class ItemTemplate{

    public static status inventory = new status();
    ItemTemplate(){
        inventory.char_items.add(this);
    }
    boolean equipable = false;
    int strengthValue = 0;
    int intelligenceValue = 0;
    int promptitudeValue = 0;
    int healthValue = 25;
    int malnutritionValue = 20;
    int hydrationValue = 10;

    // display object information
    String name;
    //choose to set message equal to the given placeholder or maually type it out
    String messagePlaceholder = (this.name + " {Power: " + strengthValue +", Intelligence: " + intelligenceValue + ", Promptude: "+ promptitudeValue + ", Health: " + healthValue + " }\n");
    String Message;



    public void changeAttributes() {
        inventory.changeStats("strength", strengthValue);
        inventory.changeStats("intelligence", intelligenceValue);
        inventory.changeStats("promptitude", promptitudeValue);
        inventory.changeStats("health", healthValue);
        inventory.changeStats("malnutrition", malnutritionValue);
        inventory.changeStats("hydration", hydrationValue);
        boolean equipable = true;
    }
    Object currentEquipment = null;
    public void removeAttributes(){
        inventory.changeStats("strength", -1 * strengthValue);
        inventory.changeStats("promptitude", -1 * promptitudeValue);
        inventory.changeStats("intelligence", -1 * intelligenceValue);
        inventory.changeStats("health", -1 * healthValue);
        inventory.changeStats("malnutrition", -1 * malnutritionValue);
        inventory.changeStats("hydration", -1 * hydrationValue);
    }
}



