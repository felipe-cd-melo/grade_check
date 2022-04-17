package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentData = new String[2];
        Double[] score = new Double[5];
        Double[] scoreLimits = new Double[5];
        scoreLimits = {10,10,10,50,20};
        Double scoreFinal = 0D;
        boolean dataCheck;
        

        getStudentData(studentData, scanner);
        System.out.println(studentData[0]);
        System.out.println(studentData[1]);
    }

    //get student data
    public static void getStudentData(String[] studentData, Scanner scanner) {
        System.out.print("Student Name: ");
        studentData[0] = String.valueOf(scanner.nextLine());
        System.out.print("School Type: ");
        studentData[1] = scanner.nextLine();
    }

    //get scores
    public static double setScores(Scanner scanner,Double[] score, Double[] scoreLimits,Double scoreFinal, boolean dataCheck){
        for(int i = 0; i < score.length;i++){
            dataCheck = false;
            if(i<3){
                while(dataCheck == false){
                    System.out.println("score of exercise n° "+i+": ");
                    score[i] = Double.valueOf(scanner.nextLine());
                    if(socre[i]){

                    } 
                }
            }
        } 
        return 0;
    }

    //get final result
}



/*
System.out.print("informe o nome do student: ");
    student = scanner.nextLine();
    System.out.print("infome o tipo de escola: ");
    schoolType= scanner.nextLine();
    for(int i=1; i<=3;i++){
        dataCheck = false;
        while(dataCheck == false){
            System.out.print("informe a score da atividade "+i+": ");
            score = Double.valueOf(scanner.nextLine());
            if (score <= 10) {
                scoreFinal = scoreFinal + score;
                dataCheck = true;

            } else {
                System.out.println("score não permitida");
            }
        }
    }

    dataCheck = false;
    while(dataCheck == false){
        System.out.print("informe a score da prova: ");
        score = Double.valueOf(scanner.nextLine());
        if (score <= 50) {
            scoreFinal = scoreFinal + score;
            dataCheck = true;

        } else {
            System.out.println("score não permitida");
        }
    }

    dataCheck = false;
    while(dataCheck == false){
        System.out.print("informe a score da participação: ");
        score = Double.valueOf(scanner.nextLine());
        if (score <= 20) {
            scoreFinal = scoreFinal + score;
            dataCheck = true;

        } else {
            System.out.println("score não permitida");
        }
    }

    switch (schoolType){
        case "PU":
            if(scoreFinal>= 65){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+scoreFinal);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+scoreFinal);
            }
            break;
        case "PR":
            if(scoreFinal>= 70){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+scoreFinal);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+scoreFinal);
            }
            break;
        case "MT":
            if(scoreFinal>= 80){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+scoreFinal);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+scoreFinal);
            }
            break;
    }
*/
    


