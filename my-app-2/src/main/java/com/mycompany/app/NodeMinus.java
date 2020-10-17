package com.mycompany.app;
/**
 * Класс, реализующий минус
 *
 */
public class NodeMinus extends Node
{
	private Node left;
	private Node right;

	public NodeMinus(String left, String right) throws Exception
	{
		super("-");
		this.left = parse(left);
		this.right = parse(right);
	}	

@Override
	public int eval()
	{
		return left.eval() - right.eval();
	}
}