package builder.i524;

import builder.CarBuilder;

public class FerrariBuilder extends CarBuilder {
	
	@Override
	public void buildModel() {
		car.setModel("Ferrari F8 Tributo");
		
	}

	@Override
	public void buildAutomaker() {
		car.setAutomaker("Ferrari");
		
	}

	@Override
	public void buildType() {
		car.setType("Sportive");
	}

	@Override
	public void buildFuelSource() {
		car.setFuelSource("Gasoline");
		
	}

	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
		
	}

	@Override
	public void buildColor() {
		car.setColor("Red");
		
	}

	@Override
	public void buildYear() {
		car.setYear(2020);
		
	}

	@Override
	public void buildDoors() {
		car.setDoors(2);
		
	}

	@Override
	public void buildSeats() {
		car.setSeats(2);
		
	}

	@Override
	public void buildPrice() {
		car.setPrice(488000);
		
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
		car.setOwners("José Marco & Matheus Ferreira - 524");
		
	}
	
}
