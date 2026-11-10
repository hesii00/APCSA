public class Superhero {
    private String name; 
    private Power power;  
    
    public Superhero(){ 
        name = ""; 
        power = new Power(); 

    } 

    public Superhero (String name, Power power) { 
        this.name = name; 
        this.power = new Power(power.getName(), power.getStrength());
    } 

    public void damageTaken () { 

    } 

    public void setName(String name){ 
        this.name = name;
    }  

    public void setPower(Power power) {
        this.power = new Power(power.getName(), power.getStrength());
    } 

    public void setPower(String n, int s) { 
        this.power = new Power(n, s);
    } 

    public String getName() { 
        return name;
    } 

    public Power getPower() { 
return power}

}
