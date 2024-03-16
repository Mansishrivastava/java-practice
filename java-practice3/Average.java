class AverageCalculator{
    private double num1;
    private double num2;
    private double num3;

public double getNum1(){
    return num1;
}
public void setNum1(double num1){
    this.num1=num1;
}
public double getNum2(){
    return num2;
}
public void setNum2(double num2){
    this.num2=num2;
}
public double getNum3(){
    return num3;
}
public void setNum3(double num3 ){
    this.num3=num3;
}
public double calculateAverage(){
    return (num1 + num2 + num3) / 3; // Divide by 3 instead of 2
}
public AverageCalculator() {
    // No initialization logic required
}
}

