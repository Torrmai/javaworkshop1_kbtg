public class DemoStringClass {
    public static void main(String[] args) {
        String name1 = "a";
        String name2 = new String("a");//Create another dedicate string object
        if(name1 == "a"){ //bad implementation
            System.out.println("OK");
        }
        if("a".equals(name2)){//good implementation because prevent null pointer
            System.out.println("OK");
        }
        String test = "abcd";
        for(int i = 0;i<test.length();i++){
            System.out.println(i+": "+test.charAt(i));
        }
    }
}
