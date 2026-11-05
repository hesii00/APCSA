public class Cookie {
    private String flavor; 
    private int calories; 
    private boolean isGood; 
    private double weight;  


    public Cookie() {  
        String flavor = "cookies and cream"; 
        int calories = 200; 
        boolean isGood = true; 
        double weight = 0.5; 
    } 

    public Cookie(String x, int y, boolean z, double d) { 
        flavor = x;  
        calories = y; 
        isGood = z; 
        weight = d;

    } 

    public String getFlavor(){ 
        return flavor; 
    } 

    public int getCalories(){ 
        return calories;
    } 

    public boolean getIsGood(){ 
        return isGood;
    } 

    public double getweight(){ 
        return weight;
    }   


    public void setFlavor(String flavor){ 
        this.flavor = flavor;
    } 

    public void setCalories(int calories){ 
        this.calories = calories;
    } 

    public void setIsGood(boolean isGood){ 
        this.isGood = isGood;
    } 

    public void setWeight(double weight){ 
        this.weight = weight;
    }    

    public String toString() { 
        return "Calories: " + calories + "\n flavor: " + flavor + "\n Tasty? " + isGood + "\n Weight: " + weight;  
    }

/*public boolean equals(Cookie a){  
        if(this.calories == a.getCalories()){ 
            if(this.weight == a.getweight()){ 
                if(this.flavor.equals(a.flavor)){ 
                    if(this.isGood == a.isGood){ 
                        return true;
                    }
                }
            }
        }
        else { 
            return false;
        }
    }

    

}  
*/ 

    public boolean equals (Cookie a){ 
        if(this.calories == a.calories && this.weight == a.weight && this.flavor.equals(a.flavor) && this.isGood == a.isGood) { 
            return true;
        } 
        else{ 
            return false;
        }
    }

}
