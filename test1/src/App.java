import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 
        int x =  5;
        double z = 2.5; 
        boolean d = true;
        char c = 'x';
        System.out.println(z);  
        Scanner s1 = new Scanner(System.in); 
        
        //User Input Notes 
        System.out.println("enter your name: ");
        String userName = s1.nextLine();
        System.out.println("hello: " + userName); 
        
        System.out.println("Enter your fav number"); 
        int favNumb = s1.nextInt();  
        System.out.println("Your favorite number: " + favNumb);
        
        System.out.println("Enter your gpa");
        double gpa = s1.nextDouble(); 
        System.out.println("Your gpa is " + gpa); 

        s1.nextLine();

        System.out.println("Enter your favorite word");
        String word = s1.nextLine(); 
        System.out.println("your favorite word is: " + word);

    }
}
