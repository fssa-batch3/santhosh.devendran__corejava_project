package day05.practice;

public class App {
	public static void main(String[] args) {

		ATM axisATM = new AxisATM();

		Account axisAccount = new Account("AX0096", "santhosh devendran", 4000d);

		axisATM.deposit(axisAccount, 2000d);

		try {
			axisATM.withdraw(axisAccount, 5000d);
			System.out.println("Hi! " + axisAccount.getAccHolderName()
					+ " Your Withdrawal is successful. Current balance: " + axisATM.getBalance(axisAccount));
		} catch (Exception e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

		ATM iciciATM = new IciciATM();

		Account iciciAccount = new Account("IC0096", "santhosh", 15000d);

		iciciATM.deposit(iciciAccount, 1000d);

		try {
			iciciATM.withdraw(iciciAccount, 1000d);
			System.out.println("Hi! " + iciciAccount.getAccHolderName()
					+ " Your Withdrawal is successful. Current balance: " + iciciATM.getBalance(iciciAccount));
		} catch (Exception e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

	}

}
