package Main_App;

public class LoginPage {
    String[][] login = {{"rana.com","1234"},{"ahmed.com","26541"},{"yara.com","@125rre"}};

    public String IsValid(String email,String pass)
    {
        for(int i=0;i< login.length;i++)
        {
            if(email.equals(login[i][0])&& pass.equals(login[i][1]))
                return "Valid";

        }return "INVALID";

    }

}
