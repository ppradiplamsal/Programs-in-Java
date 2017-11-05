import java.util.*;
import java.lang.*;
import java.io.*;

interface CarbonFootprint {
    void getCarbonFootprint();
}

class Building implements CarbonFootprint {
    
    int number;
    String danger_level;
    float pollution_index;
    
    Building (int number, String danger_level, float pollution_index) {
        this.number = number;
        this.danger_level = danger_level;
        this.pollution_index = pollution_index;
    }
        
        public void getCarbonFootprint() {
        	System.out.println("The danger level of building is: " + danger_level +
        	" and its carbon footprint amount is: " + (number * pollution_index));
        }
}


class Car implements CarbonFootprint {
    
    int number;
    String danger_level;
    float pollution_index;
    
    Car (int number, String danger_level, float pollution_index) {
        this.number = number;
        this.danger_level = danger_level;
        this.pollution_index = pollution_index;
    }
        
        public void getCarbonFootprint() {
        	System.out.println("The danger level of car is: " + this.danger_level +
        	" and its carbon footprint amount is: " + (this.number * this.pollution_index));
        }	
        
}


class Bicycle implements CarbonFootprint {
	
    int number;
    String danger_level;
    float pollution_index;
    
    Bicycle (int number, String danger_level, float pollution_index) {
        this.number = number;
        this.danger_level = danger_level;
        this.pollution_index = pollution_index;
    }
        
        public void getCarbonFootprint() {
        	System.out.println("The danger level of bicycle is: " + this.danger_level +
        	" and its carbon footprint amount is: " + (this.number * this.pollution_index));
        }		
	
}


class Main {
	
	public static void main (String[] args) throws java.lang.Exception {
		
		Building bl = new Building(144887, "Good", 3.2f);
		Car ca = new Car(1223245, "Bad", 2.1f);
		Bicycle bc = new Bicycle(12458, "Ugly", 0.6f);
		

		CarbonFootprint arr[] = new CarbonFootprint [] {bl, ca, bc};

		for (CarbonFootprint x: arr) {
			x.getCarbonFootprint();
		}
		
	}
	
}