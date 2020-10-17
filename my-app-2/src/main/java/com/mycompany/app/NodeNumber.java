package com.mycompany.app;
/**
 * Класс, реализующий число
 *
 */
public class NodeNumber extends Node
{
	public NodeNumber(String text)
	{
		super(text);
	}	

@Override
	public int eval()
	{
		return Integer.parseInt(getText());
	}
}