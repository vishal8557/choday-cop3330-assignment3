package ex41;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Vishal Choday
 *
 Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.
Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:
Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.
Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina
Constraint
Don't hard-code the number of names.
Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

public class App {
        private static int lets_count_now;

        public static void main(String[] args )throws Exception{
                ArrayList<String> this_is_our_array = new ArrayList<String>();
                ArrayList<String> our_array_in_Alphabetical_Order = new ArrayList<String>();

                this_is_our_array = grab_our_input_now
                        ("C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex41\\base\\exercise41_input.txt");
                // Get Input
                our_array_in_Alphabetical_Order = our_name_list.sortList(this_is_our_array);
                // Sort arraylist alphabetically

                our_name_list.list_in_output(our_array_in_Alphabetical_Order, lets_count_now);
                // Print out to file

        }
        public static ArrayList<String> grab_our_input_now(String file) throws FileNotFoundException {
                ArrayList<String>THE_LIST = new ArrayList<String>();
                Scanner in = new Scanner(new File(file));
                while (in.hasNextLine()) {

                        THE_LIST.add(in.nextLine());
                        ++lets_count_now;
                }
                return THE_LIST;
        }
}
