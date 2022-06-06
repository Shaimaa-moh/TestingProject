package Main_App.Main_App_test;

import Main_App.SignUpPage;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class SignUpPageTest {
    @Test
public void Email_check1() throws SQLException {
        SignUpPage s=new SignUpPage();
        assertEquals("the email already exists",s.SignUp("rana","1234","0100399","rana.com"));
    }
    @Test
    public void Email_check2() throws SQLException {
        SignUpPage s=new SignUpPage();
        assertEquals("please fill in all the fields",s.SignUp("rana","1234","0100399",""));
    }
    @Test
    public void Email_check3() throws SQLException {
        SignUpPage s=new SignUpPage();
        assertEquals("registered successfully",s.SignUp("rana","1234","0100399","Shaimaa.com"));
    }
}