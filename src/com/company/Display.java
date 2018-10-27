package com.company;

import java.io.IOException;
import java.util.*;

public class Display {

	static int height = 44;
	static int width = 200;

	public static void clear(){
		for (int x = 0; x <= height * 1.5; x++)
			System.out.print("\n");
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

	public static void mainMenu() throws IOException {

		clear();
		display("Main Menu" );
		display("Press <Enter> To Continue");
		Scanner scan = new Scanner(System.in);
		System.in.read();
	}

    public static void main(String[]args){

		mainMenu();
    }
}
