package gametest;

import java.util.Arrays;

public class Session {
	
	private static Character cha;
	private Map map;
	private Extras ext;
	private static Item[] items;
	private static Creature[] creats;
	//blank constructor
	public Session(){
		cha = null;
		map = null;
		ext = null;
		items = null;
		creats = null;
	}
	//verbose constructor
	public Session(Character c, Map m, Extras e, Item[] i){
		
		cha = c;
		map = m;
		ext = e;
		items = i;}
	
	//setter method to define character
	public static void setPlayer(Character play){
		cha = play;
	}
	//setter method to instantiate creature array
	public static void setCreatures(Creature[] kratt){
		creats = new Creature[kratt.length];
		creats = Arrays.copyOf(kratt, kratt.length);
	}
	
	//setter method to instantiate item array
	public static void setItems(Item[] loot){
		items = new Item[loot.length];
		items = Arrays.copyOf(loot, loot.length);
	}
	
	//main game loop
	public void gameLoop(){
		
		
	}
	}