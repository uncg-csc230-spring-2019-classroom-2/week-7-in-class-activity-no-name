import java.util.Scanner;

public class ComplexNum{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
      System.out.println("Enter the first complex number: ");
      System.out.println("Enter the second complex number: ");
    
  }
}

class Complex{
  private double a, b;

  public Complex(){
  this.a = 0;
  this.b = 0;
  }

  public Complex(double a){
  this.a = a;
  this.b = 0;
  }

  public Complex(double a, double b){
  this.a = a;
  this.b = b;
  }

  public double getRealPart(){
  return a;
  }

  public double getImaginaryPart(){
  return b;
  }

  public Complex add(Complex complex){
    return new Complex(a + complex.a, b + complex.b);
  }

  public Complex subtract(Complex complex){
    return new Complex(a - complex.a, b - complex.b);
  }

  public Complex multiply(Complex complex){
    return new Complex(a * complex.a - b * complex.b, b * complex.a + 
    a * complex.b);
  }

  public Complex divide(Complex complex){
    return new Complex((a * complex.a + b * complex.b) / (Math.pow(complex.a, 2) 
    + Math.pow(complex.b, 2)), (b * complex.a - a * complex.b) / 
    (Math.pow(complex.a, 2) + Math.pow(complex.b, 2)));
  }

  public double abs(){
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }

  @Override
  public String toString(){
    return 
  }
}