public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); 
        Power p1 = new Power("flight", 90);
        Power p2 = new Power("x-ray vision", 40); 
        Power p3 = new Power("speed", 10); 

        Superhero s1 = new Superhero("jacob", p2);
        Superhero s2 = new Superhero("Kamran", p2); 
        Superhero s3 = new Superhero("Ryan",p3);  

        s1.damageTaken(10);  

        s1.getPower().setStrength(s1.getPower().getStrength()-1);
    }
}

