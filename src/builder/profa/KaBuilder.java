package builder.profa;

import builder.CarBuilder;

public class KaBuilder extends CarBuilder {
	
	@Override
	public void buildModel() {
		car.setModel("Ka SE 1.5");
	}
	
	@Override
	public void buildAutomaker() {
		car.setAutomaker("Ford");
	}
	
	@Override
	public void buildType() {
		car.setType("Hatch");
	} 
	
	@Override
	public void buildFuelSource() {
		car.setFuelSource("Gasoline or Ethanol");
	} 
	
	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
	}
	
	@Override
	public void buildColor() {
		car.setColor("Artic White");
	}
	
	@Override
	public void buildYear() {
		car.setYear(2019);
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
		car.setPrice(19990.00);
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
		car.setOwners("Maria and Helynne");
	}
	
}