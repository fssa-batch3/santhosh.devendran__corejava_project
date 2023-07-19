package day05.practice;

public class IciciATM implements ATM {
	private static final double WITHDRAWAL_CHARGE = 10.0;

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

		if (account.getBalance() < amount + WITHDRAWAL_CHARGE || account.getBalance() < 10000) {
			throw new Exception("Insufficient balance");
		}

		account.setBalance(account.getBalance() - amount - WITHDRAWAL_CHARGE);
		return true;
	}

	@Override
	public double getBalance(Account account) {
		return account.getBalance();
	}
}