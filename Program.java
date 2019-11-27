package ua.univer.inheritanceHW;

public class Program {

	public static void main(String[] args) {
		
		
		
	
		Object o = new Object();
		
		CVehicle pl1 = new CPlane(10000, 1000, 2010, 9865, 50);
		CVehicle cr2 = new CCar(1000, 100, 2000);
		CVehicle sh3 = new CShip(100000, 50, 1990, 2000, "Miami");

		CVehicle[] machinery = new CVehicle[3];
		machinery[0] = pl1;
		machinery[1] = cr2;
		machinery[2] = sh3;

		CVehicle.minPrice(machinery);
		CVehicle.maxSpeed(machinery);
		CVehicle.sortYear(machinery);
		
		System.out.println(o);

	}

}
