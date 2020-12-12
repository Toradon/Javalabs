package com.mycompany.app;
/**
* Класс, описывающий собаку. Наследник от класса Creature.
*/
public class Dog extends Creature{
	@AutoInjectable
	public IMove move;
	@AutoInjectable
	public IVoice voice;
	
	@Override
	public String Live(){
		
		return move.Move() + " " + voice.Voice();
	
	}
	
}