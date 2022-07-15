package operatorPrecedenceGame;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;



public class Rock_Paper_Scissors_but_Operators_Game extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField tfOperatorA;
	private static JTextField tfOperatorB;
	private static OperatorCards cardA, cardB;
	private static JLabel labelAnswerResult;
	private static JLabel labelResultExplanation1;
	private static JButton btnYes;
	private static JButton btnEqual;
	private static JButton btnNo;
	private static JButton btnDraw2Cards;
	private JLabel labelBeats;
	private JSeparator separator;
	private static JLabel labelResultExplanation2;
	private static JLabel labelResultExplanation3;
	private static JButton btnHelp;
	private static Rock_Paper_Scissors_but_Operators_Game frame = new Rock_Paper_Scissors_but_Operators_Game();
	private static OperatorTable oTableFrame = new OperatorTable();
	private JSeparator separator_1;
	private JLabel labelWinStreak;
	private int winStreak = 0;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);	
					
					createARound();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Rock_Paper_Scissors_but_Operators_Game() {
		setResizable(false);
		
		setTitle("Rock-Paper-Scissors but Operators");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		labelBeats = new JLabel("beats");
		labelBeats.setHorizontalAlignment(SwingConstants.CENTER);
		labelBeats.setBounds(109, 91, 36, 14);
		contentPane.add(labelBeats);
		
		tfOperatorA = new JTextField();
		tfOperatorA.setHorizontalAlignment(SwingConstants.CENTER);
		tfOperatorA.setEditable(false);
		tfOperatorA.setBounds(55, 88, 44, 20);
		contentPane.add(tfOperatorA);
		tfOperatorA.setColumns(10);
		
		tfOperatorB = new JTextField();
		tfOperatorB.setHorizontalAlignment(SwingConstants.CENTER);
		tfOperatorB.setEditable(false);
		tfOperatorB.setColumns(10);
		tfOperatorB.setBounds(155, 88, 49, 20);
		contentPane.add(tfOperatorB);
		
		btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if  (cardA.getValue() > cardB.getValue()) {
					labelAnswerResult.setText("Correct!");
				} else {
					labelAnswerResult.setText("Wrong!");
				}
				showExplanation();
				turnAnswerButtonsOff();
			}
		});
		btnYes.setBounds(252, 53, 89, 23);
		contentPane.add(btnYes);
		
		btnEqual = new JButton("Equal");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if  (cardA.getValue() == cardB.getValue()) { // || cardA.getType().equals(cardB.getType())) {
					labelAnswerResult.setText("Correct!");
				} else {
					labelAnswerResult.setText("Wrong!");
				}
				showExplanation();
				turnAnswerButtonsOff();
			}
		});
		btnEqual.setBounds(252, 87, 89, 23);
		contentPane.add(btnEqual);
		
		btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if  (cardA.getValue() < cardB.getValue() || cardA.getValue() == cardB.getValue() || cardA.getType().equals(cardB.getType())) {
					labelAnswerResult.setText("Correct!");
				} else {
					labelAnswerResult.setText("Wrong!");
				}
				showExplanation();
				turnAnswerButtonsOff();
			}
		});
		btnNo.setBounds(252, 121, 89, 23);
		contentPane.add(btnNo);
		
		separator = new JSeparator();
		separator.setBounds(10, 155, 364, 8);
		contentPane.add(separator);
		
		labelAnswerResult = new JLabel("");
		labelAnswerResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelAnswerResult.setHorizontalAlignment(SwingConstants.CENTER);
		labelAnswerResult.setBounds(55, 124, 149, 20);
		contentPane.add(labelAnswerResult);
		
		labelResultExplanation1 = new JLabel("");
		labelResultExplanation1.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultExplanation1.setBounds(10, 165, 364, 14);
		contentPane.add(labelResultExplanation1);
		
		btnDraw2Cards = new JButton("Draw 2 Cards");
		btnDraw2Cards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				createARound();
				turnAnswerButtonsOn();
				deleteAnswerAndExplanation();
			}
		});
		btnDraw2Cards.setBounds(64, 11, 131, 23);
		contentPane.add(btnDraw2Cards);
		
		labelResultExplanation2 = new JLabel("");
		labelResultExplanation2.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultExplanation2.setBounds(10, 182, 364, 14);
		contentPane.add(labelResultExplanation2);
		
		labelResultExplanation3 = new JLabel("");
		labelResultExplanation3.setHorizontalAlignment(SwingConstants.CENTER);
		labelResultExplanation3.setBounds(10, 198, 364, 14);
		contentPane.add(labelResultExplanation3);
		
		btnHelp = new JButton("?");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openOperatorInfoTableWindow();
			}
		});
		btnHelp.setBounds(10, 11, 44, 23);
		contentPane.add(btnHelp);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 42, 364, 8);
		contentPane.add(separator_1);
		
		labelWinStreak = new JLabel("");
		labelWinStreak.setHorizontalAlignment(SwingConstants.CENTER);
		labelWinStreak.setBounds(215, 15, 159, 14);
		contentPane.add(labelWinStreak);
	}
	
	public static void createARound() {
		OperatorCards.createCards();
		cardA = OperatorCards.getRandomCard();
		cardB = OperatorCards.getRandomCard();
		tfOperatorA.setText(cardA.getOperator());
		tfOperatorB.setText(cardB.getOperator());
	}

	public static void showExplanation() {
		showWinStreak();
		
		//For the lulz
		if (cardA.equals(cardB)) {
			labelResultExplanation2.setText("They are the same, lol.");
		}
		
		//Serious explanations
		else if (cardA.getValue() > cardB.getValue()) {
			labelResultExplanation1.setText(cardA.getType() + " [ " + cardA.getOperator() + " ]");
			labelResultExplanation2.setText("is above");
			labelResultExplanation3.setText(cardB.getType() + " [ " + cardB.getOperator() + " ]");
		}
		else if (cardA.getValue() < cardB.getValue()) {
			labelResultExplanation1.setText(cardB.getType() + " [ " + cardB.getOperator() + " ]");
			labelResultExplanation2.setText("is above");
			labelResultExplanation3.setText(cardA.getType() + " [ " + cardA.getOperator()+ " ]");
		}
		else if (cardA.getOperator().contains("&") & cardB.getOperator().contains("|")) {
			labelResultExplanation1.setText(cardA.getType() + " [ " + cardA.getOperator() + " ]");
			labelResultExplanation2.setText("beats");
			labelResultExplanation3.setText(cardB.getType() + " [ " + cardB.getOperator()+ " ]");
		}
		else if (cardA.getOperator().contains("|") & cardB.getOperator().contains("&")) {
			labelResultExplanation1.setText(cardB.getType() + " [ " + cardB.getOperator() + " ]");
			labelResultExplanation2.setText("beats");
			labelResultExplanation3.setText(cardA.getType() + " [ " +  cardA.getOperator()+ " ]");
		}
		else if (cardA.getValue() == cardB.getValue()) { // || cardA.getType().equals(cardB.getType())) {
			labelResultExplanation1.setText(cardA.getType() + " [ " + cardA.getOperator() + " ]");
			labelResultExplanation2.setText("is equal to");
			labelResultExplanation3.setText(cardB.getType() + " [ " + cardB.getOperator() + " ]");
		}
	}
	
	public static void deleteAnswerAndExplanation() {
		labelAnswerResult.setText("");
		labelResultExplanation1.setText("");
		labelResultExplanation2.setText("");
		labelResultExplanation3.setText("");
	}
	
	public static void turnAnswerButtonsOn() {
		btnYes.setEnabled(true);
		btnEqual.setEnabled(true);
		btnNo.setEnabled(true);
	}
	
	public static void turnAnswerButtonsOff() {
		btnYes.setEnabled(false);
		btnEqual.setEnabled(false);
		btnNo.setEnabled(false);
	}
	
	public static void openOperatorInfoTableWindow() {
		int tempX = frame.getX();
		int tempY = frame.getY();
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int screenWidth = gd.getDisplayMode().getWidth();
		int screenHeight = gd.getDisplayMode().getHeight();
		
		//Top right corner ^^^>>>
		if (tempY < 50 & tempX > (screenWidth - 500)){
			oTableFrame.setLocation(tempX - 500, tempY);
		} 
		//Bottom right corner vvv>>>
		else if (tempY < 50 & tempX > (screenWidth - 600)){
			oTableFrame.setLocation(tempX - 500, tempY - 150);
		}
		//Top screen border ^^^
		else if (tempY < 50) { 
			oTableFrame.setLocation(tempX + 450, tempY);
		} 
		//Right screen border >>>
		else if (tempX > (screenWidth - 600)){
			oTableFrame.setLocation(tempX - 500, tempY - 50);
		} 
		//Bottom screen border vvv
		else if (tempX > (screenHeight - 300)){
			oTableFrame.setLocation(tempX + 450, tempY - 150);
		}  
		//set it right to game window
		else {
			oTableFrame.setLocation(tempX + 450, tempY - 50);
		}
		oTableFrame.setVisible(true);
	}
	
	//	Requested by my coach
	//	Decided to use non-static members as practice :^)
	public static void showWinStreak() {
		
		if(labelAnswerResult.getText().equals("Correct!")) {
			frame.winStreak++;
			frame.labelWinStreak.setText("Win streak: " + frame.winStreak);
		} else {
			frame.winStreak = 0;
			if (!frame.labelWinStreak.getText().isEmpty()) {
				frame.labelWinStreak.setText(":(");
			}
		}
	}
	
} //class end



