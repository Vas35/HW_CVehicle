package ua.univer.inheritanceHW;

public class CShip extends CVehicle {
	private int capacity;
	private String homeport;

	public CShip(int price, int speed, int year, int capacity, String homeport) {
		super(price, speed, year);

	}

	@Override
	public String toString() {
		return "Cship [price=" + super.getPrice() + ", speed=" + super.getSpeed() + ", year=" + super.getYear()
				+ ", capacity=" + capacity + ", homeport=" + homeport + "]";
	}

}
