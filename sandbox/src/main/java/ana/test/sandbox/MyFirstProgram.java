package ana.test.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    hello("ana");
    double l = 5;
    System.out.println("area of " + l + " is " + area(l));

    double a = 2;
    double b = 4;
    System.out.println("rectangular square of " + a + " and " + b + " is " + area(a, b));

  }
public static void hello (String name) {
    System.out.println("hello " + name +"!");
}

public static double area (double len){
    return len*len;
}

public static double area (double a, double b) {
  return a*b;
}
}
