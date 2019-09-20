package builder;

public class CarProduct {
    
	String model;
	String automaker;	
	String type; // Compact, Hatch, Sedan, SUV, Pickup, Convertible
	String fuelSource; // Gasoline, Diesel, Ethanol or Compressed natural gas
	String transmission; // Manual or Automatic
	String color;
	
	int year;	
    int doors;
	int seats;    
	double price;
	
	boolean airConditioning;
	boolean airbag;
	boolean absBrake;	
	
	String owners; // Your names, e.g.: Maria and Helynne

	
	// Getters and setters
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAutomaker() {
		return automaker;
	}

	public void setAutomaker(String automaker) {
		this.automaker = automaker;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFuelSource() {
		return fuelSource;
	}

	public void setFuelSource(String fuelSource) {
		this.fuelSource = fuelSource;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean hasAirConditioning() {
		return airConditioning;
	}

	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}

	public boolean hasAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

	public boolean hasAbsBrake() {
		return absBrake;
	}

	public void setAbsBrake(boolean absBrake) {
		this.absBrake = absBrake;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}	
	
}