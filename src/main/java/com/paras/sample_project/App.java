package com.paras.sample_project;

import java.util.logging.Logger;

import junit.framework.Assert;

/**
 * Hello world!
 *
 */
public class App 

{
	
	private static final Logger LOG = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	
    	LOG.info("Hello World");
    	int a  =2 ;
    	if(a !=2 ) {
    		Assert.fail();
    	}
        
    }
}
