package io.zipcoder.stringsandthings;

import io.zipcoder.StringsAndThings;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 29/01/2019.
 */
public class GIsHappyTest {

    private StringsAndThings stringsAndThings;

    @Before
    public void setup(){
        stringsAndThings = new StringsAndThings();
    }


    @Test
    public void gIsHappyTest1(){
        Boolean actual = stringsAndThings.gIsHappy("xxggxx");
        Assert.assertTrue(actual);
    }

    @Test
    public void gIsHappyTest2(){
        Boolean actual = stringsAndThings.gIsHappy("xxgxx");
        Assert.assertFalse(actual);
    }



    // Assertion in this test is wrong. Last g is not happy according to instructions
    @Test
    public void gIsHappyTest3(){
        Boolean actual = stringsAndThings.gIsHappy("xxggyygxx");
        Assert.assertTrue(actual);
    }

    // Adding Tests for Practice
    @Test
    public void gIsHappyTest4(){
        Boolean actual = stringsAndThings.gIsHappy("kgjhggowjdgwkdu");
        Assert.assertFalse(actual);
    }

    @Test
    public void gIsHappyTest5(){
        Boolean actual = stringsAndThings.gIsHappy("gghhggiixxgg");
        Assert.assertTrue(actual);
    }

}
