public class person {
    private String name;
    private String hobby; 
    private double gpa; 

    public person() { 
    String name = "";
    String hobby = "";
    double gpa = 0.0;
    } 

    public person (String x, String y, int z) { 
    name = x;
    hobby = y ;
    gpa = z;
    } 

    public String getName() { 
        return name;
    }  

    public String getHobby() { 
        return hobby;
    }

    public double getGpa() { 
        return gpa;
    } 

    public void setName(String name) { 
        this.name = name;
    } 

    public void setHobby(String hobby) { 
        this.hobby = hobby; 
    }

    public void setGpa(double gpa) { 
        this.gpa = gpa; 
    } 

    public String toString() { 
        return "Name:" + name + "\n Hobby: " + hobby + "GPA:" + gpa;
    } 

    public boolean equals (person a){ 
        if (this.name.equals(a.name) && this.hobby.equals(a.hobby) && this.gpa == a.gpa) { 
            return true;  
        }
        else { 
            return false;
        }
    }
}
