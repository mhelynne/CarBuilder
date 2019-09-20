package builder;

public abstract class CarBuilder {
 
    protected CarProduct car;
 
    public CarBuilder() {
        car = new CarProduct();
    }
 
 	public abstract void buildModel();
	
	public abstract void buildAutomaker();
	
	public abstract void buildType(); 
	
	public abstract void buildFuelSource(); 
	
	public abstract void buildTransmission(); 
	
	public abstract void buildColor();
	
	public abstract void buildYear();

	public abstract void buildDoors();
	
	public abstract void buildSeats();   
	
	public abstract void buildPrice();
		
	public abstract void buildAirConditioning();
	
	public abstract void buildAirbag();
	
	public abstract void buildAbsBrake();	
	
	public abstract void buildOwners();

    public CarProduct getCar() {
        return car;
    }
	
}