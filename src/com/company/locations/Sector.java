package com.company.locations;

import com.company.inventory.ItemTemplate;

import java.util.ArrayList;

public class Sector {
	String name;

	String openingText;

	spaceType type = spaceType.DEFAULT;

	ArrayList<ItemTemplate> items = new ArrayList<>();

	public ArrayList<Sector> connectedNodes = new ArrayList<>();

	public void setName(String name) {
		this.name = name;
	}

	public void setOpeningText(String openingText) {
		this.openingText = openingText;
	}

	public void setType(spaceType type) {
		this.type = type;
	}

	private void addConnectedNode(Sector node){
		node.connectedNodes.add(this);
		this.connectedNodes.add(node);
	}

	public Sector addChildNode(String name){
		Sector newChildNode = new Sector(name);
		addConnectedNode(newChildNode);

		return newChildNode;
	}


	enum spaceType{
		DEFAULT,
		BUILDING,
		HOUSE,
		OUTSIDE_DESERT,
		CAVE,
		OUTSIDE_PLAINS

	}


	Sector(String name){
		this.name = name;
	}


}
