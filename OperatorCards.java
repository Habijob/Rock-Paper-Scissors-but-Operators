package operatorPrecedenceGame;

import java.util.concurrent.ThreadLocalRandom;

public class OperatorCards {
	private String operator = "";
	private String type = "";
	private final int value;
	static OperatorCards[] cardDeck = new OperatorCards[22];
	
	OperatorCards (String operator, String type, int value){
		this.operator = operator;
		this.type = type;
		this.value = value;
	}
	
	public String getOperator() {
		return operator;
	}
	
	public String getType() {
		return type;
	}
	
	public int getValue() {
		return value;
	}
	
	public static void createCards() {
		
		//Unary operators
		cardDeck[0] = new OperatorCards("-n","Unary Operator", 10);
		cardDeck[1] = new OperatorCards("!","Unary Operator", 10);
		cardDeck[2] = new OperatorCards("++","Unary Operator", 10);
		cardDeck[3] = new OperatorCards("--","Unary Operator", 10);
		
		//Multiplication, division, modulus
		cardDeck[4] = new OperatorCards("*","Multiplication Operator", 9);
		cardDeck[5] = new OperatorCards("/","Division Operator", 9);
		cardDeck[6] = new OperatorCards("%","Modulus Operator", 9);
		
		//Addition, subtraction
		cardDeck[7] = new OperatorCards("+","Addition Operator", 8);
		cardDeck[8] = new OperatorCards("-","Subtraction Operator", 8);
		
		//Relational operators
		cardDeck[9] = new OperatorCards("<","Relational Operator", 7);
		cardDeck[10] = new OperatorCards(">","Relational Operator", 7);
		cardDeck[11] = new OperatorCards("<=","Relational Operator", 7);
		cardDeck[12] = new OperatorCards(">=","Relational Operator", 7);
		
		//Equality operators
		cardDeck[13] = new OperatorCards("==","Equality Operator", 6);
		cardDeck[14] = new OperatorCards("!=","Equality Operator", 6);
		
		//Logical operators
		cardDeck[15] = new OperatorCards("&","Logical Operator", 5);
		cardDeck[16] = new OperatorCards("|","Logical Operator", 4);
		
		//Short-circuit
		cardDeck[17] = new OperatorCards("&&","Short-Circuit Operator", 3);
		cardDeck[18] = new OperatorCards("||","Short-Circuit Operator", 2);
		
		//Assignment operators
		cardDeck[19] = new OperatorCards("=","Assignment Operator", 1);
		cardDeck[20] = new OperatorCards("+=","Assignment Operator", 1);
		cardDeck[21] = new OperatorCards("-=","Assignment Operator", 1);
	}
	
	public static OperatorCards getRandomCard() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 21 + 1);
		return cardDeck[randomNum];
	}

}
