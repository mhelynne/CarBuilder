package builder.i524;

import builder.CarBuilder;

public class TeslaXBuilder extends CarBuilder{

	@Override
	public void buildModel() {
		car.setModel("TeslaX");
	}
		

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Teslamotors");	
		
	}

	@Override
	public void buildType() {
		car.setType("Sport");
		
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Electric");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
		
	}

	@Override
	public void buildColor() {
		car.setColor("Black");
		
	}

	@Override
	public void buildYear() {
		car.setYear(2012);
		
	}

	@Override
	public void buildDoors() {
		car.setDoors(3);
		
	}

	@Override
	public void buildSeats() {
		car.setSeats(7);
		
	}

	@Override
	public void buildPrice() {
		car.setPrice(980.000);
		
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
		car.setOwners("João Victor and Mikaelly Vieira");		
	}

}
