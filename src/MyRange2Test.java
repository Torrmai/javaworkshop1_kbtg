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
    @Test
    public void testToint(){
        String[] testcasestr = {"(1","20)","[300","4000000]"} ;
        int[] expected = {1,20,300,4000000};
        MyRange2 my2 = new MyRange2();
        for(int i =0;i<testcasestr.length;i++){
            int tmp = my2.toInt(testcasestr[i]);
            assertEquals(expected[i],tmp);
        }
    }
    @Test
    public void testEndResInclude(){
        String testcase = "[1,5]";
        MyRange2 my2 = new MyRange2(testcase);
        String res = my2.endRes();
        assertEquals("1,2,3,4,5",res);
    }
    @Test
    public void testEndResExclude(){
        String testcase = "(1,5)";
        MyRange2 my2 = new MyRange2(testcase);
        String res = my2.endRes();
        assertEquals("2,3,4",res);
    }
    @Test
    public void testEndResFail(){
        String testcase = "[5,1]";
        MyRange2 my2 = new MyRange2(testcase);
        String res = my2.endRes();
        assertEquals("",res);
    }
}