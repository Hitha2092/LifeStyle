package com.LifeStyle.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;


import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.LifeStyle.Entitymodels.User_Login;
import com.LifeStyle.Services.User_LoginServices;

@RunWith(Parameterized.class)
public class User_LoginServicesParameterizedTest {
	
	User_Login expected;
	
	
	
	@Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][] {
            {new User_Login("hin.com", "basha")},
            {new User_Login("tom", "tt")}
        });
    }
	
	
	
	public User_LoginServicesParameterizedTest(User_Login expected) {
        super();
        this.expected = expected;
    }
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public final void testaddUser() {
        
        
        System.out.println("--------------------Test Add user----------------");
        boolean result = false;
        System.out.println(expected.toString());
        User_LoginServices userservice = new User_LoginServices();
        boolean actual = userservice.addUser(expected);
        {
        	result = true;
        }
        assertTrue(result);
        
//        fail("Not yet implemented"); // TODO
    }
    
    @Test
    public final void testvalidateUser() {
        
        
        System.out.println("--------------------Test validating user----------------");
        System.out.println(expected.toString());
        User_LoginServices userservice = new User_LoginServices();
        User_Login actual = userservice.validateUser(expected);
        assertEquals(expected,actual);
//        fail("Not yet implemented"); // TODO
    }
    
    

}
