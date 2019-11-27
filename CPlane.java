package ua.univer.inheritanceHW;

public class CPlane extends CVehicle {
	private int height;
	private int capacity;

	public CPlane(int price, int speed, int year, int height, int capacity) {
		super(price, speed, year);

	}

	@Override
	public String toString() {
		return "Cplane [price=" + getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() + ", height=" + height
				+ ", capacity=" + capacity + "]";
	}

}
