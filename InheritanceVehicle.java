package Demo;

//Parent class: Vehicle
class Vehicle {
String brand;
String model;
int year;

//Constructor for Vehicle class
public Vehicle(String brand, String model, int year) {
 this.brand = brand;
 this.model = model;
 this.year = year;
}

//Method to simulate driving
public void drive() {
 System.out.println("The " + brand + " " + model + " is driving!");
}
}

//Child class: Car
class Car extends Vehicle {
String color;

//Constructor for Car class
public Car(String brand, String model, int year, String color) {
 super(brand, model, year); // Call the parent class constructor
 this.color = color;
}

//Method to  honking
public void honk() {
 System.out.println("The " + color + " " + brand + " " + model + " is honking!");
}
}

public class InheritanceVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of the Car class
	     Car myCar = new Car("Toyota", "Corolla", 2025, "Blue");

	     // Call the drive method (inherited from Vehicle)
	     myCar.drive();

	     // Call the honk method (defined in Car)
	     myCar.honk();

	}

}


//OUTPUT :-
/* The Toyota Corolla is driving!
The Blue Toyota Corolla is honking!
*/