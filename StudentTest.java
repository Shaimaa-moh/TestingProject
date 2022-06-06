package Main_App.Main_App_test;

import Main_App.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void test1()
    {
        Student s1 = new Student("rana","1254r");
        assertEquals("1254r",s1.getId());
    }
    @Test
    public void test2()
    {
        Student s1 = new Student("ahmed","15249r");
        assertEquals("1254r64",s1.getName());

    }
    @Test
    public void test3()
    {
        Student s1 = new Student("omar","4245r");
        assertEquals("omar",s1.getName());

    }
    @Test
    public void test4()
    {
        Student s1 = new Student("jimm","ji645r");
        assertEquals("ji645r",s1.getId());

    }



}