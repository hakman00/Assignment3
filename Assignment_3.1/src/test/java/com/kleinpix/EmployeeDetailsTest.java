package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   01 March 2018
    Descript:   Create an Application that will make use of Collection,List,Set and Map
 */
import junit.framework.TestCase;
import org.junit.Test;
import java.util.*;

public class EmployeeDetailsTest extends TestCase
{
    EmployeeDetails emp1Details = new EmployeeDetails("Hein","Klein",750000.00, 650157 );
    EmployeeDetails emp2Details = new EmployeeDetails("Dawn","Klein",550000.00, 650100 );
    EmployeeDetails emp3Details = new EmployeeDetails("Alec","Klein",650000.00, 650157 );
    EmployeeDetails emp4Details = new EmployeeDetails("Luke","Klein",700000.00, 650157 );

    @Test
    public void testArrayList()
    {
        List<EmployeeDetails> empDetails = new ArrayList<EmployeeDetails>();
        empDetails.add(emp1Details);
        assertTrue("OBJECTS IN LIST: ", empDetails.contains(emp1Details));
    }

    @Test
    public void testLinkList()
    {
        List<EmployeeDetails> empDetails = new LinkedList<EmployeeDetails>();
        empDetails.add(emp2Details);
        empDetails.remove(emp2Details);
        assertFalse("OBJECTS IN LIST: ", empDetails.contains(emp2Details));
    }

    @Test
    public void testStack()
    {
        List<EmployeeDetails> empDetails = new Stack<EmployeeDetails>();
        empDetails.add(emp1Details);
        empDetails.add(emp4Details);
        empDetails.remove(1);
        assertNotSame("OBJECT SAME: ", emp1Details,emp4Details);
    }

    @Test
    public void testVector()
    {
        List<EmployeeDetails> empDetails = new Vector<EmployeeDetails>();
        empDetails.add(emp2Details);
        empDetails.add(emp2Details);
        empDetails.remove(emp3Details);
        assertNotNull(empDetails);
    }
    @Test
    public void testHashSet()
    {
        Set<EmployeeDetails> empDetails = new HashSet<EmployeeDetails>();
        empDetails.add(emp1Details);
        empDetails.add(emp2Details);
        empDetails.add(emp3Details);
        assertSame("Trying to add same object into Hashset", emp3Details,emp3Details);
    }
    @Test
    public void testLinkedHashSet()
    {
        Set<EmployeeDetails> empDetails = new LinkedHashSet<EmployeeDetails>();
        empDetails.add(emp2Details);
        empDetails.add(emp4Details);
        empDetails.remove(0);
        assertTrue(empDetails.contains(emp2Details));
    }
    @Test
    public void testTreeSet()
    {
        Set<EmployeeDetails> empDetails = new TreeSet<EmployeeDetails>();
        assertNull(empDetails);
    }
    @Test
    public void testWeakHashMap()
    {
        Map<String, EmployeeDetails> empDetails = new WeakHashMap();
        empDetails.put("Key1", emp1Details);
        empDetails.put("Key2", emp2Details);
        empDetails.put("Key3", emp3Details);

        EmployeeDetails newEmpDet = (EmployeeDetails) empDetails.get("Key2");
        assertEquals(emp2Details,newEmpDet);
    }

}