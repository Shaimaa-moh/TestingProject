package Main_App;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
public class TeacherPage {

    ArrayList<String> arr = new ArrayList<String>() {
        {
            add("https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668");
            add("www.google.com");
            add("www.youtube.com");
        }
    };
    public String Teacher(String url) throws SQLException {

        if (url.equals("")) {
            return "please fill in all the fields";
        }
          else if (Check_validity(url)) {
            arr.add(url);
            Display();
            return "url updated";
        }
        return "url is invalid";
    }
    public void Display ()
    {
        for (int i=0;i< arr.size();i++)
        {
            System.out.print(arr.get(i));
            System.out.println("");
        }
    }
    public static boolean Check_validity (String url)
    {
                /* Try creating a valid URL */
                try {
                    new URL(url).toURI();
                    return true;
                }

                // If there was an Exception
                // while creating URL object
                catch (Exception e) {
                    return false;
                }
            }
    }


