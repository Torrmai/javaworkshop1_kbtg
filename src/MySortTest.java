import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {
    @Test
    public void testToArray(){
        String test_case = "[1,2,3]";
        List<Integer> Expected = new ArrayList<>();
        Expected.add(1);
        Expected.add(2);
        Expected.add(3);
        MySort testSort = new MySort(test_case);
        List<Integer> res = testSort.getInpList();
        assertEquals(Expected,res);
    }

}