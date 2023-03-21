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

        int option=-1;
        double a, b, r;

        logger.info("The Logger has been initiated!\n");

        while(option!=0){
            App.main_menu();
            option = sc.nextInt();
            
            logger.info("The chosen option is " + option);

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
                        System.out.println("Square root:\nInput: " + a + "\nOutput: " + r);
                    }

                    break;
                case 2:
                    System.out.println("Enter the number to find its factorial : ");
                    a = sc.nextDouble();
                    r = calculator._factorial(a);
                    
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Factorial:\nInput: " + a + "\nOutput: " + r);
                    }

                    break;
                case 3:
                    System.out.println("Enter the number to find its logarithm (base e) : ");
                    a = sc.nextDouble();
                    r = calculator._log(a);
                    
                    if(r == -1){
                        System.out.println("Invalid Input");
                    }else{
                        System.out.println("Logarithm:\nInput: " + a + "\nOutput: " + r);
                    }

                    break;
                case 4:
                    System.out.println("Enter the numbers to find a power b : ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    r = calculator._pow(a, b);
                    
                    System.out.println("Power:\nInput: " + a + ", " + b + "\nOutput: " + r);
                
                    break;
                default:
                    System.out.println("Please enter a valid option to proceed. You can choose from [0-4].");
                    logger.info("Entered invalid option. Option should be lie in [0-4].");
            }

            if(option == 0){
                logger.info("Exited.");
                sc.close();
                break;
            }
        }
    }

    public double _sqrt(double x) {
        if(x < 0) {
            logger.info("Square root -> Invalid Input");
            return -1;
        }

        double r = Math.sqrt(x);

        logger.info("Square root -> Input: " + x + " -> Output: " + r);

        return r;
    }

    public  double _factorial(double x){
        if(x < 0) {
            logger.info("Factorial -> Invalid Input");
            return -1;
        }

        double r = 1;
        for(int i=1;i<=x;i++){
            r *= i;
        }

        logger.info("Factorial -> Input: " + x + " -> Output: " + r);

        return r;
    }

    public double _log(double x) {
        if(x <= 0){
            logger.info("Logarithm -> Invalid Input");
            return -1;
        }
        
        double r = Math.log(x);

        logger.info("Logarithm -> Input: " + x + " -> Output: " + r);

        return r;
    }

    public double _pow(double a, double b) {
        double r = Math.pow(a, b);

        logger.info("Power -> Input: " + a + ", " + b + " -> Output: " + r);

        return r;
    }
}
