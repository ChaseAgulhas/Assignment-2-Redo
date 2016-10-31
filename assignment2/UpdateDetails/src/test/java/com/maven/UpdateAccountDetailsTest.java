package com.maven;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chase on 2016-10-31.
 */
public class UpdateAccountDetailsTest {

    UpdateAccountDetails uad = new UpdateAccountDetails();

    @Test
    public void testNewAccountTotals() throws Exception {
        Assert.assertNotNull(uad.returnAccountTotals());
    }

}
