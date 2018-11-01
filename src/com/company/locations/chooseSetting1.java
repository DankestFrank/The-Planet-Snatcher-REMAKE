package com.company.locations;

public class chooseSetting1 {

    public static String[] roaming = {"plains","desert"};

    public static String[] chooseTheme = {"undergroudTunnel", "rusticCity", "populatedCity"};// all locations have a different theme
    public static String[] currentSubsetting = {"location","structure","conpartment"};


    int originbranches = ((int)(Math.random()*7))+1;

    //possible locations
    public String[] rusticCity = {"rusticCity","location","There are rustic intact buildings. Travel to?", "Yes travel to the city"};
    public String[] undergroundTunnel = {"undergroundTunnel","location","Do you enter this tunnel?","You enter the tunnel"};
    public String populatedCity = "<><underground> You find a tunnel and enter it.";

    //possible building choices with tag in the beginning
    public static String[] building1 = {"rusticCity","structure","do you want to enter the rusty building?","you enter a rusty building"};//subsetting, theme, prompt, enterMessage
    public static String building2 = "<rustic><city>you enter a modern building";
    public static String building3 = "<rustic><city>you enter a strange building";
    public static String building4 = "<destroyed><city>you enter a dusty building";

    //possible subsettings
    public static String house1 = "<destroyed><city><conpartment>you enter a compartment";


}
