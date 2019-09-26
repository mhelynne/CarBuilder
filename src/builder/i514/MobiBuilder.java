package builder.i514;

import builder.CarBuilder;

public class MobiBuilder extends CarBuilder {

	@Override
	public void buildModel() {
		// TODO Auto-generated method stub
		car.setModel(" Mobi 1.0");
	}

	@Override
	public void buildAutomaker() {
		// TODO Auto-generated method stub
		car.setAutomaker("Fiat");
	}

	@Override
	public void buildType() {
		car.setType("Easy");
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
		car.setColor("Black volcano");
	}
	
	@Override
	public void buildYear() {
		car.setYear(2020);
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
		car.setPrice(33490.00);
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
		car.setOwners("Shirlley and Beatriz");
	}
}
