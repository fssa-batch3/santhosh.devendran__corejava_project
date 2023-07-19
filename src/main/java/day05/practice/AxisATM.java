package day05.practice;

public class AxisATM implements ATM {
    private static final double EXTRA_CHARGE = 5.0;

    @Override
    public boolean deposit(Account account, double amount) {
        if (amount <= 0) {
            return false; 
        }

        account.setBalance(account.getBalance() + amount);
        return true;
    }

    @Override
    public boolean withdraw(Account account, double amount) throws Exception {
        if (amount <= 0) {
            return false; 
        }

        if (account.getBalance() < amount + EXTRA_CHARGE || account.getBalance() < 5000) {
            throw new Exception("Insufficient balance"); 
        }

        account.setBalance(account.getBalance() - amount - EXTRA_CHARGE);
        return true;
    }

    @Override
    public double getBalance(Account account) {
        return account.getBalance();
    }
}
