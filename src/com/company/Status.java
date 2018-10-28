package com.company;
import com.company.inventory.ItemTemplate;

import java.util.*;
public class Status {
	//public static Scanner scan = new Scanner(System.in);
	public static ArrayList<ItemTemplate> char_items;
<<<<<<< HEAD:src/com/company/status.java
	public static HashMap<String, Integer> char_stats ;  //strength, scrap, skill, health, hydration, malnutrition
=======
	public static HashMap<String, Integer> char_stats ;  //strength, intelligence, skill, health, hydration, malnutrition
	public static boolean gameInProgress = false;
>>>>>>> aba97e2650e2af65319fde11ae676441430ef18a:src/com/company/Status.java

	public Status(){
		char_stats = new HashMap<>();
		char_stats.put("strength", 1);
		char_stats.put("scrap", 1);
		char_stats.put("skill", 1);
		char_stats.put("health", 1);
		char_stats.put("hydration", 10); // goes down
		char_stats.put("malnutrition", 20); // goes down
	}

	public void display(){

		System.out.println(char_stats);
	}
	public static void changeStats(String nameOfAttribute, int value){
		//Check if hashMap contains attribute, if so than update value to original + new value
		if (char_stats.containsKey(nameOfAttribute))
			Status.char_stats.put(nameOfAttribute, (char_stats.get(nameOfAttribute) + value) );

	}

}
