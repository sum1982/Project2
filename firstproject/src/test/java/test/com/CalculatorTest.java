/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.sel.firstproject.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author kohli
 */
public class CalculatorTest {
    
    Calculator calc;
    
    public CalculatorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        calc = new Calculator();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAdd(){
        assertEquals(calc.add(2, 4), 6);
    }
      @Test
    public void testMul(){
        assertEquals(calc.mul(2, 4), 8);
    }
}
