import java.util.Dictionary;
import java.util.Hashtable;

public class CharacterModel {

	private String name;
	private int healthPoints;
	private int maxHealthPoints = 100;
	private int baseDmg;
	private int baseArmour;
	private String race;
	private Dictionary<String, Integer> inventoryList = new Hashtable<>();

	public String get_name() {
		return name;
	}

	public void set_name(String nm) {
		name = nm;
	}

	public int get_healthPoints() {
		return healthPoints;
	}

	public void set_healthPoints(int hp) {
		if (hp >= 0 && hp <= maxHealthPoints) {
			healthPoints = hp;
		} else {
			System.out.println("Ungültiges Wert für healthPoints. healthPoints muss zwischen 0 und " + maxHealthPoints
					+ " sein.");
		}
	}

	public int get_baseDmg() {
		return baseDmg;
	}

	public void set_baseDmg(int bd) {
		if (bd > 0 && bd <= 10) {
			baseDmg = bd;
		} else {
			System.out.println("Ungültiges Wert für baseDmg. baseDmg muss zwischen 1 und 10 sein");
		}
	}

	public int get_baseArmour() {
		return baseArmour;
	}

	public void set_baseArmour(int ba) {
		if (ba > 0 && ba <= 10) {
			baseArmour = ba;
		} else {
			System.out.println("Ungültiges Wert für baseArmour. baseArmour muss zwischen 1 und 10 sein");
		}
	}

	public String get_race() {
		return race;
	}

	public void set_race(String rc) {
		race = rc;
	}

	public Dictionary<String, Integer> get_inventoryList() {
		return inventoryList;
	}

	public void add_item_inventoryList(String item, int quantity) {
		inventoryList.put(item, quantity);
	}

	public void remove_item_inventoryList(String item) {
		inventoryList.remove(item);
	}
}
