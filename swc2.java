package switchcase;

import java.util.Scanner;

public class swc2 {
    public static void main(String[] args) {
        String [] luzes = {"Sala","Cozinha","Banheiro","Quarto"};
        Scanner scLuz = new Scanner(System.in);
        for (int l = 0; l < luzes.length; l++) {
            System.out.println("Luz [" + l +"] - "+ luzes[l]);
        }
        System.out.println("Digite o código de uma das luzes acima:");
        short luz = scLuz.nextShort();

        switch (luz) {
            case 0:
                System.out.println("Você acendeu a luz da " + luzes[0]);
                break;
            case 1:
                System.out.println("Você acendeu a luz da " + luzes[1]);
                break;
            case 2:
                System.out.println("Você acendeu a luz do " + luzes[2]);
                break;
            case 3:
                System.out.println("Você acendeu a luz do " + luzes[3]);
                break;
            case 4:
                System.out.println("Você acendeu a luz da " + luzes[4]);
                break;
        
            default:
            System.out.println("Digite um número válido!");
                break;
        }
    }
}
