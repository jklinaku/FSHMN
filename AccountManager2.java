
public class AccountManager2
{ public static void main(String[] args)
	{ BankReader reader = new BankReader();
BankAccount primary_account = new BankAccount(0);
BankWriter primary_writer
= new BankWriter("A", primary_account, 0);
BankAccount secondary_account = new BankAccount(0);
BankWriter secondary_writer
= new BankWriter("B", secondary_account,1);
AccountController2 controller = new AccountController2(reader,
primary_account, primary_writer, secondary_account, secondary_writer);
controller. processTransactions();
	}
}