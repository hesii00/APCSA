public class method {
    
    public static void sum(int a, int b) {
        System.out.println(a+b);
     } 
    public static void main(String[] args) throws Exception { 
        int x = 2; 
        int y = 3;
        sum(x,y); 
        sum(1,2); 
        System.out.println(Math.abs(x)); 
        System.out.println(Math.sqrt(x));  

        // method  
        Rectangle r = new Rectangle(); 
        Rectangle r1 = new Rectangle(1,2);
        r1.calcArea(); 
        r1.calcPerimeter();  

        Circle c1 = new Circle(); 
        Circle c2 = new Circle(10); 
        System.out.println(c1.calcArea());
        
        System.out.println(r1.getLength());  

        // create a new circle with radius one 
        Circle c3 = new Circle(1); 
        System.out.println(c3.getRadius()); 
        c1.setRadius(10); 
        System.out.print(c1.getRadius());  

        String myString = "hi"; 
        myString = "hello";

        System.out.println(myString);
        System.out.println(myString.length());
        System.out.println(myString.substring(1,4)); 
        System.out.println(myString.substring(3)); 

        String myString2 = "hello"; 
        System.out.println(myString.equals(myString2)); 
        //compares contents of string, not the memory location which may differ 

        System.out.println(myString.indexOf("l")); 
        //should give us location of the first l in hello 

        System.out.println("D".compareTo("d")); 
        //takes the ASCII number value for D and subtracts the ASCII number value for d 

        Rectangle r3 = new Rectangle(1,2); 
        System.out.println(r3.toString()); 
        System.out.println(r1); 
        // before my compiler prints a object's memory location, 
        //it goes to the class and sees if there is a toString
    } 


    
}
