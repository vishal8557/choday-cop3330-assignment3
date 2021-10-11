package ex43;

import java.io.*;
import java.util.Scanner;

public class App {

    // Declare static variables
    private static String The_Website_Name;
    private static Scanner inputting = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Create object of class CreateFiles
        MAKINGFILE getit = new MAKINGFILE();

        // Prompt user for info
        System.out.print("Site name: ");
        The_Website_Name = inputting.nextLine();
        System.out.print("Author: ");
        String author = inputting.nextLine();


        // Prompt user for whether they desire Javascript file folder
        System.out.print("Do you want a folder for JavaScript? ");
        char THE_JAVA_SCRIPT_FILE = inputting.next().charAt(0);

        // Prompt user for whether they desire css file folder
        System.out.print("Do you want a folder for CSS? ");
        char THE_FILE_THATS_CSS = inputting.next().charAt(0);

        // Call methods of CreateFiles class to print output

        System.out.println(getit .html(The_Website_Name, author));

        System.out.println(getit .js(The_Website_Name, THE_JAVA_SCRIPT_FILE));

        System.out.println(getit .css(The_Website_Name, THE_FILE_THATS_CSS));
    }
}
