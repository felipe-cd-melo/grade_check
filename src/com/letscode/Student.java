package com.letscode;

import java.util.Locale;

public class Student {
    private String name;
    private SchoolType schoolType;
    private double finalScore;
    private double maxScore;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){return this.name; }

    public void addScore(double score, AssessmentsTypes scoreType) throws Exception {
        if(score <= scoreType.getMaxValue() && score >= 0){
            this.finalScore += score;
            this.maxScore += scoreType.getMaxValue();
        }else{
            throw new Exception("invalid Score Value");
        }
    }

    public void setSchoolType (String schoolType){
        schoolType = schoolType.toUpperCase(Locale.ROOT);
        this.schoolType = SchoolType.valueOf(schoolType);
    }

    public SchoolType getSchoolType(){return this.schoolType; }

    public double getAverageScore(){
        return this.finalScore /this.maxScore;
    }

}
