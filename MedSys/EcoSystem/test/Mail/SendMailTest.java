/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mail;

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
public class SendMailTest {
    
    public SendMailTest() {
    }
    
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
     * Test of sendMail method, of class SendMail.
     */
    @Test
    public void testSendMail() throws Exception {
        System.out.println("sendMail");
        String recepient = "kumar.ke@husky.neu.edu";
        String content = "testing";
        String subject = "testing";
        SendMail.sendMail(recepient, content, subject);
    }   
}
