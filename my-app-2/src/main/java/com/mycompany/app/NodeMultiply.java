package com.mycompany.app;
/**
 * Класс, реализующий умножение
 */
public class NodeMultiply extends Node
{
	private Node left;
	private Node right;

	public NodeMultiply(String left, String right) throws Exception
	{
		super("*");
		this.left = parse(left);
		this.right = parse(right);
	}	

@Override
	public int eval()
	{
		return left.eval() * right.eval();
	}
}