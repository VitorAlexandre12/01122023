package trycatch;

import java.util.Scanner;

public class trycatch4 {
    public static void main(String[] args) {
        try{
        Scanner scQuantia = new Scanner(System.in);
        System.out.println("Digite o valor da quantia que deseja despositar:");
        long quantia = scQuantia.nextLong();

        if (quantia > 1500000000000000000L) {
            System.out.println("Valor muito alto para despósito! Tente outro valor menor.");
        } else {
            System.out.println("Valor depositado com sucesso!");
        }
        }catch (Exception e){
            System.out.println("Ops! Ocorreu o erro " + e);
        }
    }
}
