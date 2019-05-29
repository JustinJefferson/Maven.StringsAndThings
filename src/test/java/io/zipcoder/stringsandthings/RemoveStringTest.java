package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class RemoveStringTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void withoutStringTest1(){
        String expected = "He there";
        String actual = stringsAndThings.removeString("Hello there", "llo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest2(){
        String expected = "Hllo thr";
        String actual = stringsAndThings.removeString("Hello there", "e");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest3(){
        String expected = "Hello there";
        String actual = stringsAndThings.removeString("Hello there", "x");
        Assert.assertEquals(expected, actual);
    }

    //Adding Tests for Practice
    @Test
    public void withoutStringTest4(){
        String expected = "Goodbye Ya";
        String actual = stringsAndThings.removeString("Goodbye Yall", "l");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void withoutStringTest5(){
        String expected = "Godbye Yall";
        String actual = stringsAndThings.removeString("Gooooodbye Yall", "oo");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void withoutStringTest6(){
        String expected = "Ca Ma";
        String actual = stringsAndThings.removeString("Caterpie Materpie", "terpie");
        Assert.assertEquals(expected, actual);
    }

}
