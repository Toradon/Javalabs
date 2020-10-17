package com.mycompany.app;

/**
 * Класс для хранения величин типа int
 *
 */
public class Container
{
	private int[] array = null;

	/** Изменяет размер контейнера
	 * @param newSize Новый размер контейнера     
	*/

	public void resize(int newSize)
	{
		if (newSize == 0) array = null;

		int[] newArray = new int[newSize];

		int minSize = newSize;
		if (minSize > getSize()) minSize = getSize();

		for (int i = 0; i < minSize; i++)
		{
			newArray[i] = array[i];
		}
		array = newArray;
	}

	/** Возвращает количество элементов в контейнере
	 * @return Целочисленное значение количества элементов.     
	*/

	public int getSize()
	{
		if (array == null) return 0;
		else return array.length;
	}

	/** Устанавливает значение элемента
	 * @param index Индекс элемента 
	 * @param value Значение элемента     
	*/

	public void set(int index, int value) throws ContainerException
	{
		if (index >= getSize() || index < 0 || array == null)
			throw new ContainerException();
		array[index] = value;
	}

	/** Возвращает значение элемента
	 * @param index Индекс элемента 
	 * @return Целочисленное значение элемента.  
	*/

	public int get(int index) throws ContainerException
	{
		if (index >= getSize() || index < 0 || array == null)
			throw new ContainerException();
		return array[index];
	}

	/** Добавляет элемент в конец контейнера
	 * @param value Значение элемента     
	*/

	public void add(int value) throws ContainerException
	{
		resize(getSize() + 1);
		set(getSize()-1, value);
	}

	/** Убирает элемент с заданным индексом из контейнера
	 * @param index Индекс элемента     
	*/

	public void remove(int index) throws ContainerException
	{
		if (index >= getSize() || index < 0 || array == null)
			throw new ContainerException();

		for (int i = index; i < getSize() - 1; i++)
		{
			set(i, get(i+1));
		}
		resize(getSize()-1);
	}
}
