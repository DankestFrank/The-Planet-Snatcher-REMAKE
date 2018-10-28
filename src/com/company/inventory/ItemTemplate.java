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
    String name;
    //choose to set message equal to the given placeholder or maually type it out
    String messagePlaceholder = (this.name + " {Power: " + strengthValue +", Scrap value in grams: " + scrapValue + ", Promptude: "+ promptitudeValue + ", Health: " + healthValue + " }\n");
    String Message;



    public void changeAttributes() {
<<<<<<< HEAD
        status.changeStats("strength", strengthValue);
        status.changeStats("scrap", scrapValue);
        status.changeStats("promptitude", promptitudeValue);
        status.changeStats("health", healthValue);
        status.changeStats("malnutrition", malnutritionValue);
        status.changeStats("hydration", hydrationValue);
=======
        Status.changeStats("strength", strengthValue);
        Status.changeStats("intelligence", intelligenceValue);
        Status.changeStats("promptitude", promptitudeValue);
        Status.changeStats("health", healthValue);
        Status.changeStats("malnutrition", malnutritionValue);
        Status.changeStats("hydration", hydrationValue);
        boolean equipable = true;
>>>>>>> aba97e2650e2af65319fde11ae676441430ef18a
    }

    static Object currentEquipment = null;
    public void removeAttributes(){
<<<<<<< HEAD
        status.changeStats("strength", -1 * strengthValue);
        status.changeStats("promptitude", -1 * promptitudeValue);
        status.changeStats("scrap", -1 * scrapValue);
        status.changeStats("health", -1 * healthValue);
        status.changeStats("malnutrition", -1 * malnutritionValue);
        status.changeStats("hydration", -1 * hydrationValue);
=======
        Status.changeStats("strength", -1 * strengthValue);
        Status.changeStats("promptitude", -1 * promptitudeValue);
        Status.changeStats("intelligence", -1 * intelligenceValue);
        Status.changeStats("health", -1 * healthValue);
        Status.changeStats("malnutrition", -1 * malnutritionValue);
        Status.changeStats("hydration", -1 * hydrationValue);
>>>>>>> aba97e2650e2af65319fde11ae676441430ef18a
    }
}



