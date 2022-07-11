package operatorPrecedenceGame;

import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;



public class OperatorTable extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private JPanel operatorInfoTable;
	//private static Rock_Paper_Scissors_but_Operators_Game game;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					OperatorTable frame = new OperatorTable();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public OperatorTable() {
		setResizable(false);
		setTitle("Table of Operators");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 329);
		operatorInfoTable = new JPanel();
		operatorInfoTable.setBorder(null);
		setContentPane(operatorInfoTable);
		operatorInfoTable.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precedence Hierarchy of common operators (from highest to lowest).");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 13, 444, 14);
		operatorInfoTable.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Types of Operators");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 49, 200, 14);
		operatorInfoTable.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Symbols");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(220, 49, 100, 14);
		operatorInfoTable.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Example Uses");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(330, 49, 124, 14);
		operatorInfoTable.add(lblNewLabel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Unary Operators");
		lblNewLabel_1.setBounds(10, 74, 200, 14);
		operatorInfoTable.add(lblNewLabel_1);
		
		JLabel lblNewLabel_11 = new JLabel("-n, !, ++, --");
		lblNewLabel_11.setBounds(220, 74, 100, 14);
		operatorInfoTable.add(lblNewLabel_11);
		
		JLabel lblNewLabel_20 = new JLabel("(-7) * 4,     !myBoolean");
		lblNewLabel_20.setBounds(330, 74, 124, 14);
		operatorInfoTable.add(lblNewLabel_20);
		
		JLabel lblNewLabel_2 = new JLabel("Multiplication, Division, Modulus");
		lblNewLabel_2.setBounds(10, 99, 200, 14);
		operatorInfoTable.add(lblNewLabel_2);
		
		JLabel lblNewLabel_13 = new JLabel("*, /, %");
		lblNewLabel_13.setBounds(220, 99, 100, 14);
		operatorInfoTable.add(lblNewLabel_13);
		
		JLabel lblNewLabel_21 = new JLabel("7 % 4");
		lblNewLabel_21.setBounds(330, 99, 124, 14);
		operatorInfoTable.add(lblNewLabel_21);
		
		JLabel lblNewLabel_3 = new JLabel("Addition, Subtraction");
		lblNewLabel_3.setBounds(10, 124, 200, 14);
		operatorInfoTable.add(lblNewLabel_3);
		
		JLabel lblNewLabel_14 = new JLabel("+, -");
		lblNewLabel_14.setBounds(220, 124, 100, 14);
		operatorInfoTable.add(lblNewLabel_14);
		
		JLabel lblNewLabel_22 = new JLabel("7 + 4");
		lblNewLabel_22.setBounds(330, 124, 124, 14);
		operatorInfoTable.add(lblNewLabel_22);
		
		JLabel lblNewLabel_7 = new JLabel("Relational Operators");
		lblNewLabel_7.setBounds(10, 149, 200, 14);
		operatorInfoTable.add(lblNewLabel_7);
		
		JLabel lblNewLabel_15 = new JLabel("<, >, <=, >=");
		lblNewLabel_15.setBounds(220, 149, 100, 14);
		operatorInfoTable.add(lblNewLabel_15);
		
		JLabel lblNewLabel_23 = new JLabel("y > x");
		lblNewLabel_23.setBounds(330, 149, 124, 14);
		operatorInfoTable.add(lblNewLabel_23);
		
		JLabel lblNewLabel_8 = new JLabel("Equality Operators");
		lblNewLabel_8.setBounds(10, 174, 200, 14);
		operatorInfoTable.add(lblNewLabel_8);
		
		JLabel lblNewLabel_16 = new JLabel("==, !=");
		lblNewLabel_16.setBounds(220, 174, 100, 14);
		operatorInfoTable.add(lblNewLabel_16);
		
		JLabel lblNewLabel_24 = new JLabel("y != x");
		lblNewLabel_24.setBounds(330, 174, 124, 14);
		operatorInfoTable.add(lblNewLabel_24);
		
		JLabel lblNewLabel_9 = new JLabel("Logical Operators (& beats |)");
		lblNewLabel_9.setBounds(10, 199, 200, 14);
		operatorInfoTable.add(lblNewLabel_9);
		
		JLabel lblNewLabel_17 = new JLabel("&, |");
		lblNewLabel_17.setBounds(220, 199, 100, 14);
		operatorInfoTable.add(lblNewLabel_17);
		
		JLabel lblNewLabel_25 = new JLabel("myBool & yourBool");
		lblNewLabel_25.setBounds(330, 199, 124, 14);
		operatorInfoTable.add(lblNewLabel_25);
		
		JLabel lblNewLabel_10 = new JLabel("Short-Circuit (&& beats ||)");
		lblNewLabel_10.setBounds(10, 224, 200, 14);
		operatorInfoTable.add(lblNewLabel_10);
		
		JLabel lblNewLabel_18 = new JLabel("&&, ||");
		lblNewLabel_18.setBounds(220, 224, 100, 14);
		operatorInfoTable.add(lblNewLabel_18);
		
		JLabel lblNewLabel_30 = new JLabel("myBool || yourBool");
		lblNewLabel_30.setBounds(330, 224, 124, 14);
		operatorInfoTable.add(lblNewLabel_30);
		
		JLabel lblNewLabel_12 = new JLabel("Assignment Operators");
		lblNewLabel_12.setBounds(10, 247, 200, 14);
		operatorInfoTable.add(lblNewLabel_12);
		
		JLabel lblNewLabel_19 = new JLabel("=, +=, -=");
		lblNewLabel_19.setBounds(220, 247, 100, 14);
		operatorInfoTable.add(lblNewLabel_19);
		
		JLabel lblNewLabel_27 = new JLabel("x += 5");
		lblNewLabel_27.setBounds(330, 247, 124, 14);
		operatorInfoTable.add(lblNewLabel_27);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 69, 444, 2);
		operatorInfoTable.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 93, 444, 2);
		operatorInfoTable.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 118, 444, 2);
		operatorInfoTable.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 142, 444, 2);
		operatorInfoTable.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 169, 444, 2);
		operatorInfoTable.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(10, 192, 444, 2);
		operatorInfoTable.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(10, 219, 444, 2);
		operatorInfoTable.add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(10, 242, 444, 2);
		operatorInfoTable.add(separator_7);
	}
}
