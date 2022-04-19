package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] studentData = new String[2];
        Double[] score = new Double[5];
        Double[] scoreLimits = new Double[]{10D,10D,10D,50D,20D};
        Double finalScore;
        Double maxScore = 0D;

        for(int i = 0;i<score.length;i++){
            maxScore += scoreLimits[i];
        }

        getStudentData(studentData);
        finalScore = getScores(score, scoreLimits);
        if(getResult(finalScore, maxScore, studentData[1])==true){
            System.out.println("the student "+studentData[0]+" was APPROVED. Total score: "+finalScore);
        }else{
            System.out.println("the student "+studentData[0]+" was REPROVED. Total score: "+finalScore);
        }
    }

    //get student data
    public static void getStudentData(String[] studentData) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Student Name: ");
        studentData[0] = String.valueOf(scanner.nextLine());
        System.out.print("School Type: ");
        studentData[1] = scanner.nextLine();
    }

    //get scores
    public static double getScores(Double[] score, Double[] scoreLimits){
        Double finalScore = 0D;
        Double scoreValue = 0D;
        Boolean dataCheck;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < score.length;i++){
            dataCheck = false;
            while(dataCheck == false){
                if(i<3){
                    System.out.print("exercise n°"+(i+1)+" score: ");  
                }else if(i==3){
                    System.out.print("test score: ");
                }else{
                    System.out.print("participation score: ");
                }

                scoreValue = Double.valueOf(scanner.nextLine());
                if(scoreValue <= scoreLimits[i] && scoreValue >= 0){
                    score[i] = scoreValue;
                    finalScore = finalScore + scoreValue;
                    dataCheck = true;
                } else{
                    System.out.println("Invalid value, try again.");
                }
            }
        } 
        return finalScore;
    }

    //get final result
    public static boolean getResult(Double finalScore, Double maxScore, String schoolType){
        double passParameter = 0D;
        if(schoolType.equalsIgnoreCase("PU") || schoolType.equalsIgnoreCase("public")){
            passParameter = 0.65;
        }
        if(schoolType.equalsIgnoreCase("PR") || schoolType.equalsIgnoreCase("private")){
            passParameter = 0.7;
        }
        if(schoolType.equalsIgnoreCase("MT") || schoolType.equalsIgnoreCase("military")){
            passParameter = 0.8;
        }

        if(finalScore >= (maxScore*passParameter)){
            return true;
        }else{
            return false;
        }
    }
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
                finalScore = finalScore + score;
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
            finalScore = finalScore + score;
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
            finalScore = finalScore + score;
            dataCheck = true;

        } else {
            System.out.println("score não permitida");
        }
    }

    switch (schoolType){
        case "PU":
            if(finalScore>= 65){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+finalScore);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+finalScore);
            }
            break;
        case "PR":
            if(finalScore>= 70){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+finalScore);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+finalScore);
            }
            break;
        case "MT":
            if(finalScore>= 80){
                System.out.println("O Aluno "+ student +" foi APROVADO. Total de pontos: "+finalScore);
            }else{
                System.out.println("O Aluno "+ student +" foi REPROVADO. Total de pontos: "+finalScore);
            }
            break;
    }
*/
    


