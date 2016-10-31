package com.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Chase on 2016-10-31.
 */
public class AccountDetailsTest {

    int[] accountTotals = {500,600};

    AccountDetails report = new AccountDetails("Chase Agulhas", "1234567890", accountTotals, "12345");

    @Test
    public void testTotal() {
        Assert.assertNotNull("NULL", report.calcTotal());
    }

}
