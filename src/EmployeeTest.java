import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    @DisplayName("Test default constructor expected result: ? ?")
    public void testCase1(){
        String expected = "? ?";
        Employee demo = new Employee();
        String actual = demo.getFname();
        //ตรวจความถูกต้อง
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test with fname:Chanawat,lname:Lohachala expected result: Chanawat Lohachala")
    public void testCase2(){
        String expected = "Chanawat Lohachala";
        Employee demo = new Employee("Chanawat","Lohachala");
        String actual = demo.getFname();
        //ตรวจความถูกต้อง
        assertEquals(expected,actual);
    }
}