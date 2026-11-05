public class Circle {
    private int radius;
    
    public Circle(){ 
        radius = 0;

    } 

    public Circle (int x){ 
        radius = x; 
    } 

    public double calcArea(){ 
        return Math.pow(radius,2)*Math.PI;
    } 

    public int getRadius(){ 
        return radius;
    } 

    public void setRadius(int r){ 
        if(r>=0){ 
            radius = r;
        }
    } 

    public String toString(){ 
        return "radius is: " + radius;
    }
} 


