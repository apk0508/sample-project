package com.paras.sample_project;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;


/**
 * Hello world!
 *
 */
public class App 

{
	
	private static final Logger LOG = Logger.getLogger(App.class.getName());
	
	@Test
    public void test()
    {
    	LOG.info("Hello World");
    	int a  =2 ;
    	if(a !=2 ) {
    		Assert.fail();
    	}
        
    }
}
