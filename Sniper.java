import com.ZArmy.behavior.*;

public class Sniper extends Person {
	public Sniper() {
		this.fightingSpirit = new GunFight();
		this.movement = new Run();
	}

	public Sniper(FightingSpirit spirit, Movement mov, MedicalCare medicalCare) {
		super(spirit, mov, medicalCare);
	}

}
