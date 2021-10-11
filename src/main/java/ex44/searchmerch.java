package ex44;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class searchmerch {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)throws Exception{




        App q7rxhcrexp = new App();

        String[] how_much_is_the_item_thats_in_inventry = {"25.00", "15.00", "5.00"};
        String[] The_name_of_the_item_there = {"Widget", "Thing", "Doodad", "thing"};
        String[] How_many_items_are_available_right_now = {"5", "5", "10"};

        String[] the_final_answer = new String[3];

        List<String> list = new ArrayList();

        int vz;
        for ( vz = 0; vz < 3; ++vz)
        {
            list.add(The_name_of_the_item_there [vz]);
            list.add(how_much_is_the_item_thats_in_inventry [vz]);
            list.add(How_many_items_are_available_right_now [vz]);
        }

        String SEARCHINGNOW;
        System.out.print("What is the product name? ");
        SEARCHINGNOW = input.next();
        while (!list.contains(SEARCHINGNOW)) {
            System.out.println("Sorry that product was not found in our inventory");
            System.out.print("What is the product name? ");
            SEARCHINGNOW = input.next();
        }
        the_final_answer = q7rxhcrexp.traverseFile(list, SEARCHINGNOW);
    }



}
