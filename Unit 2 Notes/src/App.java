import java.util.Scanner;

public class App { 


    public static String reverse(String s) {  
        String answer = "";
        for (int i = s.length()-1; i>=0; i--){ 
            answer += s.substring(i, i+1); 
        }
        return answer;
    }
    // In for loops we start with i = starting condition, 
    // then we write the condition that we repeat for as long as its true 
    // then the increment 


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");  

         
        for (int i =100; i>0; i--) { 
            System.out.println(i);
        } 

        for (int i = 0; i<=50; i+=2) { 
            System.out.println(i);
        } 

        for(int i = 0; i<11; i++) { 
            for(int j=0; j<11; j++) { 
                System.out.print(i*j);
            } 
            System.out.println();
        }
        


        Scanner s5 = new Scanner(System.in); 
        s5.nextLine();
        String password = "abc123";
        System.out.println("enter a password"); 
        String entry = s5.nextLine();
        while(!entry.equals(password)) { 
            System.out.println("try again"); 
            entry = s5.nextLine(); 
            
            }
        System.out.println("you got it!"); 

        String password2 = "password123"; 
        while(true){ 
            System.out.println("Enter a password"); 
            String entry1 = s5.nextLine(); 
            if (entry1.equals(password2)){ 
                break;
            }
        }


        // create a password 
        // ask the user to enter a password until they get the right one 
        
        Cookie c1 = new Cookie ("Cookies and cream", 1200, true, 0.5);
        Cookie c2 = new Cookie ("Cookies and cream", 1200, true, 0.5);  

        c1.setCalories(10); 
        System.out.println(c1.equals(c2));

          

        String s1 = "hello"; 
        String s2 = "hello"; 
        System.out.println (s1==s2);
        System.out.println(s1.equals(s2)); 



        int countdown = 3; 
        while (countdown > 0 ) 
        { 
            System.out.println(countdown); 
            countdown--;
        } 
        System.out.println("Countdown Complete"); 

        int x = 0;
        while (x <= 100) 
        { 
            System.out.println(x); 
            x+=5;
        } 

        for (int z = 0; z <= 100; z+= 5 ) { 
            System.out.print(z);
        } 

        

    }
    

    public static String replace(String s, String replace, String add){ 
        
        String corrected = "";

        for (int i = 0; i<s.length(); i++){ 
            if(s.substring(i,i+1).equals(replace)) { 
                corrected += add;
            } 
            else { 
                corrected += s.substring(i,i+1);
            }
        } 
        return corrected;
    }
    
}
