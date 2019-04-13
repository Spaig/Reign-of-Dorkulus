package gametest;

import java.util.Arrays;

//class for a character
public class Character {

	String name = "Peter Heropants";
	int heroclass = -1; // 0 = SWORDHAVER 1 = SCIENCEMAGE 2 = SNEAKTHIEF 3 =
						// SALARYMAN
	// inventory references locations in the master inventory array
	int[] inventory = new int[10];
	// player stat array
	int[] stats = new int[7]; // 0 = STR 1 = INT 2 = DEX 3 = HP 4 = LVL 5 = EXP
								// 6 = GOLD

	// constructor for new character
	public Character(String hname, int classnum) {
		name = hname;
		heroclass = classnum;

	}

	// constructor for loading from saved data
	public Character(String hname, int classnum, int[] loot, int[] tistics) {
		name = hname;
		heroclass = classnum;
		stats = initStats(classnum, stats);
		// copy inventory array to local variables
		inventory = new int[loot.length];
		inventory = Arrays.copyOf(loot, loot.length);
		// copy stats array to local variable
		stats = new int[tistics.length];
		stats = Arrays.copyOf(tistics, tistics.length);

	}

	// initialize stats based on class
	private int[] initStats(int classnum, int[] stats) {
		switch (classnum) {
		// swordhaver stats
		case 0:
			stats[0] = 20;
			stats[1] = 5;
			stats[2] = 5;
			stats[3] = 20;
			stats[4] = 1;
			stats[5] = 0;
			stats[6] = 50;
			// sciencemage stats
		case 1:
			stats[0] = 5;
			stats[1] = 20;
			stats[2] = 5;
			stats[3] = 5;
			stats[4] = 1;
			stats[5] = 0;
			stats[6] = 30;
			// sneakthief stats
		case 2:
			stats[0] = 5;
			stats[1] = 5;
			stats[2] = 20;
			stats[3] = 7;
			stats[4] = 1;
			stats[5] = 0;
			stats[6] = 70;
			// salaryman stats
		case 3:
			stats[0] = 5;
			stats[1] = 5;
			stats[2] = 5;
			stats[3] = 5;
			stats[4] = 1;
			stats[5] = 0;
			stats[6] = 200;

		}
		return null;
	}

	// change strength value
	public int modStr(int mod) {
		stats[0] = stats[0] + mod;
		return stats[0];
	}

	// change intelligence value
	public int modItl(int mod) {
		stats[1] = stats[1] + mod;
		return stats[1];
	}

	// change dexterity value
	public int modDex(int mod) {
		stats[2] = stats[2] + mod;
		return stats[2];
	}

	// change base HP
	public int modHP(int mod) {
		stats[3] = stats[3] + mod;
		return stats[3];
	}

	// method for granting experience
	public int modExp(int mod) {
		stats[5] = stats[5] + mod;
		return stats[5];
	}

	// method to level up
	public int ding(int exp, int lvl) {
		exp = stats[5];
		lvl = stats[4];
		int next = (500 * (lvl ^ 2)) - (500 * lvl);

		if (exp >= next) {
			lvl = lvl++;
			stats[4] = lvl;
		}

		return stats[4];
	}

	// method to change name
	public String modName(String newname) {
		name = newname;
		return name;
	}

}