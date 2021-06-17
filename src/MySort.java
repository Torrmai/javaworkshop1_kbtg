public class MySort {
    private String inp_list;
    public MySort(String test_case) {
        this.inp_list = test_case;
    }

    public int numMem() {
        int len = 0;
        boolean isInt = false;
        for(int i=1;i<inp_list.length();i++){
            try {
                Integer.parseInt(String.valueOf(inp_list.charAt(i)));
                isInt =true;
            }
            catch (Exception e){
                if(isInt){
                    len++;
                    isInt = false;
                }
            }
        }
        return  len;
    }
}
