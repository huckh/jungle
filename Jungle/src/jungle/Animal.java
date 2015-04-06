package jungle;

public abstract class Animal {

	int energy = 0;

	public int speak() {
		energy -= 3;
		return energy;
	}

	public int sleep() {
		System.out.println("zzzzz");
		energy += 10;
		return energy;
	}

	public int eat(Food food) {
		System.out.println("nom nom nom good " + food.name());
		energy += 5;
		return energy;
	}

}
