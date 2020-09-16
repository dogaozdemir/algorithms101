package algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GlobalTest {

    private Global global;

    @Before
    public void SetUp(){
        global=new Global();
    }

    @Test
    public void isEvenOrOdd(){
        int n=123;
        Assert.assertFalse(global.isEven(n));
    }

    @Test
    public void isPalindrome(){
        String s="abc";

        Assert.assertEquals("cba",global.palindrome(s));
    }

    @Test
    public void isNumberPrime(){


        Assert.assertFalse(global.isPrime(12));
        Assert.assertTrue(global.isPrime(13));
    }
}
