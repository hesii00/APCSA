
public class Calculator {
    private double num1;
    private double num2;

    public Calculator() {
        num1 = 2.0;
        num2 = 5.0;
    }

    public Calculator(double x, double y) {
        num1 = x;
        num2 = y;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    public double power() {
        return Math.pow(num1, num2);
    }

    public double absoluteDifference() {
        return Math.abs(num1 - num2);
    }

    public double squareRootOfSum() {
        return Math.sqrt(num1 + num2);
    }

    public int randomBetweenNums() {
        int min = (int) Math.min(num1, num2);
        int max = (int) Math.max(num1, num2);
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}