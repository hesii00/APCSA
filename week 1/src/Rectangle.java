public class Rectangle { 
    // attributes (things every rectangle has)
    private int length; 
    private int width;  

    //special method: constructor 
    //first method in a reference type class 
    //define the value for all attributes of a rectangle 
    public Rectangle(){ 
        length = 0; 
        width = 0;
    }

    // create a constructor with parameters 
    // method overloading - 2 methods, same name, diff num of parameters 
    public Rectangle(int x, int y ) { 
        length = x; 
        width = y;
    } 
    
    //this is not a construxtor, so it's not special 
    //it needs descriptive words 
    //this will only be called on a prexisting rectangle object, so its not static
    public double calcArea(){ 
        return length*width;
    } 

    public double calcPerimeter() { 
        return 2*length + 2*width;
    }

    //getters and setters 
    //accessors and mutators 
    //these are public methods rhat allow us to see and modify private attributes  
    //if we leave attibutes publoc, they can be modified in main without any protection 
    //because an attirvute has no protection against being set to values that might 
    //not be valid. Thus, I delegate the setting to a public method with protection 
    //and because I do that, the attribute is private so I also write a getter 
    public int getLength(){ 
        return length;
    }

    public void setLength(int l){ 
        if(l>=0){ 
        length = l; 
        }
    }   

    public String toString() { 
        return "length is: " + length + " width is: " + width; 
    }
    

    
}   

