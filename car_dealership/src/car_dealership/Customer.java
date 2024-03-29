package car_dealership;
// Everything up to the last comment was created solely by me.
public class Customer extends Employee {
	
	private String name;
	private String address;
	private double cashOnHand;
	boolean finance;
	
	public void purchaseCar(Vehicles vehicle, Employee emp, boolean finance) {
		if (cashOnHand == vehicle.price) {
			System.out.println("You have purchased the vehicle for " + vehicle.price + ".");
		}
		else if (finance == true) {
			Employee.financeCar(vehicle, getCashOnHand());
		}
		else {
			System.out.println("I will not be purchasing a vehicle today.");
		}
	}
	// Below was created using instructions given to me by the course. Not too sure how or if I used them.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
}
