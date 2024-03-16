public class AverageTest {
    // an entry point of a java program, it's where the program starts executing and it allows you to receive command line arguments if needed.
    // like java AverageTest arg1 arg2 arg3
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 20;
        double num3 = 40;

        AverageCalculator averageCalculator = new AverageCalculator();
        averageCalculator.setNum1(num1);
        averageCalculator.setNum2(num2);
        averageCalculator.setNum3(num3);
        double average = averageCalculator.calculateAverage();
        System.out.println("Average: " + average);
    }
}
