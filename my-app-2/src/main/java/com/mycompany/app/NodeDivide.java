package com.mycompany.app;
/**
 * Класс, реализующий деление
 *
 */
public class NodeDivide extends Node
{
	private Node left;
	private Node right;

	public NodeDivide(String left, String right) throws Exception
	{
		super("/");
		this.left = parse(left);
		this.right = parse(right);
	}	

@Override
	public int eval()
	{
		return left.eval() / right.eval();
	}
}