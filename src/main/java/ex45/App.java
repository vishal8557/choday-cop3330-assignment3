package ex45;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App
{
    public static List<String> replaceWord(List<String> inputting)
    {
        List <String> wht_wre_pting_in_the_otput_now = new ArrayList<>();
        int mbusa;
        for( mbusa = 0;mbusa < inputting.size();++mbusa)
        {
            wht_wre_pting_in_the_otput_now.add(inputting.get(mbusa).replace("utilize","use"));
        }
        return wht_wre_pting_in_the_otput_now;

    }

    public static void main(String[] args) throws IOException
    {
        File text = new File("C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner in = new Scanner(text);
        List<String> the_lines_tht_r_in_the_file = new ArrayList<>();
        while(in.hasNextLine()){
            the_lines_tht_r_in_the_file .add(in.nextLine());
        }

        giveoutputtotheFILE(replaceWord(the_lines_tht_r_in_the_file ));



    }
    public static void giveoutputtotheFILE(List<String> this_is_the_line) throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's the name of your file? ");
        File the_file_here = new File("C:\\Users\\choda\\IdeaProjects\\example1\\src\\main\\java\\ex45\\exercise45_output.txt" +input.nextLine());
        BufferedWriter doing_the_bff_writer_now = new BufferedWriter(new FileWriter(the_file_here));
            int VC;
        for( VC = 0;VC < this_is_the_line.size();++VC)
        {
            doing_the_bff_writer_now.write(this_is_the_line.get(VC));
        }
        doing_the_bff_writer_now.close();




    }


}
