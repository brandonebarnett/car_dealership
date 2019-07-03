package car_dealership;
// This entire class was created solely by myself.
public class Employee extends Vehicles {

	int employeeID;
	String employeeName;
	
	public void sellCar (Vehicles vehicle, Customer customer, Vehicles price) {
		if (customer.getCashOnHand() == vehicle.price) {
			System.out.println("Congratulations! You have purchased the car!");
		}
		else if (customer.finance == true) {
			System.out.println("Congratulations! You have acquired more debt!");
		}
		else {
			System.out.println("I'm sorry, you have not purchased a vehicle today.");
		}
	}
	
	public static double financeCar (Vehicles sportsCar, double cashOnHand) {
		double financed = sportsCar.price - cashOnHand;
		System.out.println("You have financed the vehicle for " + financed + ".");
		return financed;
	}
	
}
