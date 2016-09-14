package com.pattern.behaviortype.Interpreter;

public class NumExpression extends ArithemticExpression{

	private int num;
	
	public NumExpression(int num){
		this.num = num;
	}
	
	@Override
	public int interpreter() {
		return num;
	}
}
