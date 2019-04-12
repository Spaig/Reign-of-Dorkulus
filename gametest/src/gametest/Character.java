package gametest;

public class Character {
	
	String name =  "Peter Heropants";
	int heroclass = -1; // 0 = SWORDHAVER 1 = SCIENCEMAGE 2 = SNEAKTHIEF 3 = SALARYMAN
	Inventory inv;
	int [] stats = new int [5]; // 0 = STR 1 = INT 2 = DEX 3 = HP 4 = LVL 5 = EXP
	

	public Character(String hname, int classnum) {
		name = hname;
		heroclass = classnum;
		stats = initStats(classnum, stats);
		
	}

	private int[] initStats(int classnum, int[]stats) {
		switch(classnum){
		case 0:
			stats[0] = 20;
			stats[1] = 5;
			stats[2] = 5;
			stats[3] = 20;
			stats[4] = 1;
			stats[5] = 0;
		case 1:
			stats[0] = 5;
			stats[1] = 20;
			stats[2] = 5;
			stats[3] = 5;
			stats[4] = 1;
			stats[5] = 0;
		case 2:
			stats[0] = 5;
			stats[1] = 5;
			stats[2] = 20;
			stats[3] = 7;
			stats[4] = 1;
			stats[5] = 0;
		case 3:
			stats[0] = 5;
			stats[1] = 5;
			stats[2] = 5;
			stats[3] = 5;
			stats[4] = 1;
			stats[5] = 0;
		
		}
		return null;
	}

	public int modStr(int mod){
		stats[0] = stats[0] + mod;
		return stats[0];
	}

	public int modItl(int mod){
		stats[1] = stats[1] + mod;
		return stats[1];
	}

	public int modDex(int mod){
		stats[2] = stats[2] + mod;
		return stats[2];
	}
	
	public int modHP(int mod){
		stats[3] = stats[3] + mod;
		return stats[3];
	}
	
	public int modExp(int mod){
		stats[5] = stats[5] + mod;
		return stats[5];
	}
	
	public int ding(int exp, int lvl){
		exp = stats[5];
		lvl = stats[4];
		int next = (500 * (lvl ^ 2)) - (500*lvl);
		
		if (exp >= next) { 
			lvl = lvl++;
			stats[4] = lvl;}
		
		return stats[4];}
	
	public String modName(String newname){
		name = newname;
		return name;
	}

}