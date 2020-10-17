package com.mycompany.app;
/**
 * Базовый класс узлов дерева выражения
 *
 */
public abstract class Node
{

	private String text;

	public Node(String text)
	{
		this.text = text;
	}

/**
 * Метод доступа к тексту узла для потомков
 *@return Текст в виде String
 */

	protected String getText()
	{
		return text;
	}

/**
 * Абстрактный метод вычисления взначения узла для перекрытия в потомках
 *@return Целочисленное значение узла
 */

	public abstract int eval();

/**
 * Метод парсинга парных операций
 *@param input Входная строка, символ операции 1, символ операции 2
 *@param op1  Cимвол операции 1 символ операции 2
 *@param op2 Символ операции 2
 *@return Позиция операции во входной строке
 */

	public static int parseOperation(String input, char op1, char op2)
	{
		int parentheses = 0;

		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if (c == '(') parentheses++;
			if (c == ')') parentheses--;
			if ((c == op1 || c == op2) && parentheses == 0) return i;
		}
		return -1;
	}

/**
 * Метод парсинга скобок
 *@param input Входная строка
 *@return Вложенная в скобки часть выражения
 */

	public static String parseParentheses(String input) throws Exception
	{
		int parentheses = 0;

		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if (c == '(') parentheses++;
			if (c == ')') parentheses--;
		}

		if (parentheses != 0 || input.charAt(0) != '(' || input.charAt(input.length() - 1) != ')') throw new Exception();

		return input.substring(1, input.length() - 1);
	}

/**
 * Метод парсинга выражения
 *@param inp Входная строка
 *@return Узел
 */

	public static Node parse(String inp) throws Exception
	{
		String input = "";

		for (int i = 0; i < inp.length(); i++)
		{
			if (inp.charAt(i) != ' ') input += inp.charAt(i);
		}

		int i = parseOperation(input, '+','-');
		if(i > 0)
		{
			String left = input.substring(0, i);
			String right = input.substring(i + 1, input.length());
			if (input.charAt(i) == '+') return new NodePlus(left, right);
			if (input.charAt(i) == '-') return new NodeMinus(left, right);
			return null;
		}

		i = parseOperation(input, '*','/');
		if(i > 0)
		{
			String left = input.substring(0, i);
			String right = input.substring(i + 1, input.length());
			if (input.charAt(i) == '*') return new NodeMultiply(left, right);
			if (input.charAt(i) == '/') return new NodeDivide(left, right);
			return null;
		}

		if (input.charAt(0) == '(') return new NodeParentheses(parseParentheses(input));
		if (Character.isDigit(input.charAt(0))) return new NodeNumber(input);
		return null;
	}
}