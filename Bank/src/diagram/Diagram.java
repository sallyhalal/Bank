package diagram;

import hu.elte.txtuml.api.layout.*;
import model.*;

public class Diagram extends ClassDiagram{
	
		@Row({Bank.class,Employee.class,Person.class})
		
		@Column({Employee.class, Account.class, CreditAccount.class})
		@Column({OnlineAccount.class})
		@Row({BankCard.class,Account.class,Customer.class})
		
		@Column({Person.class, Customer.class, Loans.class})
		@Row({OnlineAccount.class,Balance.class,CreditAccount.class,Loans.class})
		@Column({Bank.class, BankCard.class,Balance.class})
		
		
		  class BankLayout extends Layout {}

		 
		 
}
