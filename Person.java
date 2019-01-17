import com.ZArmy.behavior.*;

public abstract class Person {
	protected FightingSpirit fightingSpirit = new Pacifist();
	protected Movement movement = new Walk();
	protected MedicalCare medicalCare = new NoMedicalCare();

	public Person() {

	}

	public Person(FightingSpirit fightingSpirit, Movement movement, MedicalCare medicalCare) {
		this.fightingSpirit = fightingSpirit;
		this.movement = movement;
		this.medicalCare = medicalCare;
	}

	public void moving() {
		movement.move();
	}

	public void fighting() {
		fightingSpirit.fight();
	}

	public void treating() {
		medicalCare.treat();
	}

	protected void setFightingSpirit(FightingSpirit fightingSpirit) {
		this.fightingSpirit = fightingSpirit;
	}

	protected void setMovement(Movement movement) {
		this.movement = movement;
	}

	protected void setMedicalCare(MedicalCare medicalCare) {
		this.medicalCare = medicalCare;
	}

	public static void main(String[] args) {
		Person[] tPers = { new Warrior(), new Civil(), new Doctor(), new Surgeon(), new Sniper() };
		for (Person p : tPers) {
			System.out.println("\nInstance " + p.getClass().getName());
			System.out.println("*******************");
			p.fighting();
			p.moving();
			p.treating();

		}
	}
}
