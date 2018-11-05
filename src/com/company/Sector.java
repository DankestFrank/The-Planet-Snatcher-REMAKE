package com.company;

import com.company.inventory.ItemTemplate;
import com.company.themes.locations;

import java.util.ArrayList;

public class Sector {
	String name;

	public static int desertCountMax = 0;
	public static int plainsCountMax = 0;

	String text;

	//'()' = example
	public static Object selectSetting;
	// you roam the (plains) [couple nodes]
	public static String selectedLandmark;
	// you find a (city) of tag selectedSetting [bunch of nodes because many building for say]
	public static String selectedstructure;
	// you reach a dead end of a (house) of tag selectedLandMark [few nodes]

	public static String currentSubsetting;
	public static String currentLocation;

	//whenever you reach a land mark, it is through a node leading past and into it

	public static String[] roaming = {"plains","desert"};

	public static String[] chooseTheme = {"undergroudTunnel", "rusticCity", "populatedCity"};// all locations have a different theme
	public static String[] subsettings = {"location","structure","conpartment"}; //permanent

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

	public String displayNameMessage;

	private void addConnectedNode(Sector node){
		if(node.equals((null))) {
		}
		else {
			node.connectedNodes.add(this);
			this.connectedNodes.add(node);
		}
	}

	public Sector addChildNode(String name){
		Sector newChildNode = new Sector(name);
		if(currentSubsetting.equals(subsettings[0])){
			newChildNode.text = locations.currentLocation;
		}
		//random customization desert > outside or in a city >
		addConnectedNode(newChildNode);
		return newChildNode;
	}

	public String desert(){
		desertCountMax++;
		if(desertCountMax <=100) {
			return "desert" + desertCountMax;
		}
		else {
			return null;
		}
	}
	public String plains(){
		desertCountMax++;
		if(plainsCountMax <=100) {
			return "plains" + plainsCountMax;
		}
		else {
			return null;
		}
	}

	public void generateChildren(){
		Sector firstNode = new Sector("Start Node");
		Status.currentNode = firstNode;
		for(int i=0 ; i<((Math.random()*2)+1); i++){
			addChildNode(currentSubsetting);
		}
	}

	enum spaceType{
		DEFAULT,
		BUILDING,
		HOUSE,
		OUTSIDE_DESERT,
		CAVE,
		OUTSIDE_PLAINS

	}


	public Sector(String name){
		this.name = name;
		generateChildren();
	}


}
