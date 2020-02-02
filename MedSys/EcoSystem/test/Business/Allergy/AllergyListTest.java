/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Allergy;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sanjeev MD
 */
public class AllergyListTest {

    public AllergyListTest() {
        ArrayList<String> lactCompunds = new ArrayList<String>();
        lactCompunds.add("clemastine");
        lactCompunds.add("Sugar");
        lactCompunds.add("Sucrose");
        this.lactallergy = new Allergy("Lactose Intolerance", lactCompunds);
    }
    private Allergy lactallergy;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAllergyList method, of class AllergyList.
     */
    @Test
    public void testGetAllergyList() {
        System.out.println("getAllergyList");

        AllergyList instance = new AllergyList();
        instance.addAllergy(lactallergy);
        int expResult = 1;
        ArrayList<Allergy> result = instance.getAllergyList();
        assertEquals(expResult, result.size());

    }

    /**
     * Test of setAllergyList method, of class AllergyList.
     */
    @Test
    public void testSetAllergyList() {
        System.out.println("setAllergyList");
        ArrayList<Allergy> allergyList = null;
        AllergyList instance = new AllergyList();
        instance.setAllergyList(allergyList);
    }

    /**
     * Test of checkexist method, of class AllergyList.
     */
    @Test
    public void testCheckexist() {
        System.out.println("checkexist");    
        Allergy selectedAllergy = lactallergy;
        AllergyList instance = new AllergyList();
        boolean expResult = true;
        boolean result = instance.checkexist(selectedAllergy);
        assertEquals(expResult, result);

    }

    /**
     * Test of addAllergy method, of class AllergyList.
     */
    @Test
    public void testAddAllergy() {
        System.out.println("addAllergy");
        Allergy selectedAllergy = lactallergy;
        AllergyList instance = new AllergyList();
        instance.addAllergy(selectedAllergy);
    }

}
