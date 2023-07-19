package day05.practice;

public class Account {
	String accNo;
	double balance;
	String AccHolderName;

	public String getAccHolderName() {
		return AccHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		AccHolderName = accHolderName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String accNo,String name, double balance) {
		this.accNo = accNo;
		this.balance = balance;
		this.AccHolderName = name;
	}

}
