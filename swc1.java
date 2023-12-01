package switchcase;

import java.util.Scanner;

public class swc1 {
    public static void main(String[] args) {
        String [] cores = {"Azul", "Laranja","Vermelho","Verde"};
        Scanner scCor = new Scanner(System.in);
        for (int c = 0; c < cores.length; c++) {
            System.out.println("Cor [ " + c +"] - " + cores[c]);
        }
        System.out.println("Digite o código de uma das cores acima");
        short cor = scCor.nextShort();

        switch (cor) {
            case 0:
                System.out.println("Você escolheu a cor " + cores[0]);
                break;
            case 1:
                System.out.println("Você escolheu a cor " + cores[1]);
            case 2:
                System.out.println("Você escolheu a cor " + cores[2]);
            case 3:
                System.out.println("Você escolheu a cor " + cores[3]);
            case 4:
                System.out.println("Você escolheu a cor " + cores[4]);
            default:
                System.out.println("Cor não encontrada!");
                break;
        }
    }
}
