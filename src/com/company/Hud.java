package com.company;

import java.util.HashMap;

public class Hud {

    //create items

    //end of items
    //adds attributes to items and adds it to the characters inventory(char.items)
    public static void add_attributes_to_item(HashMap<String, Integer> item, String modifying, int value){
        item = new HashMap<String, Integer>();
        item.put(modifying, value);
        inventory.char_items.add(item);
    }

    public static void activate_item(HashMap<String, Integer> item){
        for (Object key : item.keySet().toArray()) {
            inventory.changeStats((String) key, item.get(key));
        }
        inventory.char_items.remove(item);
    }

    public static void main(String[]args){

        add_attributes_to_item(staff, strength, 3);
    }
}
