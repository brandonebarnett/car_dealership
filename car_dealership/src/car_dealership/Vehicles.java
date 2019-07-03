package car_dealership;

public class Vehicles {

	String make;
	String model;
	String color;
	double price;
	boolean testDrive;
	
	public void testDrive (Vehicles vehicle) {
		if (testDrive == true) {
			System.out.println("Customer would like to test drive the vehicle!");
		}
		else {
			System.out.println("Customer is not interested in a test drive today.");
		}
	}
	
}
