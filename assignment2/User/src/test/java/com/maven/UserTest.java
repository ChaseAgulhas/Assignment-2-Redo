package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chase on 2016-10-31.
 */
public class UserTest {

    String name =  "Chase Agulhas";
    String cardNumber = "1234567890";
    String pin = "12345";
    int[] accountTotals = {500,600};

    User user = new User(name, cardNumber,accountTotals, pin);
    @Test
    public void testAssignTotal() throws Exception {
        Assert.assertEquals(user.returnTotal(), 1100);
    }
    @Test
    public void testName() throws Exception {
        Assert.assertSame(user.returnName(), "Chase Agulhas");
    }
    @Test
    public void testCardNumber() throws Exception {
        Assert.assertSame(user.returnCardNumber(), "1234567890");
    }
    @Test
    public void testAccountTotal() throws Exception {
        Assert.assertSame(user.returnAccountTotals(0), 500);
    }
}
