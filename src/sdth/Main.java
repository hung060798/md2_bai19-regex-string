package sdth;

public class Main {
    static PhoneNumberEx phoneNumberEx;
    public static final String[] valid ={"(18)-(0123456789)"};
    public static final String[] inValid = {"(1)-()", "(18)-(10000000)","(02)-(01929)"};

    public static void main(String[] args) {
        phoneNumberEx = new PhoneNumberEx();
        for (String s : valid){
            boolean validate = phoneNumberEx.validate(s);
            System.out.println(s + " " + validate);
        }
        phoneNumberEx = new PhoneNumberEx();
        for (String s : inValid){
            boolean validate = phoneNumberEx.validate(s);
            System.out.println(s + " " + validate);
        }


    }

}
