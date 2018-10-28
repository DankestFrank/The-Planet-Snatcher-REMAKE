package com.company.inventory;

import com.company.Status;

public class ItemTemplate{


    ItemTemplate(){
        Status.char_items.add(this);
    }
    boolean equipable = false;
    int strengthValue = 0;
    int intelligenceValue = 0;
    int promptitudeValue = 0;
    int healthValue = 0;
    int malnutritionValue = 0;
    int hydrationValue = 0;

    // display object information
    String name;
    //choose to set message equal to the given placeholder or maually type it out
    String messagePlaceholder = (this.name + " {Power: " + strengthValue +", Intelligence: " + intelligenceValue + ", Promptude: "+ promptitudeValue + ", Health: " + healthValue + " }\n");
    String Message;



    public void changeAttributes() {
        Status.changeStats("strength", strengthValue);
        Status.changeStats("intelligence", intelligenceValue);
        Status.changeStats("promptitude", promptitudeValue);
        Status.changeStats("health", healthValue);
        Status.changeStats("malnutrition", malnutritionValue);
        Status.changeStats("hydration", hydrationValue);
        boolean equipable = true;
    }
    static Object currentEquipment = null;
    public void removeAttributes(){
        Status.changeStats("strength", -1 * strengthValue);
        Status.changeStats("promptitude", -1 * promptitudeValue);
        Status.changeStats("intelligence", -1 * intelligenceValue);
        Status.changeStats("health", -1 * healthValue);
        Status.changeStats("malnutrition", -1 * malnutritionValue);
        Status.changeStats("hydration", -1 * hydrationValue);
    }
}



