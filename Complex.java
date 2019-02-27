import java.util.Scanner;


public class Complex{
    
    
    Scanner kb = new Scanner(System.in);
    
    int a = kb.nextInt();
    int b = kb.nextInt();
    int c = kb.nextInt();
    int d = kb.nextInt();
    
    public double add (){
    return ((a + c)+ (b+d));
}
    
    
    public double subtract(){
        return ((a - c)+ (b-d));
    }
    
    
    public double multiply(){
        return ((a*c) - (b*d)) + ((b*c) + (a*d));
    }
    
    public double divide (){
        return ((a*c) + (b*d)) / ((Math.pow(c, 2) + (Math.pow(d, 2))) + ((b*c) -(a*d) / (Math.pow(c, 2)) + (Math.pow(d, 2))));
   
}
    
    public int abs(){
        return Math.abs(a);
    }
    
    
    @Override
    public String toString(){
        return "The result is:" + "i";
    }
            
    
    
    public static void main(String[] args) {
        System.out.println("Enter input for variables A,B,C and D");
   
}
}