package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chase on 2016-10-31.
 */
public class TestLogin {

    Login login = new Login();
    @Test
    public void testValidCardNumber() throws Exception {
        Assert.assertNotSame(login.returnCardNumber(), null);
    }

    @Test
    public void testValidatePin() throws Exception {

        Assert.assertNotSame(login.returnPin(), null);
    }
}
