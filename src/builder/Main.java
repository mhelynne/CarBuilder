package builder;

import java.util.ArrayList;
import java.util.List;

import builder.i514.CeltaBuilder;
import builder.i524.FuscaBuilder;
import builder.i524.TeslaXBuilder;
import builder.profa.KaBuilder;

public class Main {
	
	public static void main(String[] args) {

		// ->
		outputMsg ( new CarDealershipDirector(new KaBuilder()) );
		// <-
		
		// -> 514 example
		outputMsg ( new CarDealershipDirector(new CeltaBuilder()) );
  
    // -> 524 example
		outputMsg ( new CarDealershipDirector(new FuscaBuilder()) );
		outputMsg ( new CarDealershipDirector(new TeslaXBuilder()) );
	}
	
private static void outputMsg(CarDealershipDirector carDealership) {
		
		carDealership.buildCar();
		CarProduct car = carDealership.getCar();
		
		System.out.println(car.owners + "'s car is a "+  car.year + " " + car.model + ".\n" +
						"It is a "+ car.type + " that runs on " + car.fuelSource + " and it has " + car.transmission + " transmission.\n" + 
						"Its color is " + car.color + " and it has "+  car.seats +" seats.");
	
	
		List<String> complement = new ArrayList<String>();

		if (car.hasAirConditioning()) complement.add("air-conditioning");
		if (car.hasAirbag()) complement.add("airbag");
		if (car.hasAbsBrake()) complement.add("ABS brake");

		if(!complement.isEmpty()) {
			System.out.println( "It also has: " + String.join(", ", complement) +"." );
		}
    
		System.out.println("If you are interested, the car costs $" + car.price + ".\n" );
	}
	
}
