package com.company.inventory;

import com.company.Status;

public class ItemTemplate{


    ItemTemplate(){
        Status.char_items.add(this);
    }
    boolean equipable = false;
    int strengthValue = 0;
    int scrapValue = 0;
    int promptitudeValue = 0;
    int healthValue = 0;
    int malnutritionValue = 0;
    int hydrationValue = 0;

    // display object information
    public String name;
    //choose to set message equal to the given placeholder or maually type it out
    public String messagePlaceholder = (this.name + " {Power: " + strengthValue +", Scrap value in grams: " + scrapValue + ", Promptude: "+ promptitudeValue + ", Health: " + healthValue + " }\n");
    public String Message;



    public void changeAttributes() {
        Status.changeStats("strength", strengthValue);
        Status.changeStats("scrap", scrapValue);
        Status.changeStats("promptitude", promptitudeValue);
        Status.changeStats("health", healthValue);
        Status.changeStats("malnutrition", malnutritionValue);
        Status.changeStats("hydration", hydrationValue);
    }

    static Object currentEquipment = null;
    public void removeAttributes(){
        Status.changeStats("strength", -1 * strengthValue);
        Status.changeStats("promptitude", -1 * promptitudeValue);
        Status.changeStats("scrap", -1 * scrapValue);
        Status.changeStats("health", -1 * healthValue);
        Status.changeStats("malnutrition", -1 * malnutritionValue);
        Status.changeStats("hydration", -1 * hydrationValue);
    }
}



