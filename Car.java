package week1.day1;
//accessSpecifier keyword ClassName
public class Car {
	//accessSpecifier returnType methodName(){}
public void driveCar(){
	System.out.println("I am driving the car");
}
public void applyBrake(){
	System.out.println("Apply the brake");
}
public static void main(String[] args) {
	//ClassName objectName = new ClassName();
	Car myCar = new Car();
	myCar.driveCar();
	myCar.applyBrake();
}
}