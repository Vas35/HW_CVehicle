package ua.univer.inheritanceHW;


public abstract class CVehicle {
	private int price;
	private int speed;
	private int year;

	public CVehicle(int price, int speed, int year) {
		this.price = price;
		this.speed = speed;
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public static void minPrice(CVehicle[] mass) {
		int min = mass[0].price;
		for (int i = 0; i < mass.length; i++) {
			if (min > mass[i].price) {
				min = mass[i].price;
			}
		}
		System.out.println("min = " + min + "USD");
	}

	public static void maxSpeed(CVehicle[] mass) {
		int max = mass[0].speed;
		for (int i = 0; i < mass.length; i++) {
			if (max < mass[i].speed) {
				max = mass[i].speed;
			}
		}
		System.out.println("max = " + max + "km/h");
	}

	public static void sortYear(CVehicle[] mass) {
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length - 1 - i; j++) {
				if (mass[j].year > mass[j + 1].year) {
					int temp = mass[j].year;
					mass[j].year = mass[j + 1].year;
					mass[j + 1].year = temp;
				}
			}
		}
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
	}

	@Override
	public String toString() {
		return "CVehicle [price=" + price + ", speed=" + speed + ", year=" + year + "]";
	}

}
