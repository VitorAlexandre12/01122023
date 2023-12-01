package switchcase;

import java.util.Scanner;

public class swc1 {
    public static void main(String[] args) {
        String [] cores = ("Azul", "Laranja","Vermelho","Vrede");
        Scanner scCor = new Scanner(System.in);
        for (int c = 0; c < cores.length; c++); {
            System.out.println("Cor [ " + c +"] - " + cores[c]);
        }
    }
}
