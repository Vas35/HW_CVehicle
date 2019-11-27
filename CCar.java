package ua.univer.inheritanceHW;

public class CCar extends CVehicle {

	public CCar(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public String toString() {
		return "Ccar [price=" + getPrice() + ", speed=" + getSpeed() + ", year=" + getYear() + "]";
	}

}
