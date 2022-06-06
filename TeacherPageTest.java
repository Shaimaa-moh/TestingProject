package Main_App.Main_App_test;

import Main_App.TeacherPage;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class TeacherPageTest {
    @Test
    public void check_update1() throws SQLException {
        TeacherPage T=new TeacherPage();
        assertEquals("url updated",T.Teacher("https://www.facebook.com"));
    }
    @Test
    public void check_update2() throws SQLException {
        TeacherPage T=new TeacherPage();
        assertEquals("url updated",T.Teacher("facebook.com"));
    }
    @Test
    public void check_update3() throws SQLException {
        TeacherPage T=new TeacherPage();
        assertEquals("please fill in all the fields",T.Teacher(""));
    }

}