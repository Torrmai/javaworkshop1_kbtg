import java.util.ArrayList;
import java.util.List;

public class MySort {
    private List<Integer> inp_list = new ArrayList<>();
    public MySort(String test_case) {
        String tmp = test_case.replace("[","");
        tmp = test_case.replace("]","");
        String[] bf_int = tmp.split(",");
        for(int i=0;i<bf_int.length;i++){
            this.inp_list.add(Integer.parseInt(bf_int[i]));
        }
    }
    public List<Integer> getInpList(){
        return inp_list;
    }

}
