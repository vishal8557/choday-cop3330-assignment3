

package ex46;


import java.util.Comparator;


public  class letscomparenow implements Comparator<listofwords>


{
    public int compare(listofwords This_is_for_the_fst_word, listofwords itsforsndword)
    {


        return itsforsndword.Lets_count_right_now() - This_is_for_the_fst_word.Lets_count_right_now();

    }




}
