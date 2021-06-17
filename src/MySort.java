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

    public String genRes() {
        int len = numMem();
        String rtn = "";
        if(len <= 1){
            return inp_list;
        }
        else{
            String tmp = inp_list.replace("[","");
            tmp = tmp.replace("]","");
            String[] list_of_elem = tmp.split(",");
            for(int i=0;i<len;i++){
                String selected_one = list_of_elem[i];
                for(int j=i;j<len;j++){
                    if(Integer.valueOf(selected_one) >Integer.valueOf(list_of_elem[j])){
                        selected_one = list_of_elem[j];
                    }
                }
                rtn += selected_one;
            }
        }
        return rtn;
    }
}
