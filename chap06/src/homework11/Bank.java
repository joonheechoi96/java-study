package homework11;

public class Bank {
	public void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
		receiver.deposit(amount);
		System.out.println("계좌 번호: " + sender.getAccountNumber());
		System.out.println("현재 잔액: " + sender.getBalance());
		System.out.println("계좌 번호: " + receiver.getAccountNumber());
		System.out.println("현재 잔액: " + receiver.getBalance());
	}
}
