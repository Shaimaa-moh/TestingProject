package Main_App.Main_App_test;

import Main_App.Browser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BrowserTest {
    @Test
    public void test1(){
        Browser b = new Browser();
        assertEquals("Invalid link",b.open("ahmed.com"));
    }

    @Test
    public void test2(){
        Browser b = new Browser();
        assertEquals("Valid",b.open("ahmed.com"));
    }
    @Test
    public void test3(){
        Browser b = new Browser();
        assertEquals("Valid",b.open("https://www.google.com"));
    }
    @Test
    public void test4(){
        Browser b = new Browser();
        assertEquals("Valid",b.open("https://www.ahmed.com"));
    }
    @Test
    public void test5(){
        Browser b = new Browser();
        assertEquals("Invalid link",b.open("shaimaaa"));
    }

}