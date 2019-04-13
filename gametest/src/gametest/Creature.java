package gametest;
//class for a character
public class Creature {
	//creature syntax - "<creature> <verbs> with its <operator>!"
	//i.e. DIRE OGRE SMASHES with its CLUB!
	//name of creature
	String name;
	String operator;
	String verb;
	int power;
	

	public Creature(String nom, String ops, String vorb, int x) {
		name = nom;
		operator = ops;
		verb = vorb;
		power = x;	
	}


}