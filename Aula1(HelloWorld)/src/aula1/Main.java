/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author 38954586864
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Digite seu nome: ");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        System.out.println("Olá " + nome + "!");
        leitor.close();
    }
}
