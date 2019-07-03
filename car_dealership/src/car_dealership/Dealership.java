package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		/* Write a program to simulate a care dealership sales process.
		 * We will have: 
		 * 		- employees
		 * 		- vehicles to sell
		 * 		- customers
		 * 
		 * 
		 */
		Employee emp1 = new Employee();
		emp1.employeeName = "Frank";
		emp1.employeeID = 1234567890;
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St.");
		cust1.setCashOnHand(12000);
		
		
		Vehicles sportsCar = new Vehicles();
		sportsCar.make = "Ferrari";
		sportsCar.make = "F-50";
		sportsCar.color = "Red";
		sportsCar.price = 90000;
		
		cust1.purchaseCar(sportsCar, emp1, true);
		
//		emp1.sellCar(sportsCar, cust1, emp1);
		
		/*
		 *  handelCustomer (Customer cust1, boolean finance, Vehicles vehicle)
		 *  if (finance == true)
		 *  	runCreditHistory (Customer cust1, double doubleAmount)
		 *  else if (vehicle.getPrice() <= cust1.getCashOnHand())
		 *  	processTransaction ( Customer cust1, Vehicle vehicle)
		 *  else
		 *  	tell customer to bring more money
		 * 
		 * 
		 */
	}

}
