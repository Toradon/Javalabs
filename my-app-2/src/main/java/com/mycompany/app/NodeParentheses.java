package com.mycompany.app;
/**
 * Класс, реализующий скобки
 *
 */
public class NodeParentheses extends Node
{
	private Node nested;
	public NodeParentheses(String text) throws Exception
	{
		super("");
		nested = parse(text);
	}	

@Override
	public int eval()
	{
		return nested.eval();
	}
}