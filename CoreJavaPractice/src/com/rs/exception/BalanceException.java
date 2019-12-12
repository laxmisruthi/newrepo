package com.rs.exception;

public class BalanceException extends Exception {
	static int acc_bal = 200; // current account balance

	public String toString() {
		return "Cannot debit. Low Account Balance.";
	}

	public static void main(String[] args) {
		BalanceException obj = new BalanceException();
		try {
			obj.withdraw(100);
		} catch (BalanceException e) {
			System.out.println("exception occur: " + e);

		}
	}

	public static void withdraw(int debitmoney) throws BalanceException {
		if (acc_bal > 1000) {
			acc_bal = acc_bal - debitmoney;
			System.out.println(acc_bal);
		} else {
			throw new BalanceException();
		}
	}

}
