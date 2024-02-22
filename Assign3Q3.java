public class Assign3Q3 {
    public static void main(String args[]) {
      int currentValue = 10;
      System.out.println("The number is: " + currentValue);
      
      int factorial = factorial(currentValue);
      
      System.out.println("The factorial of " + currentValue + " is: " + factorial);
  }
    public static int factorial(int number) {
      return number == 0 ? 1 : number * factorial(number - 1);
    }
}
