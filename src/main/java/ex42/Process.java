package ex42;

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
import java.io.IOException;

public class Process {

    public static ArrayList<Map<String, String>> read(String the_exercise_file_path_here) throws IOException {
        ArrayList<Map<String, String>> the_names_of_the_ppl_in_our_list = new ArrayList<>();
        File the_input_file = new File(the_exercise_file_path_here);
        Scanner in = new Scanner(the_input_file);

        while (in.hasNextLine())
        {
            Map<String, String> the_name_of_the_workers_file = new HashMap<>();
            Scanner lineIn = new Scanner(in.nextLine());
            while (lineIn.hasNext())
            {
                lineIn.useDelimiter(",");
                the_name_of_the_workers_file .put("last", lineIn.next());
                the_name_of_the_workers_file .put("first", lineIn.next());
                the_name_of_the_workers_file .put("salary", lineIn.next());
            }
            the_names_of_the_ppl_in_our_list.add(the_name_of_the_workers_file );
            }

        return the_names_of_the_ppl_in_our_list;
            }

    public static String print(ArrayList<Map<String, String>> rws_of_the_names_here) {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%-10s %-10s %-10s\n", "LAST", "FIRST", "SALARY\n--------------------------------"));

        int mbusa = 0;
        for ( mbusa = 0; mbusa < rws_of_the_names_here.size(); ++mbusa)
        {

            Map<String, String> switching = rws_of_the_names_here.get(mbusa);
            output.append(String.format("%-10s %-10s $%-10s\n", switching.get("last"), switching.get("first"), switching.get("salary")));
            String s = String.format("%-10s %-10s %-10s\n" ,"Last" ,"First" ,"Salary");

        }
        return output.toString();
    }
}



