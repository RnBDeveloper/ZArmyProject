import com.ZArmy.behavior.*;

public class Surgeon extends Person {
	public Surgeon() {
		this.medicalCare = new Surgery();
	}

	public Surgeon(FightingSpirit spirit, Movement mov, MedicalCare medicalCare) {
		super(spirit, mov, medicalCare);
	}
}
