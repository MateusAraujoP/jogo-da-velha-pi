/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Mateus Araujo de Paula
 */
public class JogoDaVelha {

    public static boolean vitoriaX(String matrizJogo[][]) { //realizar wincon check, ordenados da esquerda para a direita, de cima para baixo
        boolean vitoria = false;
        if (matrizJogo[0][0].equals(" X |") && matrizJogo[1][0].equals(" X |") && matrizJogo[2][0].equals(" X |")) { //primeira coluna
            vitoria = true;
        } else if (matrizJogo[0][1].equals(" X |") && matrizJogo[1][1].equals(" X |") && matrizJogo[2][1].equals(" X |")) { //segunda coluna
            vitoria = true;
        } else if (matrizJogo[0][2].equals(" X ") && matrizJogo[1][2].equals(" X ") && matrizJogo[2][2].equals(" X ")) { //terceira coluna
            vitoria = true;
        } else if (matrizJogo[0][0].equals(" X |") && matrizJogo[0][1].equals(" X |") && matrizJogo[0][2].equals(" X ")) { //primeira linha
            vitoria = true;
        } else if (matrizJogo[1][0].equals(" X |") && matrizJogo[1][1].equals(" X |") && matrizJogo[1][2].equals(" X ")) { //segunda linha
            vitoria = true;
        } else if (matrizJogo[2][0].equals(" X |") && matrizJogo[2][1].equals(" X |") && matrizJogo[2][2].equals(" X ")) { //terceira linha
            vitoria = true;
        } else if (matrizJogo[0][0].equals(" X |") && matrizJogo[1][1].equals(" X |") && matrizJogo[2][2].equals(" X ")) { //diagonal principal
            vitoria = true;
        } else if (matrizJogo[0][2].equals(" X ") && matrizJogo[1][1].equals(" X |") && matrizJogo[2][0].equals(" X |")) { //diagonal secundaria
            vitoria = true;
        }
        return vitoria;
    }

    public static boolean vitoriaO(String matrizJogo[][]) { //realizar wincon check, ordenados da esquerda para a direita, de cima para baixo
        boolean vitoria = false;
        if (matrizJogo[0][0].equals(" O |") && matrizJogo[1][0].equals(" O |") && matrizJogo[2][0].equals(" O |")) { //primeira coluna
            vitoria = true;
        } else if (matrizJogo[0][1].equals(" O |") && matrizJogo[1][1].equals(" O |") && matrizJogo[2][1].equals(" O |")) { //segunda coluna
            vitoria = true;
        } else if (matrizJogo[0][2].equals(" O ") && matrizJogo[1][2].equals(" O ") && matrizJogo[2][2].equals(" O ")) { //terceira coluna
            vitoria = true;
        } else if (matrizJogo[0][0].equals(" O |") && matrizJogo[0][1].equals(" O |") && matrizJogo[0][2].equals(" O ")) { //primeira linha
            vitoria = true;
        } else if (matrizJogo[1][0].equals(" O |") && matrizJogo[1][1].equals(" O |") && matrizJogo[1][2].equals(" O ")) { //segunda linha
            vitoria = true;
        } else if (matrizJogo[2][0].equals(" O |") && matrizJogo[2][1].equals(" O |") && matrizJogo[2][2].equals(" O ")) { //terceira linha
            vitoria = true;
        } else if (matrizJogo[0][0].equals(" O |") && matrizJogo[1][1].equals(" O |") && matrizJogo[2][2].equals(" O ")) { //diagonal principal
            vitoria = true;
        } else if (matrizJogo[0][2].equals(" O ") && matrizJogo[1][1].equals(" O |") && matrizJogo[2][0].equals(" O |")) { //diagonal secundaria
            vitoria = true;
        }
        return vitoria;
    }

    public static void atualizarMatriz(String matrizJogo[][]) { // printa a matriz com os atuais valores
        for (int j = 0; j < matrizJogo.length; j++) {
            for (int k = 0; k < matrizJogo.length; k++) {
                System.out.print(matrizJogo[j][k]);
            }
            System.out.println();
            if (j < 2) {
                System.out.println("-----------");
            }
        }
    }

