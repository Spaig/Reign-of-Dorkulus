package gametest;

public class Session {
	
	Character cha = null;
	Map map = null;
	Extras ext = null;
	
	public Session(){
	}
	
	public Session(Character c, Map m, Extras e){
		
		cha = c;
		map = m;
		ext = e;}
	
	public void loadChar(Character c){
		cha = c;}
	}