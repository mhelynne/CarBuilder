package builder.i524;

import builder.CarBuilder;

public class FuscaBuilder  extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Fusca");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Volkswagen");
	}

	@Override
	public void buildType() {
		car.setType("Convertible");		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Ethanol");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");		
	}

	@Override
	public void buildColor() {
		car.setColor("Metalic Pink");	
	}

	@Override
	public void buildYear() {
		car.setYear(1942);
	}

	@Override
	public void buildDoors() {
		car.setDoors(5);
	}

	@Override
	public void buildSeats() {
		car.setSeats(5);
	}

	@Override
	public void buildPrice() {
		car.setPrice(60000.00);
	}

	@Override
	public void buildAirConditioning() {
		car.setAirConditioning(true);
	}

	@Override
	public void buildAirbag() {
		car.setAirbag(true);
	}

	@Override
	public void buildAbsBrake() {
		car.setAbsBrake(true);		
	}

	@Override
	public void buildOwners() {
		car.setOwners("524 class");		
	}

}