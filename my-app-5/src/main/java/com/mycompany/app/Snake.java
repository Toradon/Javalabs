package com.mycompany.app;
/**
* Класс, описывающий змею. Наследник от класса Creature.
*/
public class Snake extends Creature{
	@AutoInjectable
	public IMove move;
	@AutoInjectable
	public IVoice voice;
	
	@Override
	public String  Live(){
		
		return move.Move() + " " + voice.Voice();
	
	}
	
}