import java.util.Scanner;

public class CodingAssignment1b {
    public static void main(String[] args) throws Exception {
       

        Scanner s1 = new Scanner (System.in); 

        System.out.print("Enter a standard verb: ");
        String verb = s1.nextLine();

        System.out.print("Enter an -ed verb: ");
        String verbPast = s1.nextLine();

        System.out.print("Enter a teacher's name: ");
        String teacher = s1.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective1 = s1.nextLine();

        System.out.print("Enter a song title: ");
        String song = s1.nextLine();

        System.out.print("Enter a student's name: ");
        String student = s1.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = s1.nextLine(); 


        System.out.println("It was a " + adjective1 + " day in AP Computer Science A, when " + teacher + " burst in the doorway. They started singing " + song + " while " + student + " " + verbPast + " with them. The whole class clapped as " + student + " did their signature dance move: the " + adverb + " " + verb);
    }
} 


