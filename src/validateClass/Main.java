package validateClass;

public class Main {
    public static final String[] validClass = {"A1234G", "C3242K", "P9868L"};
    public static final String[] unvalidClass = {"b1234G", "C322K", "P9868a"};
    static ClassEx ex = new ClassEx();

    public static void main(String[] args) {
        ex = new ClassEx();
        for (String s : validClass){
            boolean validate = ex.validate(s);
            System.out.println(s + " " + validate);
        }
        for (String s : unvalidClass){
            boolean validate = ex.validate(s);
            System.out.println(s + " " + validate);

    }
    }
}
