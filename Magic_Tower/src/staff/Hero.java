package staff;

public class Hero extends Staff {
	private int yellow_key = 1;
	private int blue_key = 1;
	private int red_key = 1;

	private int layer;
	private int level;

	
	public int getYellow_key() {
		return yellow_key;
	}

	public void setYellow_key(int yellow_key) {
		this.yellow_key = yellow_key;
	}

	public int getBlue_key() {
		return blue_key;
	}

	public void setBlue_key(int blue_key) {
		this.blue_key = blue_key;
	}

	public int getRed_key() {
		return red_key;
	}

	public void setRed_key(int red_key) {
		this.red_key = red_key;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Hero(int life, int attack, int defence, int money, int experience, int yellow_key, int blue_key, int red_key,
			int layer, int level) {
		super(life, attack, defence, money, experience);
		this.yellow_key = yellow_key;
		this.blue_key = blue_key;
		this.red_key = red_key;
		this.layer = layer;
		this.level = level;
	}
}
