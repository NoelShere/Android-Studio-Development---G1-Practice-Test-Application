package com.noelistic.g1app;

public class QuestionLibrary {



private String mQuestions [] = {
        "1. You should under all conditions drive at a speed which will allow you to:",
        "2. To get your vehicle out of a skid, you should first:" ,
        "3. When may you lend your driver’s licence?",
        "4. It is more dangerous to drive at the maximum speed limit at night than during daytime as:",
        "5. What must a driver do before entering a highway from a private road or driveway?",
        "6. Never change lanes in traffic without:",
        "7. When the driver of another vehicle is about to overtake and pass your vehicle, you must:",
        "8. When you are deciding whether or not to make a U-turn, your first consideration should be to check:",
        "9. If two vehicles arrive at an uncontrolled intersection at approximately the same time, the right-of-way should be given to:",
        "10. Upon approaching a Yield sign, what does the law require drivers to do?",
        "TEST ENDED"};





    private String mChoices[][] = {
            {"Stop within 150 metres (500 feet)","Stop within 90 metres (300 feet)","Stop within 60 metres (200 feet)","Stop within a safe distance"},
            {"Steer straight ahead","Steer in the opposite direction of the skid","Steer in the direction you want to go","Apply brakes hard"},
            {"In emergencies","To a person learning to drive","It is not permitted","For identification purposes"},
            {"Your reaction time is slower at night","You cannot see as far ahead at night","Some drivers unlawfully drive with parking lights only","The roadways are more apt to be slippery at night"},
            {"Enter or cross the highway as quickly as possible.","Yield right-of-way to all vehicles approaching on the highway","Sound horn and proceed with caution", "Give hand signal then take right-of-way"},
            {"Looking in the rear view mirror only","Giving proper signal and looking to make sure the move can be made safely", "Blowing your horn and looking to the rear","Decreasing speed and giving correct signal"},
            {"Speed up so that passing is not necessary", "Move to the left to prevent passing","Signal to the other driver not to pass","Move to the right and allow such vehicle to pass"},
            {"Traffic regulations","Presence of trees, fire hydrants or poles near the curb","Turning radius of your car","Height of curb"},
            {"Neither one","The one moving faster","The vehicle approaching from left","The vehicle approaching from right"},
            {"Slow down, stop if necessary, and proceed only when the way is clear","Stop, then enter oncoming traffic quickly","Stop, then enter oncoming traffic slowly","Speed up and force their way into oncoming traffic"},

            {"NULL","NULL","NULL","NULL"}

    };




    private String mCorrectAnsers[] = {
            "Stop within a safe distance",
            "Steer in the direction you want to go",
            "It is not permitted",
            "You cannot see as far ahead at night",
            "Yield right-of-way to all vehicles approaching on the highway",
            "Giving proper signal and looking to make sure the move can be made safely",
            "Move to the right and allow such vehicle to pass",
            "Traffic regulations",
            "The vehicle approaching from right",
            "Slow down, stop if necessary, and proceed only when the way is clear",
             "NULL"};


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
