package com.company.inventory;

import com.company.status;

public class ItemTemplate{


    ItemTemplate(){
        status.char_items.add(this);
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
        status.changeStats("strength", strengthValue);
        status.changeStats("intelligence", intelligenceValue);
        status.changeStats("promptitude", promptitudeValue);
        status.changeStats("health", healthValue);
        status.changeStats("malnutrition", malnutritionValue);
        status.changeStats("hydration", hydrationValue);
        boolean equipable = true;
    }
    Object currentEquipment = null;
    public void removeAttributes(){
        status.changeStats("strength", -1 * strengthValue);
        status.changeStats("promptitude", -1 * promptitudeValue);
        status.changeStats("intelligence", -1 * intelligenceValue);
        status.changeStats("health", -1 * healthValue);
        status.changeStats("malnutrition", -1 * malnutritionValue);
        status.changeStats("hydration", -1 * hydrationValue);
    }
}



