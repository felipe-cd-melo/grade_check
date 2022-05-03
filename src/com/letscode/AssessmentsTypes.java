package com.letscode;

public enum AssessmentsTypes {
    ACTIVITY(0, 10D),
    TEST(1, 50D),
    PARTICIPATION(2, 30D);

    private final int finder;
    private final double maxValue;

    AssessmentsTypes(int finder, double maxValue){
        this.finder = finder;
        this.maxValue = maxValue;
    }

    public double getMaxValue(){
        return this.maxValue;
    }

    public static AssessmentsTypes getByFinder(int finder){
        for(AssessmentsTypes score: AssessmentsTypes.values()){
            if (finder == score.finder){
                return score;
            }
        }
        return null;
    }

}
