package com.company;

import com.company.inventory.ItemTemplate;

public class bluePrintCrafting {
    public int scrapsRequired = 0;

    boolean equipable = false;
    int strengthValue = 0;
    int scrapValue = 0;
    int promptitudeValue = 0;
    int healthValue = 0;
    int malnutritionValue = 0;
    int hydrationValue = 0;

    public String name;
    //choose to set message equal to the given placeholder or maually type it out
    public String messagePlaceholder = (this.name + " {Power: " + strengthValue +", Scrap value in grams: " + scrapValue + ", Promptude: "+ promptitudeValue + ", Health: " + healthValue + " }\n");
    public String Message;

    public static void addItemToInventory(bluePrintCrafting any){
        if(Status.char_stats.get("scrap") >= any.scrapsRequired){
            any = new ItemTemplate();
        }
    }
}
