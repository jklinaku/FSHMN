
public class AccountController
{ 
private BankReader reader; 
private BankWriter writer; 
private BankAccount account;

public AccountController(BankReader r, BankWriter w, BankAccount a)
{ reader = r;
account = a;
writer = w;
}

public void processTransactions()
{ char command = reader.readCommand("komandat (D,T,M) dhe sasia:");
if ( command == 'M' ) 
{ } 
else { if ( command == 'D' )
{ int amount = reader.readAmount();
boolean ok = account.deposit(amount);
if ( ok )
{ writer.showTransaction("Deposita e $", amount); }
else { writer.showTransaction("Deposita jovalid ", amount); }
}
else if ( command == 'T' )
{ int amount = reader.readAmount();
boolean ok = account.withdraw(amount);
if ( ok )
{ writer.showTransaction("terheqja e $", amount); }
else { writer.showTransaction("terheqja jovalide ", amount); }
}
else { writer.showTransaction("Komand e pa pranueshme: " + command); }
this.processTransactions(); 
}
}
}