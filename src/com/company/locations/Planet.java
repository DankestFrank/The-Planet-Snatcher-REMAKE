package com.company.locations;

import com.company.Sector;

public class Planet {
	String name;

	Sector Start;


	enum PLANET{
		EARTH,
		MARS
	}

	static String parseTextString(String text){
		text.replaceAll("{R_ITEM}",)
		return text;
	}

	Planet(PLANET type){

		switch (type){
			case MARS:
				createMars();
			case EARTH:
				createEarth();
		}
	}

	//Create Enviroment Here
	public void createEarth(){


	}
	public void createMars(){

	}
}
