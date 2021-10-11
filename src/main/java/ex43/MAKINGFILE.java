package ex43;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

import java.io.File;


// This class uses methods to create all files desired by user
public class MAKINGFILE
{

    public String html(String THE_WEBSITE_NAME, String NAME_OF_THE_PUBLISHER_OF_THE_WEBSITE) throws IOException
    {

        // Create html file and file writer
        File NEED_TO_GET_THIS_FILE = new File("index.html");
        BufferedWriter q7rx50 = new BufferedWriter(new FileWriter(NEED_TO_GET_THIS_FILE));

        // Write new user info into html file using html syntax
        String THE_TEXT_IN_HTML_PROGMING_LANGE = "<title> " + THE_WEBSITE_NAME + " </title>\n<meta> " + NAME_OF_THE_PUBLISHER_OF_THE_WEBSITE + " </meta>";

        if (NEED_TO_GET_THIS_FILE.exists())
            q7rx50.write(THE_TEXT_IN_HTML_PROGMING_LANGE);

        // Show files created, close file, and return files created
        String THE_STATEMENT_THATS_BEING_USED_NOW = "Created ./website/" + THE_WEBSITE_NAME;
        THE_STATEMENT_THATS_BEING_USED_NOW += "\nCreated ./website/" + THE_WEBSITE_NAME + "/" + NEED_TO_GET_THIS_FILE.getName();

        q7rx50.close();

        return THE_STATEMENT_THATS_BEING_USED_NOW;
    }

    public String js(String THE_NAME_OF_THIS_WEBSITE, char THE_ANSWER_THAT_THE_USER_HAS_INPUTTED)
    {

        // Create new directory if user desires JS file folder and return created folder
        if (THE_ANSWER_THAT_THE_USER_HAS_INPUTTED == 'y' || THE_ANSWER_THAT_THE_USER_HAS_INPUTTED == 'Y' )
        {

            File FILE_IN_JAVA_SCPT = new File("file.js");
            FILE_IN_JAVA_SCPT.mkdir();
            return "Created ./website/" + THE_NAME_OF_THIS_WEBSITE + "/js/";
        }
        // Return nothing
                else

                return null;
    }

    public String css(String NAME_OF_THIS_WEBSITE, char THE_ANSWER_THAT_THE_USER_HAS_INPUTTED) {

        // Create new directory if user desires css file folder and return created folder
        if (THE_ANSWER_THAT_THE_USER_HAS_INPUTTED == 'y' || THE_ANSWER_THAT_THE_USER_HAS_INPUTTED == 'Y') {
            File FILE_THATS_IN_CSS= new File("file.css");
            FILE_THATS_IN_CSS.mkdir();
            return "Created ./website/" + NAME_OF_THIS_WEBSITE + "/css/";
        }
        // Return nothing
             else
            return null;
    }



}


