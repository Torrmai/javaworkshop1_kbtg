public class Main {
    public static void main(String[] args) {
        String firstname = args[0];
        String lastname = args[1];
        Employee chanawat = new Employee(firstname,lastname);
        String res = chanawat.getFname();
        System.out.println(res);
    }
}
