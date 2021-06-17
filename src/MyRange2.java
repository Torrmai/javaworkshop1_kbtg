import java.util.concurrent.atomic.AtomicInteger;

public class MyRange2 {
    private String inp;

    public MyRange2(String testcase) {
        this.inp = testcase;
    }

    public int getStart() {
        int start = 0;
        String[] num = inp.split(",");
        if('[' == (num[0].charAt(0))){
            start += toInt(num[0]);
        }
        else if('(' == (num[0].charAt(0))){
            start += toInt(num[0]) + 1;
        }
        return start;
    }
    public int getEnd(){
        int end = 0;
        String[] num = inp.split(",");
        if(']' == (inp.charAt(inp.length()-1))){
            end += toInt(num[1]);
        }
        else if(')' == (inp.charAt(inp.length()-1))){
            end += toInt(num[1]) - 1;
        }
        return end;
    }
    public  String endRes(){
        String result = "";
        int start = getStart();
        int end = getEnd();
        for(int i = start;i<=end;i++){
            if(i != end){
                result += i + ",";
            }
            else{
                result += i;
            }
        }
        return result;
    }
    private static int toInt(String inp){
        String tmp = "";
        for(int i=0;i<inp.length();i++){
            if('[' == inp.charAt(i) | ']' == inp.charAt(i) | '(' == inp.charAt(i) | ')' == inp.charAt(i)){
            }
            else {tmp += inp.charAt(i);}
        }
        int rtn = Integer.parseInt(tmp);
        return rtn;
    }
}


