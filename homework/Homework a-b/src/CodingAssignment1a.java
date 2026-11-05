import java.util.Scanner;

public class CodingAssignment1a {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 

        Scanner s1 = new Scanner(System.in); 
        
        // Problem 1
        System.out.println("enter your name: ");
        String name = s1.nextLine();
        System.out.println("hi, " + name + "welcome to APCSA");

        // Problem 2 
        System.out.println("enter your name: ");
        String name1 = s1.nextLine(); 

        System.out.println("enter your name: ");
        String name2 = s1.nextLine(); 

        System.out.println("enter your name: ");
        String name3 = s1.nextLine(); 

        System.out.println(name3 + name2 + name1); 

        // Problem 3 
        System.out.println("Enter your weight (lbs):  ");
        double weight = s1.nextDouble();  
        double mercury = weight * 0.4; 
        double venus = weight * 0.9; 
        double mars = weight * 0.38; 
        double jupiter = weight * 2.3; 
        double saturn = weight * 1.1; 
        double uranus = weight * 0.92; 
        double neptune = weight * 1.2; 

        System.out.println("You would weight" + mercury + "pounds on Mercury"); 
        System.out.println("You would weight" + venus + "pounds on Venus"); 
        System.out.println("You would weight" + mars + "pounds on Mars"); 
        System.out.println("You would weight" + jupiter + "pounds on Jupiter");  
        System.out.println("You would weight" + saturn + "pounds on Saturn"); 
        System.out.println("You would weight" + uranus + "pounds on Uranus"); 
        System.out.println("You would weight" + neptune + "pounds on Neptune");  
        
        // Problem 4 
        System.out.println("Enter any amount of seconds:  "); 
        int totalseconds = s1.nextInt(); 
        int hours = totalseconds / 3600; 
        int extraSeconds = totalseconds % 3600;  
        int minutes = extraSeconds/60; 
        int seconds = extraSeconds % 60; 

        System.out.println("Hours: " + hours + "minutes: " + minutes + "seconds: " + seconds );




    }
}
