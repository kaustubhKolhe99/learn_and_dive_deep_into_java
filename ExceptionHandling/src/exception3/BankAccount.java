package exception3;

public class BankAccount {
    public static void depositAmount(double amount) throws NegativeAmount{
        if(amount<0){
            throw new NegativeAmount(ErrorCode.NEGATIVE_DEPOSITE);
        } else if (amount==0) {
            throw  new NegativeAmount(ErrorCode.ZERO_DEPOSITE);

        }
        System.out.println("money deposited");
    }
}

