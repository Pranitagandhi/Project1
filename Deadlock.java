package MultiThrading.com;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	int bal, acc_no;
	final Lock l1 = new ReentrantLock();

	BankAccount(int bal, int acc_no) {
		this.bal = bal;
		this.acc_no = acc_no;
	}

	void withdrawl(int amount) {
		try {
			bal -= amount;
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	void deposit(int amount) {
		try {
			bal += amount;
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			System.out.println(e1);
		}
	}

	static void transfer(BankAccount from, BankAccount to, int amount) {
		from.l1.lock();
		from.withdrawl(amount);
		to.l1.lock();
		to.deposit(amount);
		to.l1.unlock();
		from.l1.unlock();
	}

	public static void main(String args[]) {
		final BankAccount b1 = new BankAccount(1000, 233);
		final BankAccount b2 = new BankAccount(2000, 544);

		new Thread() {
			public void run() {
				System.out.println("lock assigned to thread 1");
				BankAccount.transfer(b1, b2, 500);
				System.out.println("amount transfered to account B");
			}
		}.start();

		new Thread() {
			public void run() {
				System.out.println("lock assigned to thread2");
				BankAccount.transfer(b2, b1, 1000);
				System.out.println("amount transfered to account a");

			}
		}.start();

	}

}
