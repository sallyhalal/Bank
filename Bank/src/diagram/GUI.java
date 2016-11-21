package diagram;

import javax.swing.JFrame;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;

import model.ATM;
import model.done;
import model.infoEntered;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class GUI implements GUIInterface {
	static JFrame frame;
	static ATM atm;
	static String state;
	static String Service;
	static JLabel label;
	static JLabel lblInqueries;
	/**
	 * @wbp.parser.entryPoint
	 */
	static void init() {
		atm = Action.create(ATM.class);
		frame = new JFrame();
		
		JButton OneButton = new JButton("1");
		OneButton.setBounds(317, 77, 47, 23);
		OneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"1");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"1");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"1");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"1");
				}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(OneButton);
		
		JButton TwoButton = new JButton("2");
		TwoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"2");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"2");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"2");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"2");
				}
			}
		});
		TwoButton.setBounds(374, 77, 47, 23);
		frame.getContentPane().add(TwoButton);
		
		JButton ThreeButton = new JButton("3");
		ThreeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"3");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"3");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"3");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"3");
				}
			}
		});
		ThreeButton.setBounds(431, 77, 47, 23);
		frame.getContentPane().add(ThreeButton);
		
		JButton FourButton = new JButton("4");
		FourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"4");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"4");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"4");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"4");
				}
			}
		});
		FourButton.setBounds(317, 112, 47, 23);
		frame.getContentPane().add(FourButton);
		
		JButton SevenButton = new JButton("7");
		SevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"7");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"7");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"7");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"7");
				}
			}
		});
		SevenButton.setBounds(317, 146, 47, 23);
		frame.getContentPane().add(SevenButton);
		
		JButton FiveButton = new JButton("5");
		FiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"5");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"5");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"5");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"5");
				}
			}
		});
		FiveButton.setBounds(374, 112, 47, 23);
		frame.getContentPane().add(FiveButton);
		
		JButton EightButton = new JButton("8");
		EightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"8");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"8");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"8");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"8");
				}
			}
		});
		EightButton.setBounds(374, 146, 47, 23);
		frame.getContentPane().add(EightButton);
		
		JButton SixButton = new JButton("6");
		SixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"6");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"6");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"6");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"6");
				}
			}
		});
		SixButton.setBounds(431, 111, 47, 23);
		frame.getContentPane().add(SixButton);
		
		JButton NineButton = new JButton("9");
		NineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"9");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"9");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"9");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"9");
				}
			}
		});
		NineButton.setBounds(431, 146, 47, 23);
		frame.getContentPane().add(NineButton);
		
		JButton EnterButton = new JButton("Enter");
		EnterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Action.send(new infoEntered(), atm);
				
			}
		});
		EnterButton.setBounds(317, 214, 69, 23);
		frame.getContentPane().add(EnterButton);
		
		JButton ZeroButton = new JButton("0");
		ZeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(state.equals("Pin") && (label.getText().length() <4) && (label.getText().length() >=0)){
					label.setText(label.getText() +"0");
					
				}
				else if(state.equals("Withdrawal") && (label.getText().length() <7) && (label.getText().length() >=0)){
					label.setText(label.getText() +"0");
				}else if(state.equals("Mobile") && (label.getText().length() <9) && (label.getText().length() >=0)){
					label.setText(label.getText() +"0");
				}else if(state.equals("amount") && (label.getText().length() <5) && (label.getText().length() >=0)){
					label.setText(label.getText() +"0");
				}
			}
		});
		ZeroButton.setBounds(374, 177, 47, 23);
		frame.getContentPane().add(ZeroButton);
		
		JButton WithDrawal = new JButton("Withdrawal");
		WithDrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service="Withdrawal";
				Action.send(new infoEntered(), atm);
			}
		});
		WithDrawal.setBounds(161, 77, 111, 23);
		frame.getContentPane().add(WithDrawal);
		
		JButton AccountInfo = new JButton("Account Info");
		AccountInfo.setBounds(161, 112, 111, 23);
		AccountInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service="Get Balance information";
				Action.send(new infoEntered(), atm);
			}
		});
		frame.getContentPane().add(AccountInfo);
		
		JButton Mobile = new JButton("Mobile Top-up");
		Mobile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service="Mobile Top-Up";
				Action.send(new infoEntered(), atm);
			}
		});
		Mobile.setBounds(161, 146, 111, 23);
		frame.getContentPane().add(Mobile);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.setBounds(161, 180, 111, 23);
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Service="Cancel";
				Action.send(new infoEntered(), atm);
			}
		});
		frame.getContentPane().add(CancelButton);
		
		JButton DoneSignalButton = new JButton("OK");
		DoneSignalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action.send(new done(), atm);
			}
		});
		DoneSignalButton.setBounds(409, 214, 69, 23);
		frame.getContentPane().add(DoneSignalButton);
		
		 lblInqueries = new JLabel("Please Insert Card");
		lblInqueries.setBounds(10, 11, 354, 60);
		frame.getContentPane().add(lblInqueries);
		
		 label = new JLabel("");
		label.setBounds(10, 132, 106, 105);
		frame.getContentPane().add(label);
		
		JButton InsertCard = new JButton("Insert Card");
		InsertCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Action.send(new model.InsertCard(),atm);
			}
		});
		InsertCard.setBounds(161, 214, 111, 23);
		frame.getContentPane().add(InsertCard);
		
		frame.setSize(550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

		Action.start(atm);
	
	}
	
	public static void main(String[] args) {
		ModelExecutor.create().setTraceLogging(true).start(GUI::init);
	}

	@Override
	public void CheckPin() {
		state="Pin";
		
	}

	@Override
	public String getValue() {
		 
		String s =label.getText();
		label.setText("");
		return s; 
		
	}

	@Override
	public void printInquery(String S) {
		lblInqueries.setText(S);
	}

	@Override
	public void Withdrawal() {
		state="Withdrawal";
		label.setText("");
		
	}

	@Override
	public String getServices() {
		
		return Service;
	}

	@Override
	public void mobile() {
		state="Mobile";
		label.setText("");
		
	}
	
	@Override
	public void setValueNull() {
		
		label.setText("");
		
	}
	@Override
	public void mobileamount() {
		state="amount";
		label.setText("");
		
	}
}
