package com.example.projectfunctionsandswitch;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    public static int sumNumbers(int numberOne,int numberTwo) {
        int result = numberOne + numberTwo;
        return result;
    }
    public static void print(String man) {
        System.out.println(man);
    }
    public static void main(String[] args) {
     Scanner options= new Scanner(System.in);
     System.out.println("Please, insert a letter between a, b or c");
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
                print("Your text is: "+yourMessage);
                break;
            case "c":

                break;
        }


    }
}