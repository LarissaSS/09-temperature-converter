import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //C = 5 * ((F-32) / 9)

    Scanner sc = new Scanner(System.in); 
    System.out.print("Digite a temperatura em graus Fahrenheit: ");
    
    double fahrenheit = sc.nextDouble();
    double temp = 5 * ((fahrenheit - 32) / 9);

    System.out.print("A temperatura em graus Celsius é: " + temp);
    
  }
}