    public static void inputX(String matrizJogo[][]) { //metodo para entrar a posicao de X
        Scanner sc = new Scanner(System.in);
        String posicao = new String();
        System.out.println("Posicao do X:");
        posicao = sc.next();
        switch (posicao) {
            case "A1":
                if (matrizJogo[0][0].equals("   |")) {
                    matrizJogo[0][0] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "A2":
                if (matrizJogo[0][1].equals("   |")) {
                    matrizJogo[0][1] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "A3":
                if (matrizJogo[0][2].equals("   ")) {
                    matrizJogo[0][2] = " X ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "B1":
                if (matrizJogo[1][0].equals("   |")) {
                    matrizJogo[1][0] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "B2":
                if (matrizJogo[1][1].equals("   |")) {
                    matrizJogo[1][1] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "B3":
                if (matrizJogo[1][2].equals("   ")) {
                    matrizJogo[1][2] = " X ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "C1":
                if (matrizJogo[2][0].equals("   |")) {
                    matrizJogo[2][0] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "C2":
                if (matrizJogo[2][1].equals("   |")) {
                    matrizJogo[2][1] = " X |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            case "C3":
                if (matrizJogo[2][2].equals("   ")) {
                    matrizJogo[2][2] = " X ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputX(matrizJogo);
                }
                break;
            default:
                System.out.println("Posicao invalida! Tente novamente.");
                inputX(matrizJogo);
                break;
        }

    }

    public static void inputO(String matrizJogo[][]) { //metodo para entrar a posicao de O
        Scanner sc = new Scanner(System.in);
        String posicao = new String();
        System.out.println("Posicao do O:");
        posicao = sc.next();
        switch (posicao) {
            case "A1":
                if (matrizJogo[0][0].equals("   |")) {
                    matrizJogo[0][0] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "A2":
                if (matrizJogo[0][1].equals("   |")) {
                    matrizJogo[0][1] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "A3":
                if (matrizJogo[0][2].equals("   ")) {
                    matrizJogo[0][2] = " O ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "B1":
                if (matrizJogo[1][0].equals("   |")) {
                    matrizJogo[1][0] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "B2":
                if (matrizJogo[1][1].equals("   |")) {
                    matrizJogo[1][1] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "B3":
                if (matrizJogo[1][2].equals("   ")) {
                    matrizJogo[1][2] = " O ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "C1":
                if (matrizJogo[2][0].equals("   |")) {
                    matrizJogo[2][0] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "C2":
                if (matrizJogo[2][1].equals("   |")) {
                    matrizJogo[2][1] = " O |";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            case "C3":
                if (matrizJogo[2][2].equals("   ")) {
                    matrizJogo[2][2] = " O ";
                } else {
                    System.out.println("Essa posicao ja foi jogada! Tente novamente.");
                    inputO(matrizJogo);
                }
                break;
            default:
                System.out.println("Posicao invalida! Tente novamente.");
                inputO(matrizJogo);
                break;
        }
    }

    public static void main(String[] args) {
        String matrizJogo[][] = new String[3][3]; //gerar matriz do jogo
        for (int i = 0; i < matrizJogo.length; i++) {
            for (int j = 0; j < matrizJogo.length; j++) {
                if (j < 2) {
                    matrizJogo[i][j] = "   |";
                } else {
                    matrizJogo[i][j] = "   ";
                }

                System.out.print(matrizJogo[i][j]);
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----------");
            }
        } //fim gerar matriz do jogo
        int i = 0;
        boolean vitoria = false;
        do {
            inputX(matrizJogo);
            atualizarMatriz(matrizJogo);
            if (i > 1 && vitoriaX(matrizJogo) == true) {
                System.out.println("Jogador X vence!");
                vitoria = true;
                break;
            }
            if (i < 4) {
                inputO(matrizJogo);
                atualizarMatriz(matrizJogo);
                if (i > 1 && vitoriaO(matrizJogo) == true) {
                    System.out.println("Jogador O vence!");
                    vitoria = true;
                    break;
                }
            }
            i++;
        } while (i < 5);
        if (vitoria == false) {
            System.out.println("O jogo deu velha! (empate)");
        }
        System.out.println("\nFim!");
    }
}
