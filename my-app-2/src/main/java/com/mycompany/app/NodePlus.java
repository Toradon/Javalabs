package com.mycompany.app;
/**
 * Класс, реализующий сложение
 *
 */
public class NodePlus extends Node
{
	private Node left;
	private Node right;

	public NodePlus(String left, String right) throws Exception
	{
		super("+");
		this.left = parse(left);
		this.right = parse(right);
	}	

@Override
	public int eval()
	{
		return left.eval() + right.eval();
	}
}