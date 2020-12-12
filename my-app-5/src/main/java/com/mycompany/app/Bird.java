package com.mycompany.app;
/**
* Класс, описывающий птицу. Наследник от класса Creature.
*/
public class Bird extends Creature{
	@AutoInjectable
	public IMove move;
	@AutoInjectable
	public IVoice voice;
	
	@Override
	public String Live(){
		
		return move.Move() + " " + voice.Voice();
	
	}
	
}