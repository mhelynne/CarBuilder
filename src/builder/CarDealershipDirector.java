package builder;

public class CarDealershipDirector {

    protected CarBuilder carBuilder;
 
    public CarDealershipDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }
 
    public void buildCar() {
        carBuilder.buildModel();	
		carBuilder.buildAutomaker();	
		carBuilder.buildType(); 
		carBuilder.buildFuelSource();		
		carBuilder.buildTransmission(); 	
		carBuilder.buildColor();		
		carBuilder.buildYear();	
		carBuilder.buildDoors();		
		carBuilder.buildSeats();		
		carBuilder.buildPrice();			
		carBuilder.buildAirConditioning();		
		carBuilder.buildAirbag();		
		carBuilder.buildAbsBrake();		
		carBuilder.buildOwners();
    }
 
    public CarProduct getCar() {
        return carBuilder.getCar();
    }
}