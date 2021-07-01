package th_ValidateAccount;

public class Main {
    private static AccountExample accountExample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String s: validAccount){
            boolean isvalid = accountExample.validate(s);
            System.out.println(s + " " + isvalid);
        }

        for (String s : invalidAccount){
            boolean isvalid = accountExample.validate(s );
            System.out.println(s + " " + isvalid);
        }
    }
}
