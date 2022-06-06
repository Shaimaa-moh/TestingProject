package Main_App.Main_App_test;
import Main_App.CourseStudent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CourseStudentTest {
    @Test
    public void test1()
    {
        CourseStudent s1 = new CourseStudent();
        assertEquals("INVALID",s1.checkLink("www.youtube.com"));
    }
    @Test
    public void test2()
    {
        CourseStudent s1 = new CourseStudent();
        assertEquals("INVALID",s1.checkLink("youtube"));
    }
    @Test
    public void test3()
    {
        CourseStudent s1 = new CourseStudent();
        assertEquals("valid",s1.checkLink("https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668/"));
    }

}