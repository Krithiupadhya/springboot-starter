package com.mindtree.ship_wreck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mindtree.ship_wreck.controller.HomeController;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
    public void testApp()
    {
		HomeController controller = new HomeController();
		String str= controller.home();
        assertEquals("My Home page", str);
	    //Doing some changes- Just like that
    }
}
