package ex44;
import java.util.List;

public class App
{
    String[] traverseFile (List<String> THE_LIST_OF_THE_PRODUCTS_HERE, String SEARCHINGNOW) {

        String[] The_Stuff ;
        int chking_to_see_if_availbl;
        chking_to_see_if_availbl = 0;

        int mbusa;
        for ( mbusa = 0; mbusa < THE_LIST_OF_THE_PRODUCTS_HERE.size(); ++mbusa)
        {
            if (THE_LIST_OF_THE_PRODUCTS_HERE.get(mbusa).equals(SEARCHINGNOW))
                chking_to_see_if_availbl = mbusa;
        }
        System.out.printf("\nName: %s\nPrice: %s\nQuantity: %s", THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl), THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl + 1), THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl + 2));

        The_Stuff = new String[]{THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl), THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl + 1), THE_LIST_OF_THE_PRODUCTS_HERE.get(chking_to_see_if_availbl + 2)};
        return The_Stuff ;
    }



}
