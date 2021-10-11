package ex46;

public class listofwords {

    private  int counting_the_number_of_similar_words_in_file_now; String this_for_the_name;

    public listofwords(int lets_cnt_how_many_there_r, String stringname) {
        this.counting_the_number_of_similar_words_in_file_now = lets_cnt_how_many_there_r;
        this.this_for_the_name = stringname;
    }
    public String Grabbing_the_name_now() {
        return this_for_the_name;
    }
    public int Lets_count_right_now() {
        return counting_the_number_of_similar_words_in_file_now;
    }

}