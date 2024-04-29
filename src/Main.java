public class Main {
	public static void main(String[] args) throws Exception {
		PlayerCharacterModel player = create_player_character();
		System.out.println(player.get_name());
		System.out.println(player.get_equipList());

	}

	private static PlayerCharacterModel create_player_character() {
		PlayerCharacterModel pcm = new PlayerCharacterModel();
		pcm.set_name("Harald der Heftige");
		pcm.set_race("Human");
		pcm.set_healthPoints(20);
		pcm.set_manaPoints(10);
		pcm.set_staminaPoints(20);
		pcm.set_baseDmg(3);
		pcm.set_baseArmour(1);
		pcm.set_level(1);
		pcm.set_expPoints(0);

		pcm.add_item_equipList("Heftiges Schwert", 1);
		pcm.add_item_inventoryList("Fackel", 1);
		return pcm;
	}
}