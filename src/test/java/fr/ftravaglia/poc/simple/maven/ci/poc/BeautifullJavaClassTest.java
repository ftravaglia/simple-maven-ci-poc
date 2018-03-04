
package fr.ftravaglia.poc.simple.maven.ci.poc;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ftravaglia
 */
public class BeautifullJavaClassTest {
    
    public BeautifullJavaClassTest() {
        super();
    }
    
    /**
     * Test of sayHello method, of class BeautifullJavaClass.
     */
    @Test
    public void testSayHello() {
        BeautifullJavaClass instance = new BeautifullJavaClass();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getClassName method, of class BeautifullJavaClass.
     */
    @Test
    public void testGetClassName() {
        BeautifullJavaClass instance = new BeautifullJavaClass();
        String expResult = BeautifullJavaClass.class.getSimpleName();
        String result = instance.getClassName();
        assertEquals(expResult, result);
    }
    
}
