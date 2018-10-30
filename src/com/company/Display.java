package com.company;

import com.company.inventory.ItemActions;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;

public class Display {

	public static char[] alphabet2 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public static String indexOfAlph = "abcdefghijklmnopqrstuvwxyz";

	static int height = 44;
	static int width = 200;
	static char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void clear(){
		String buffer  = "";
		for (int x = 0; x <= height * 1.5; x++)
			buffer += "\n";
			System.out.print(buffer);
	}

	public static String readFileAsString(String fileName)throws Exception
	{

		String data = "";
		URL path = Display.class.getResource(fileName);
		File f = new File(path.getFile());
		data =  new Scanner(f).useDelimiter("\\Z ").next();
		return data;
	}

	static void displayOptions(ArrayList<String> options){
		for (int x = 0; x < options.size();x++){
			display(alphabet[x] + ") " +options.get(x) );
		}
	}
	static void display(String str) {
		int left = (width - str.length()) / 2;
		int right = width - left - str.length();

		String newStr ="";

		while (str.length() > width) {
			newStr += str.substring(0, width) + "\n";
			str = str.substring(width);
		}
		newStr += str;
		String repeatedChar = " ";
		StringBuffer buff = new StringBuffer();
		for (int i = 0; i < left; i++) {
			buff.append(repeatedChar);
		}
		buff.append(newStr);
		for (int i = 0; i < right; i++) {
			buff.append(repeatedChar);
		}
		// to see the end (and debug) if using spaces as repeatedChar
		//buff.append("$");
		System.out.println(buff.toString());
	}

	public static void mainMenu() throws Exception {

		clear();
		display("WELCOME TO\n" );



		//Display Title
		System.out.println(readFileAsString("TitleArt").replaceAll("&&&","\t\t\t\t\t"));
		System.out.print("\n\n\n");
		display("By Frank Dininno and Dylan Starink");
		System.out.print("\n\n\n");
		display("Press <Enter> To Continue");
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		clear();

		System.out.println(readFileAsString("TitleArt").replaceAll("&&&","\t\t\t\t\t"));
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");

		if (!Status.gameInProgress){
			ArrayList<String> arr = new ArrayList<String>();
			arr.add("Continue");
			arr.add("New Game");
			displayOptions(arr);
		}

	}

	public static void displayHud() {
		String index = "abcd";
		boolean temporary = true;

		System.out.println("a: Go back to last position<");
		String items = "b: Inventory<";
		String craftItems = "c: Craft Items<";
		String Continue = "ENTER: Exit";
		String input = RuntimeMechanics.scan.nextLine();
		if(input.equals("")){
			//continue() (once created)
			temporary = false;
		}
		else if(index.contains(input)){
		 	if(input.equals("b")) {
		 		displayInventory();
		 		temporary = false;
		 	}
		 	else if(input.equals("c")){
		 		displayBlueprints();
				temporary = false;
			}
			else if(input.equals("a")) {
				//goBackToLastPos() (once created)
				temporary = false;
			}
		}
		else
			System.out.println("Not a choice, sorry. Please choose another one or press enter to continue :)");
	}

	public static void displayInventory(){

		boolean temporary = true;

		for(int i=0; i<Status.char_items.size();i++){
			System.out.print(alphabet2[i] + ": ");
			System.out.print(Status.char_items.get(i).Message);
		}
		System.out.println("Enter: HUD");
		String chooseItem = RuntimeMechanics.scan.nextLine();
		while(temporary) {
			if(chooseItem.equals("")) {
				// at some point we will have a hud to display, preferably with a 1.go back to last position 2.continue 3.items or 4.craft
				displayHud();
				temporary = false;
			}
			else if (indexOfAlph.contains(chooseItem)) {
				ItemActions.activateItem(Status.char_items.get(indexOfAlph.indexOf(chooseItem)));
				System.out.println("Completed!");
				temporary = false;
			}
			else
				System.out.println("Not a choice, sorry. Please choose another one or press enter to continue :)");
		}
	}

	public static void displayBlueprints() {

		boolean temporary = true;

		for (int i = 0; i < Status.char_items.size(); i++) {
			System.out.print(alphabet2[i] + ": ");
			System.out.print(bluePrintCrafting.blueprints.get(i).Message);
		}
		System.out.println("Enter: HUD");
		String chooseItem = RuntimeMechanics.scan.nextLine();
		while (temporary) {
			if (chooseItem.equals("")) {
				displayHud();
				temporary = false;
			} else if (indexOfAlph.contains(chooseItem)) {
				bluePrintCrafting.blueprints.get(indexOfAlph.indexOf(chooseItem)).addItemToInventory();
				System.out.println("Completed!");
				temporary = false;
			} else
				System.out.println("Not a choice, sorry. Please choose another one or press enter to continue :)");
		}
	}

    public static void main(String[]args) throws Exception {

		mainMenu();
    }
}

