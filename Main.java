package com.neville;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Calculator application.

public class Main {


    public static void main(String[] args) {

        //initialize the result variable.
        double result = 0;
        Scanner ip = new Scanner(System.in);

        System.out.println("\n ====Welcome to the Calculator==== \n");

        //Take inputs.
        System.out.println("Enter first numeric value: ");
        String input1 = ip.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.println("Enter second numeric value: ");
        String input2 = ip.nextLine();
        double d2 = Double.parseDouble(input2);

        //input operation choice.
        System.out.println("Possible operations are:\n" +
                "1. Addition.\n" +
                "2. Subtraction.\n" +
                "3. Division.\n" +
                "4. Multiplication.\n");
        System.out.println("Enter one of the menu choice(1,2,3,4):");
        String operationChoice = ip.nextLine();

        //int opr = Integer.parseInt(operationChoice);

        try{
            int opr = Integer.parseInt(operationChoice);

            switch(opr) {
                case 1:
                    result = addValues(d1, d2);
                    break;

                case 2:
                    result = subtractValues(d1,d2);
                    break;

                case 3:
                    result = divideValues(d1,d2);
                    break;

                case 4:
                    result = multiplyValues(d1,d2);
                    break;

                default:
                    System.out.println("Not a valid operation.");
                    return;
            }

            System.out.println("The result of the operation is : "+result);

        }catch(Exception e){
            System.out.println("Exception occurred: "+e.getMessage());
        }

    }

    public static double addValues(double d1 , double d2){
        double res = d1 + d2;
        return res;
    }

    public static double subtractValues(double d1 , double d2){
        double res = d1 - d2;
        return res;
    }

    public static double subtractValuesTimeout(double d1, double d2) throws InterruptedException {
        double res = d1 - d2;
        TimeUnit.SECONDS.sleep(100);
        return res;
    }

    public static double divideValues(double d1 , double d2) {
        double res = 0;
        if(d2 == 0) {
            throw new ArithmeticException("Cannot divide by 0.");
        }
        else{
                res = d1/d2;
                return res;
            }
    }

    public static double multiplyValues(double d1 , double d2){
        double res = d1 * d2;
        return res;
    }
}
