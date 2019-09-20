package builder.i514;

import builder.CarBuilder;

public class CeltaBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		car.setModel("Celta 1.0");
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Chevrolet");
	}

	@Override
	public void buildType() {
		car.setType("Compact");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Compressed Natural Gas");
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
	}

	@Override
	public void buildColor() {
		car.setColor("Dark Black");
	}

	@Override
	public void buildYear() {
		car.setYear(2011);
	}

	@Override
	public void buildDoors() {
		car.setDoors(3);
	}

	@Override
	public void buildSeats() {
		car.setSeats(6);
	}

	@Override
	public void buildPrice() {
		car.setPrice(10000.00);
	}

	@Override
	public void buildAirConditioning() {
		car.setAirConditioning(true);
	}

	@Override
	public void buildAirbag() {
		car.setAirbag(false);
	}

	@Override
	public void buildAbsBrake() {
		car.setAbsBrake(false);
	}

	@Override
	public void buildOwners() {
		car.setOwners("514 class");
	}

}