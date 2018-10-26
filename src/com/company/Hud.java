package com.company;

import java.util.HashMap;

public class Hud {
    public static Character char_items = new Character();
    //create items
    HashMap<String, Integer> itemGeneric = new HashMap<>();



    //end of items
    //adds attributes to items and adds it to the characters inventory(char.items)
    public static void add_attributes_to_item(HashMap<String, Integer> item, String modifying, int value){
        item.put(modifying, value);
        char_items.char_items.add(item);
    }

    public static void main(String[]args){
        add_items_to_inventory(itemGeneric, strength, 3);
    }
}
