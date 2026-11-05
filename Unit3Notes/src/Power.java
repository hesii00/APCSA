public class Power {
    private String name; 
    private int strength; 

    //if you write no constructors, java will hallucinate the default constructor for you
    public Power(){ 
        name = "";
        strength = 0;
    } 

    public Power(String name, int strength){ 
        this.name = name;
        this.strength = strength;
    }  

    public void setName(String name){ 
        this.name = name; 
    } 

    public void setStrength(int strength) { 
        this.strength = strength; 
    } 

    public int getStrength() { 
        return strength;
    } 

    public String getName() { 
        return name;
    }


}
