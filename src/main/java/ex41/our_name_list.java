package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Vishal Choday
 *
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class our_name_list {
    public static ArrayList<String> sortList(ArrayList<String> THE_RECORD)
    {
        Collections.sort(THE_RECORD);
        return THE_RECORD;
    }

    public static void list_in_output(ArrayList<String> THE_RECORD, int count_now ) throws IOException {
        FileWriter writer = new FileWriter
                ("C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex41\\base\\exercise41_output.txt");
        writer.write("Total of " + count_now + " names in list\n");
        writer.write("-----------------\n");

        for ( String str : THE_RECORD)
         {
          writer.write(str + System.lineSeparator());
        }
        writer.close();
        }
        }


