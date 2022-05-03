package com.letscode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] assessmentsSheet = new int[]{0,0,0,1,2};
        Student student = new Student();


        //get student data
        System.out.print("Inform the student name: ");
        student.setName(sc.nextLine());
        System.out.println("");

        setSchoolType(student);

        //set scores
        for(int assessment: assessmentsSheet){
            AssessmentsTypes type = AssessmentsTypes.getByFinder(assessment);
            boolean check = false;
            while(!check) {
                try {
                    System.out.print("inform the " + type + " score: ");
                    assert type != null;
                    student.addScore(Double.parseDouble(sc.nextLine()), type);
                    check = true;
                }catch(Exception e){
                    System.out.println("invalid input, try again!");
                }
            }
        }

        // return if was approved
        if(student.getAverageScore() >= student.getSchoolType().getApprobationThreshold()){
            System.out.println("the student was approved!! with "+String.format("%.02f",student.getAverageScore()*100)+"% of performance");
        }else{
            System.out.println("the student was reproved!! with "+String.format("%.02f",student.getAverageScore()*100)+" of performance");
        }

    }

    private static void setSchoolType (Student student) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while(!check) {
            System.out.println("inform the student school, options:");
            for (SchoolType school : SchoolType.values()) {
                System.out.print(school + " - " + school.getDescription() + " | ");
            }
            System.out.print("\n");
            System.out.print("student's school: ");
            try {
                student.setSchoolType(sc.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("invalid value! try again.\n");
            }
        }
    }

    private static double getMaxScore(int[] assessmentsTypes, double maxScore) {
        for (int assessmentsType : assessmentsTypes) {
            AssessmentsTypes assessment = AssessmentsTypes.getByFinder(assessmentsType);
            assert assessment != null;
            maxScore += assessment.getMaxValue();
        }
        return maxScore;
    }

}
