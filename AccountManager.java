import javax.swing.*;
public class AccountManager
{ public static void main(String[] args)
	{ // create the application's objects:
BankReader reader = new BankReader();
BankAccount account = new BankAccount(0);
BankWriter writer = new BankWriter(JOptionPane.showInputDialog(null,"emri i shfrytezuesit").toUpperCase(), account, 0);
AccountController controller =
new AccountController(reader, writer, account);
// start the controller:
controller.processTransactions();
	}
}