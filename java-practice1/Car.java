public class Car{
//INSTANCE VARIBLES
private String make;
private String model;
private int year;

//CONSTRUCTOR
public Car(String make,String model,int year){
this.make=make;
this.model=model;
this.year=year;
}
//Method to display the car information
public void displayInfo(){
System.out.println("Car Make:"+make);
System.out.println("Year Model:"+model);
System.out.println("Year Make:"+year);
}
// Main Method to demonstrate the car
public static void main(String[] args){
Car myCar=new Car("Toyoto","Camry",2022);
myCar.displayInfo();
}
}