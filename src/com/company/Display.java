package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Display {

	static int height = 44;
	static int width = 200;

	public static void clear(){
		String buffer  = "";
		for (int x = 0; x <= height * 1.5; x++)
			buffer += "\n";
			System.out.print(buffer);
	}

	public static String readFileAsString(String fileName)throws Exception
	{


		String data = "";
		data = new String(Files.readAllBytes(Paths.get(fileName)));
		return data;
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

		System.out.println(readFileAsString(System.getProperty("user.dir") + "\\The-Planet-Snatcher-REMAKE\\src\\com\\company\\TitleArt").replaceAll("&&&","\t\t\t\t\t"));
		//TODO: Make File Global
		System.out.print("\n\n\n");
		display("By Frank Dininno and Dylan Starink");
		System.out.print("\n\n\n");
		display("Press <Enter> To Continue");
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n");

		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		clear();
	}


    public static void main(String[]args) throws Exception {

		mainMenu();
    }
}
