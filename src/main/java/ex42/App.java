
package ex42;

import java.util.*;
import java.io.IOException;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws IOException
    {

        String input_file_file_name_path = "C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex42\\exercise42_input.txt";
        ArrayList<Map<String, String>> list_of_names_from_the_file = Process.read(input_file_file_name_path);

        System.out.println();
        String output = Process.print(list_of_names_from_the_file);
        System.out.println(output);
    }
}