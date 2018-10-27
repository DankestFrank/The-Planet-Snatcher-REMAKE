package com.company;
import com.company.inventory.ItemTemplate;

import java.util.*;
public class Character{
	//public static Scanner scan = new Scanner(System.in);
	public ArrayList<ItemTemplate> char_items;
	public HashMap<String, Integer> char_stats ;  //strength, intelligence, skill, health, hydration, malnutrition

	public Character(){
		char_stats = new HashMap<>();

		char_stats.put("strength", 1);
		char_stats.put("intelligence", 1);
		char_stats.put("skill", 1);
		char_stats.put("health", 1);
		char_stats.put("hydration", 10); // goes down
		char_stats.put("malnutrition", 20); // goes down
	}

	public void display(){

		System.out.println(char_stats);
	}
	public void changeStats(String nameOfAttribute, int value){
		//Check if hashMap contains attribute, if so than update value to original + new value
		if (char_stats.containsKey(nameOfAttribute))
			this.char_stats.put(nameOfAttribute, (char_stats.get(nameOfAttribute) + value) );

	}

}
