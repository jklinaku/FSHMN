import javax.swing.*;
public class BankAccount {
	
	
	
	 private int balance;	public BankAccount(int initial_amount)
	{ if ( initial_amount >= 0 )
	{ balance = initial_amount; }
	else { balance = 0; }
	}
	public boolean deposit(int amount)
	{ boolean result = false;
	if ( amount >= 0 )
	{ balance = balance + amount;
	result = true;
	}
	else { JOptionPane.showMessageDialog(null,
	"BankAcccount error: depozit e gabuar");
	}
	return result;
	}
	

public boolean withdraw(int amount)
{ boolean result = false;
if ( amount < 0 )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: Gabim ne sasin e terheqjes"); }
else if ( amount > balance )
{ JOptionPane.showMessageDialog(null,
"BankAcccount error: keni kaluar totalin e balancit");
}
else { balance = balance - amount;
result = true;
}
return result;
}
public int getBalance()
{ return balance; }
}

