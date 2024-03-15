public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Mansi", 40);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        person1.setName("Cecee");
        person1.setAge(20);
        person1.displayInfo();
    }
}
