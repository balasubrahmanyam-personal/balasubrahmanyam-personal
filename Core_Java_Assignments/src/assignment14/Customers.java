package assignment14;

//import pratice_code.nonIndianException.NonIndianException;

public class Customers {
    public void checkCriteria(int amount, int balance) throws InsufficientBalanceException,InvalidAmountException {
        if (amount <= 0) {
            try {
                throw new InvalidAmountException("You can't withdraw -ve or 0 amt");
            } catch (InvalidAmountException e) {
                e.getMessage();
            }


        }

        if(balance<amount){
            try{
                throw new InsufficientBalanceException("Not Have that much of amount");
            } catch (InsufficientBalanceException e) {
                e.getMessage();
            }
        }

    }
}