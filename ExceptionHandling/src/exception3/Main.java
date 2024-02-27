package exception3;

public class Main {
    public static void main(String[] args) throws NegativeAmount {
        BankAccount.depositAmount(-5);
    }
}
