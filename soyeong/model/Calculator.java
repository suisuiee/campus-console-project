package model;

public class Calculator {

	private int op1, op2; // operand1, operand2
	private String op; // operator
	
	public Calculator(int op1, String op, int op2) {
		this.op1 = op1;
		this.op = op;
		this.op2 = op2;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
}