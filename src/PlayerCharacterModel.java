import java.util.Dictionary;
import java.util.Hashtable;

public class PlayerCharacterModel extends CharacterModel {
	private int level;
	private int manaPoints;
	private int staminaPoints;
	private int expPoints;
	private Dictionary<String, Integer> equipList = new Hashtable<>();

	public int get_level() {
		return level;
	}

	public void set_level(int lvl) {
		if (lvl > 0 && lvl <= 100) {
			level = lvl;
		} else {
			System.out.println("Ungültiges level. Level muss zwischen 1 und 100 liegen.");
		}
	}

	public int get_manaPoints() {
		return manaPoints;
	}

	public void set_manaPoints(int mp) {
		if (mp >= 0 && mp <= 50) {
			manaPoints = mp;
		} else {
			System.out.println("Ungültiges Wert für manaPoints. manaPoints muss zwischen 0 und 50 liegen.");
		}
	}

	public int get_staminaPoints() {
		return staminaPoints;
	}

	public void set_staminaPoints(int sp) {
		if (sp >= 0 && sp <= 50) {
			staminaPoints = sp;
		} else {
			System.out.println("Ungültiges Wert für staminaPoints. staminaPoints muss zwischen 0 und 50 liegen.");
		}
	}

	public int get_expPoints() {
		return expPoints;
	}

	public void set_expPoints(int ep) {
		expPoints = ep;
		calculate_experience(expPoints);
	}

	public Dictionary<String, Integer> get_equipList() {
		return equipList;
	}

	public void add_item_equipList(String item, int quantity) {
		equipList.put(item, quantity);
	}

	public void remove_item_equipList(String item) {
		equipList.remove(item);
	}

	private void calculate_experience(int ep) {
		// calculate exp here
	}
}
