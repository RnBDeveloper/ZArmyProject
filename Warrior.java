import com.ZArmy.behavior.*;

public class Warrior extends Person {
	public Warrior() {
		this.fightingSpirit = new GunFight();
	}

	public Warrior(FightingSpirit spirit, Movement mov, MedicalCare medicalCare) {
		super(spirit, mov, medicalCare);
	}
}
