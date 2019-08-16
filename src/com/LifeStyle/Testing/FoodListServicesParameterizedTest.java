package com.LifeStyle.Testing;

import static org.junit.Assert.*;



import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.LifeStyle.Entitymodels.FoodList;
import com.LifeStyle.Services.FoodListServices;

@RunWith(Parameterized.class)
public class FoodListServicesParameterizedTest {
	
	
	FoodList expected;
	
	
	
	@Parameterized.Parameters
    public static Collection params() {
        return Arrays.asList(new Object[][] {
            {new FoodList("rice",1,70,10.5,20,60)},
           {new FoodList("ribs",3,79,10.5,20,60)}
        });
    }
	
	
	
	public FoodListServicesParameterizedTest(FoodList expected) {
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
    public final void testgetAllFoodItems() {
        
        // test case 1
        // should return 17 as database contain 17 as of now ;
        
        
        System.out.println("--------------------Test All food items----------------");
        System.out.println(expected.toString());
        FoodListServices fdservice = new FoodListServices();
        List<FoodList> actual = fdservice.getAllFoodItems();
        assertEquals(17,actual.size());
//        fail("Not yet implemented"); // TODO
    }

    @Test
    public final void testgetByFoodName() {
        
        // test case 1
        // should return 17 as database contain 17 as of now ;
        
        
        System.out.println("--------------------Test get By FoodName----------------");
        System.out.println(expected.toString());
        FoodListServices fdservice = new FoodListServices();
        List<FoodList>  actual = fdservice.getByFoodmenu(expected.getMenu());
        System.out.println("expected=" + expected);
        System.out.println("actual=" + actual);
        assertEquals(expected,actual);
        
//        fail("Not yet implemented"); // TODO
    }

}


