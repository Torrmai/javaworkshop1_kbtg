import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void testNumMember(){
        String test_case = "[]";
        MySort testSort = new MySort(test_case);
        int res = testSort.numMem();
        assertEquals(0,res);
    }
    @Test
    public void testNumMember1(){
        String test_case = "[1]";
        MySort testSort = new MySort(test_case);
        int res = testSort.numMem();
        assertEquals(1,res);
    }
    @Test
    public void testNumMemberMany(){
        String test_case = "[1,222,444,555]";
        MySort testSort = new MySort(test_case);
        int res = testSort.numMem();
        assertEquals(4,res);
    }
    @Test
    public void testNoElemRes(){
        String test_case = "[]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals(test_case,res);
    }
    @Test
    public void testOneElemRes(){
        String test_case = "[99999]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals(test_case,res);
    }
    @Test
    public void testTwoSortElemRes(){
        String test_case = "[1,2]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals(test_case,res);
    }
    @Test
    public void testTwoUnSortElemRes(){
        String test_case = "[2,1]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals("[1,2]",res);
    }
    private String sorted_three = "[1,2,3]";
    @Test
    public void testThreeSortElemRes(){
        String test_case = "[1,2,3]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals(this.sorted_three,res);
    }
    @Test
    public void testThreeUnSorted01Res(){
        String test_case = "[2,1,3]";
        MySort testSort = new MySort(test_case);
        String res = testSort.genRes();
        assertEquals(this.sorted_three,res);
    }
}