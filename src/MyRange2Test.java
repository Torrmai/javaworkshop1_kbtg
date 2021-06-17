import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRange2Test {
    @Test
    public void testStartInclude(){
        String testcase = "[1,5]";
        MyRange2 my2 = new MyRange2(testcase);
        int res = my2.getStart();
        assertEquals(1,res);
    }
    @Test
    public void testStartExclude(){
        String testcase = "(1,5]";
        MyRange2 my2 = new MyRange2(testcase);
        int res = my2.getStart();
        assertEquals(2,res);
    }
    @Test
    public void testEndInclude(){
        String testcase = "[1,5]";
        MyRange2 my2 = new MyRange2(testcase);
        int res = my2.getEnd();
        assertEquals(5,res);
    }
    @Test
    public void testEndExclude(){
        String testcase = "[1,5)";
        MyRange2 my2 = new MyRange2(testcase);
        int res = my2.getEnd();
        assertEquals(4,res);
    }
}