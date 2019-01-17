import com.ZArmy.behavior.*;

public class Doctor extends Person {
	public Doctor() {
		this.medicalCare = new FirstAid();
	}

	public Doctor(FightingSpirit spirit, Movement mov, MedicalCare medicalCare) {
		super(spirit, mov, medicalCare);
	}
}
