package com.noelistic.g1app;

public class QuestionSignE {

       private String mQuestions [] = {
            "1. What does this sign mean?",
            "2. What does this sign mean?",
            "3. What does this sign mean?",
            "4. What does this sign mean?",
            "5. What does this sign mean?",
            "6. What does this sign mean?",
            "7. What does this sign mean?",
            "8. What does this sign mean?",
               "9. What does this sign mean?",
               "10. What does this sign mean?",
            "TEST ENDED"};






    private String mChoices[][] = {
            {"River ahead be cautious","Road is fenced ahead","Water on road be cautious","Bridge ahead opens to allow boats to pass"},
            {"Hazard, the downward line indicates the side on which you MAY NOT pass","Steer in the opposite direction of the lines","Hazard, the downward line indicates the side on which you MAY pass","Crosswalk for pedestrians"},
            {"School zone ahead","A hidden school bus stop ahead; slow down, drive with extra caution, and watch for children and school buses with flashing lights","School playground ahead","You may pass school buses just like any other vehicle"},
            {"Intersection ahead","Railway ahead","Bridge ahead","Narrow road head"},
            {"Keep to the right of the traffic island","You can pass other vehicles","Road turns left", "You are approaching a winding road"},
            {"Merge your vehicle with the left lane","Hidden intersection", "Road Branching off ahead","Merge with traffic; traffic on both roads are equally responsible to merge appropriately"},
            {"Turn left safely", "You must not turn right","You must not turn left","Dead end ahead"},
            {"Traffic light is broken","No right turn on red","Turn right turn on red","No right turn on green"},
            {"Pass if way is clear","Pass even when way is not clear","Never pass","Pass at any time"},
            {"Pass if way is clear","Intersection ahead","Do not park vehicle side by side","Passing is not permitted"},
            {"NULL","NULL","NULL","NULL"}

    };



    private String mCorrectAnsers[] = {
            "Bridge ahead opens to allow boats to pass",
            "Hazard, the downward line indicates the side on which you MAY pass",
            "A hidden school bus stop ahead; slow down, drive with extra caution, and watch for children and school buses with flashing lights",
            "Intersection ahead",
            "Keep to the right of the traffic island",
            "Merge with traffic; traffic on both roads are equally responsible to merge appropriately",
            "You must not turn left",
            "No right turn on red",
            "Pass if way is clear",
            "Passing is not permitted",
            "NULL"

    };


    public String getQuestion(int a) {

        String question = mQuestions[a];
        return  question;
    }

    public  String getChoice1(int a) {
        String Choice0 = mChoices[a][0];

        return Choice0;
    }

    public  String getChoice2(int a) {
        String Choice1 = mChoices[a][1];

        return Choice1;
    }

    public  String getChoice3(int a) {
        String Choice2 = mChoices[a][2];

        return Choice2;
    }

    public  String getChoice4(int a) {
        String Choice3 = mChoices[a][3];

        return Choice3;
    }
    public String getCorrectAnswer(int a)
    {

        String answer = mCorrectAnsers[a];

        return  answer;
    }


}
