class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a " + brand + " car");
    }
}