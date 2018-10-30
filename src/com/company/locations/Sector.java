package com.company.locations;

import com.company.inventory.ItemTemplate;

import java.util.ArrayList;

public class Sector {
	String name;

	String openingText;

	ArrayList<ItemTemplate> items = new ArrayList<>();

	ArrayList<Sector> connectedNodes = new ArrayList<>();




	Sector(String name){

	}
}
