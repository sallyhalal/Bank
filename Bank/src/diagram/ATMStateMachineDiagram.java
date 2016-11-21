package diagram;

import hu.elte.txtuml.api.layout.StateMachineDiagram;
import model.ATM;
import model.ATM.*;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;


public class ATMStateMachineDiagram extends StateMachineDiagram<ATM>{
	@Column({Init.class,Ready.class,RetrieveBankCardinfo.class,CheckPinCode.class,ChooseService.class,ServiceChosen.class,Withdrawal.class,CheckAmountPossible.class,OutputMoney.class})
	@Row({RetrieveBankCardinfo.class,OutputCard.class})
	@Row({Withdrawal.class,printBalanceInfo.class,Enternumber.class,Cancel.class})
	@Column({Enternumber.class,Enteramount.class,mobileTopUp.class})
	 class BankLayout extends Layout {}
}
