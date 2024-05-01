package model;

import api.Connection;

import java.util.Scanner;

public class CurrencyConverter {
    Scanner input = new Scanner(System.in);
    private String conversion_result ;
    public void conversion (String original, String toConvert){
        Connection connection = new Connection();
        System.out.println("Enter the amount of money you want to convert: ");
        int amount = input.nextInt();

        if (amount > 0){
            conversion_result  = connection.connection(original, toConvert, amount);
            System.out.println("The value " + amount +" " + "["+original+"]" +  " corresponds to the final value of: " + conversion_result  + " " + "["+toConvert+"]");
        }else {
            System.out.println("valor no valido");
            conversion(original, toConvert);
        }

    }

    public String getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(String conversion_result) {
        this.conversion_result = conversion_result;
    }
}
