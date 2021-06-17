import java.util.concurrent.atomic.AtomicInteger;

public class MyRange {
    public static void main(String[] args) {
        int end =0 ;
        int start = 0;
        String[] num = args[0].split(",");
        if('[' == (args[0].charAt(0))){
            start += toInt(num[0]);
        }
        else if('(' == (args[0].charAt(0))){
            start += toInt(num[0]) + 1;
        }

        if(']' == (args[0].charAt(args[0].length()-1))){
            end += toInt(num[1]);
        }
        else if(')' == (args[0].charAt(args[0].length()-1))){
            end += toInt(num[1]) - 1;
        }
        String result = "";
        for(int i = start;i<=end;i++){
            if(i != end){
                result += i + ",";
            }
            else{
                result += i;
            }
        }
        System.out.println(result);
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
