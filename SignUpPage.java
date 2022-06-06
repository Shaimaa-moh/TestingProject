package Main_App;

import javafx.event.ActionEvent;

import java.sql.SQLException;

public class SignUpPage {
    String arr[] = {"rana.com", "ahmed.com", "yara.com"};

    public String SignUp(String name, String Password, String Phone, String Email) throws SQLException {

        if (name.equals("") | Password.equals("") | Phone.equals("") | Email.equals("")) {
            return "please fill in all the fields";
        }
        else {
            Boolean check = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(Email)) {
                    check = true;
                }
            }
            if (check == true)
                return "the email already exists";
            else
                return "registered successfully";
        }

    }

}

