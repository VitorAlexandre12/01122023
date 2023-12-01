package trycatch;

import java.util.Scanner;

public class trycatch3 {
    public static void main(String[] args) {
        try{
        Scanner scIdade = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        short idade = scIdade.nextShort();

        if (idade >= 18) {
            System.out.println("Parabens! Você é maior de idade.");
        } else{
            System.out.println("Você é menor de idade!");
        }
        
    } catch (Exception e) {
        System.out.println("Ops! Ocorreu o erro " + e);
    }
    }
}
