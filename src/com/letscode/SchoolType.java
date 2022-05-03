package com.letscode;

public enum SchoolType {
    PU(0.65,"Public School"),
    PR(0.7,"Private School"),
    MT(0.8,"Military School");

    final private double APPROBATION_THRESHOLD;
    final private String EXTENDED_NAME;

    SchoolType(double approbationThreshold, String extendedName){
        this.APPROBATION_THRESHOLD = approbationThreshold;
        this.EXTENDED_NAME = extendedName;
    }

    public double getApprobationThreshold(){
        return this.APPROBATION_THRESHOLD;
    }

    public String getDescription(){return this.EXTENDED_NAME;}

    public boolean checkApprobation(double averageScore){
            return averageScore>=this.APPROBATION_THRESHOLD;
    }
}

