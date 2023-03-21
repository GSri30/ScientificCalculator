package org.example;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main_menu(){
        System.out.println("\nScientific Calculator\n");
        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Logarithm (base e)");
        System.out.println("4. Power");
        System.out.println("0. Exit");
        System.out.println("Please enter your option: ");
    }
    public static void main( String[] args )
    {
        App calculator = new App();

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        int option=-1;
        double a, b, r;

        while(option!=0){
            App.main_menu();
            option = sc.nextInt();

            switch (option){
                case 0:
                    System.out.println("Thank you! See you again!");
                    break;
                case 1:
                    System.out.println("Enter the number to find its sqrt : ");
                    a = sc.nextDouble();
                    r = calculator._sqrt(a);
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Square root: Input: " + a + " Output: " + r);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number to find its factorial : ");
                    a = sc.nextDouble();
                    r = calculator._factorial(a);
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Factorial: Input: " + a + " Output: " + r);
                    }
                    break;
                case 3:
                    System.out.println("Enter the number to find its logarithm (base e) : ");
                    a = sc.nextDouble();
                    r = calculator._log(a);
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Logarithm: Input: " + a + " Output: " + r);
                    }
                    break;
                case 4:
                    System.out.println("Enter the numbers to find a power b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    r = calculator._pow(a, b);
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Power: Input: " + a + ", " + b + " Output: " + r);
                    }
                    break;
                default:
                    System.out.println("Please enter a valid option to proceed. You can choose from [0-4].");
            }

            if(option == 0){
                sc.close();
                break;
            }
        }
    }

    public double _sqrt(double x) {
        if(x < 0) {
            return -1;
        }

        double r = Math.sqrt(x);

        return r;
    }

    public  double _factorial(double x){
        if(x < 0) {
            return -1;
        }

        double r = 1;
        for(int i=1;i<=x;i++){
            r *= i;
        }

        return r;
    }

    public double _log(double x) {
        if(x <= 0){
            return -1;
        }

        double r = Math.log(x);

        return r;
    }

    public double _pow(double a, double b) {
        double r = Math.pow(a, b);

        return r;
    }
}
