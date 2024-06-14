package com.example.projectfunctionsandswitch;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.math.*;
public class HelloApplication {
    public static int sumNumbers(int numberOne,int numberTwo) {
        return numberOne + numberTwo;
    }
    public static void print(String man) {
        System.out.println(man);
    }
    public static int cosOfNumber(int degrees){
        return degrees;
    }
    public static void main(String[] args) {
     Scanner options= new Scanner(System.in);
     System.out.println("Please, insert a letter between a, b or c");
     System.out.println("a for the summation of two numbers");
     System.out.println("b for write a string");
     System.out.println("c to find the cosine of a number in degrees");
     String optionSelected = options.nextLine();
        switch (optionSelected.toLowerCase()){
            case "a":
                System.out.println("Option selected is: a");
                Scanner firstNumber = new Scanner(System.in);
                System.out.println("Please insert your first number");
                int numberOne= firstNumber.nextInt();
                Scanner secondNumber = new Scanner(System.in);
                System.out.println("Please insert your second number");
                int numberTwo= secondNumber.nextInt();
                int sumOfNumberOneAndTwo=sumNumbers(numberOne, numberTwo);
                print("Your result is: "+sumOfNumberOneAndTwo);
                break;
            case "b":
                System.out.println("Option selected is: b");
                Scanner message= new Scanner(System.in);
                System.out.println("Please, insert a text");
                String yourMessage = message.nextLine();
                print("Your text is: "+ yourMessage);
                break;
            case "c":
                Scanner temporalNumber = new Scanner(System.in);
                System.out.println("Please insert your number of degrees");
                int degrees= temporalNumber.nextInt();
                int numForCos=cosOfNumber(degrees);
                double degree= Math.toRadians(numForCos);
                float radians= (float) Math.cos(degree);
                print("Your result is: "+ radians);
                break;
        }
    }
}