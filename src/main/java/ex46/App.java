
package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static ArrayList<listofwords> getWords(File file) throws FileNotFoundException
    {
        ArrayList<listofwords> HOW_MANY_WORDS = new ArrayList<>();
        String This_is_the_word_name;
           int How_Many_Badgers_There_ARe = 0; int HOW_MANY_MUSHRMS_ARE_THERE = 0; int HOW_MANY_SNAKES_R_IN_THE_INPUT_FILE = 0;

        Scanner reader = new Scanner(file);
        while(reader.hasNext()) {
            This_is_the_word_name = reader.next();
               if(This_is_the_word_name.equals("badger"))
                ++How_Many_Badgers_There_ARe;
               if(This_is_the_word_name.equals("mushroom"))
                ++HOW_MANY_MUSHRMS_ARE_THERE ;
              if(This_is_the_word_name.equals("snake"))
                ++HOW_MANY_SNAKES_R_IN_THE_INPUT_FILE;
        }
        listofwords for_the_bager = new listofwords(How_Many_Badgers_There_ARe, "badger");
        HOW_MANY_WORDS.add(for_the_bager ); //add words to list
        listofwords for_the_mshrm= new listofwords(HOW_MANY_MUSHRMS_ARE_THERE , "mushroom");
        HOW_MANY_WORDS.add(for_the_mshrm);
        listofwords FOR_THE_SNAKEE = new listofwords(HOW_MANY_SNAKES_R_IN_THE_INPUT_FILE, "snake");
        HOW_MANY_WORDS.add(FOR_THE_SNAKEE);
        return HOW_MANY_WORDS;
    }

    public static void main( String[] args ) throws IOException {
            File the_file = new File("C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex46\\exercise46_input.txt");
          ArrayList<listofwords> THESE_R_THE_WORDS = getWords(the_file);
        for(listofwords lk_at_wrd: THESE_R_THE_WORDS ) {
            System.out.print(lk_at_wrd.Grabbing_the_name_now() + ": ");
            int VC;
                   for( VC = 0; VC < lk_at_wrd.Lets_count_right_now(); ++VC)
                System.out.print("*"); // print
                 System.out.print("\n");
        }




    }
}