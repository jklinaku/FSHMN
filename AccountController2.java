
public class AccountController2
{ private BankReader reader; 
private BankAccount primary_account;
private BankWriter primary_writer;
private BankAccount secondary_account;
private BankWriter secondary_writer;
private BankAccount account;
private BankWriter writer;
public AccountController2(BankReader r, BankAccount a1, BankWriter w1,
BankAccount a2, BankWriter w2)
{ reader = r;
primary_account = a1;
primary_writer = w1;
secondary_account = a2;
secondary_writer = w2;
account = primary_account;
writer = primary_writer;
}
private void resetAccount(BankAccount new_account, BankWriter new_writer)
{ writer.showTransaction("Joaktive"); 
account = new_account; 
writer = new_writer;
writer.showTransaction("Aktive");
}
public void processTransactions()
{ char command = reader.readCommand("Komandat (A,B, D,T,M):");
if ( command == 'M' ) 
{ }
else { if ( command == 'D' ) 
{ int amount = reader.readAmount();
account.deposit(amount);
writer.showTransaction("Deposita e $", amount);
}
else if ( command == 'T' ) 
{ int amount = reader.readAmount();
boolean ok = account.withdraw(amount);
if ( ok )
{ writer.showTransaction("terheqja e $", amount); }
else { writer.showTransaction("terheqja jovalide", amount); }
}
else if ( command == 'A' ) 
{ resetAccount(primary_account, primary_writer); }
else if ( command == 'B' ) 
{ resetAccount(secondary_account, secondary_writer); }
else { writer.showTransaction("komand qe nuk bene"); }
this.processTransactions();
}
}
}