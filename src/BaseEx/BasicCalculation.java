package BaseEx;

public class BasicCalculation {

    public double Add(double num1, double num2)
    {
        return num1 + num2;
    }

    public double Sub(double num1, double num2)
    {
        return num1 - num2;
    }

    public double Product(double num1, double num2)
    {
        // To trace error while testing, writing + operator instead of * operator.
        return num1 * num2;
    }

    public double Division(double num1, double num2)
    {
        return num1 / num2;
    }
}
