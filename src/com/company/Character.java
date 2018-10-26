package com.company;
import java.util.*;
public class Character{
	public static Scanner scan = new Scanner(System.in);
	public ArrayList<String> char_items;
	public HashMap<String, Integer> char_stats ;  //strength, intelligence, stealth, health, hydration, food

	Character(){
		char_stats = new HashMap<>();

		char_items = new ArrayList<>();
	}

	public void initializeStatus(){
		char_stats.put("strength", 1);
		char_stats.put("intelligence", 1);
		char_stats.put("stealth", 1);
		char_stats.put("health", 1);
		char_stats.put("hydration", 10); // goes down
		char_stats.put("food", 20); // goes down
	}
	public void display(){
		System.out.println(char_stats);
	}
	public void changeStats(String nameOfAttribute, int value){
		if (char_stats.containsKey(nameOfAttribute))
			this.char_stats.put(nameOfAttribute,value);

	}

}
