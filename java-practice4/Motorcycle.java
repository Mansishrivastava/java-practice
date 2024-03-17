
public class Motorcycle extends Vehicle {
    public Motorcycle(String brand){
        super(brand);
    }
    @Override
    public void drive(){
        System.out.println("Riding a "+brand+" motorcycle");
    }
}
