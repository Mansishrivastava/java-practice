public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");

        car.drive(); // Polymorphism: calls Car's drive method
        motorcycle.drive(); // Polymorphism: calls Motorcycle's drive method
    }
}