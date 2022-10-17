package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest
{

    @Test
    public void test()
    {
        assertEquals(App.addMinutes("9:13 PM", 227), "01:00 AM");
        assertEquals(App.addMinutes("9:13 AM", 227), "01:00 PM");
        assertEquals(App.addMinutes("9:13 AM", 120), "11:13 AM");
        assertEquals(App.addMinutes("9:13 PM", 120), "11:13 PM");
    }

}
