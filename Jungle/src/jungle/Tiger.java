package jungle;

public class Tiger extends Animal {

	public int speak() {
		System.out.println("Rawr");
		return super.speak();
	}

	public int sleep() {
		System.out.println("zzzzz");
		energy += 5;
		return energy;
	}

	// public int eat(Food food) {
	// switch (food) {
	// case GRAIN:
	// // Grain makes my tummy hurt
	// System.out.println("Grain makes my tummy hurt");
	// break;
	// default:
	// System.out.println("nom nom nom good " + food.name());
	// energy += 5;
	// break;
	// }
	// return energy;
	// }

	public int eat(Food food) {
		if (food.name().equalsIgnoreCase("GRAIN")) {
			System.out.println("Grain makes my tummy hurt");
		} else {
			System.out.println("nom nom nom good " + food.name());
			energy += 5;
		}
		return energy;
	}

}