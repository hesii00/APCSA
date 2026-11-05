import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gathering
        System.out.print("Enter in the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter in the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter first word: ");
        String word1 = scanner.next();

        System.out.print("Enter second word: ");
        String word2 = scanner.next();

      
        Calculator s1 = new Calculator(num1, num2);
        StringManipulator manipulator = new StringManipulator(word1, word2);

       
        System.out.println("Sum: " + s1.add());
        System.out.println("Difference: " + s1.subtract());
        System.out.println("Product: " + s1.multiply());
        System.out.println("Quotient: " + s1.divide());
        System.out.println("Power: " + s1.power());
        System.out.println("Absolute Difference: " + s1.absoluteDifference());
        System.out.println("Square Root of Sum: " + s1.squareRootOfSum());
        System.out.println("Random Number: " + s1.randomBetweenNums());

       
        System.out.println("Combined: " + manipulator.combineStrings());
        System.out.println("Combined Length: " + manipulator.getCombinedLength());
        System.out.println("First Half: " + manipulator.firstHalf());
        System.out.println("Index of Letter: " + manipulator.indexOfFirstLetter());
        System.out.println("Swapped: " + manipulator.swapFirstAndSecondHalf());

        scanner.close();
    }
}


