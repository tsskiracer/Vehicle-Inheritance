
public abstract class Vehicle
	{
		protected String numWheels;
		protected String brand;
		protected String vehicleType;
		protected String numSeats;
		protected String name;
		protected String price;
		abstract String printStatement();
			{
				System.out.println("The "+ brand + name + " is a " + vehicleType + " that has " + numWheels + " wheels and " + numSeats + " seats.");
			}
				
	}
