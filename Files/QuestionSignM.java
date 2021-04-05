package com.noelistic.g1app;

public class QuestionSignM {



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
            "11. What does this sign mean?",
            "12 What does this sign mean?",
            "13. What does this sign mean?",
            "14. What does this sign mean?",
            "15. What does this sign mean?",
            "16. What does this sign mean?",
            "17. What does this sign mean?",
            "18. What does this sign mean?",
            "19. What does this sign mean?",
            "20. What does this sign mean?",
            "TEST ENDED"};





    private String mChoices[][] = {

            {"Airplane landing","Airplane ahead","Route to airport","airplane parking ahead"},
            {"This road is also a bicycle route","Bicycle parking ahead","This road is shared by all types of vehicles","No bicycles allowed here"},
            {"Bridge ahead","Come to a complete stop","Uneven road ahead","The road is wet and slippery"},
            {"Go in this direction","You must turn right","Keep to the right","Closed lane sign"},
            {"Be aware of hunters","Deer regulatory cross; be alert for animals","Zoo ahead","Do not sound horn at animals"},
            {"Make a U-turn","Lane closed; merge with traffic","Keep a safe distance","Follow the detour marker until you return to a regular route"},
            {"Slow down your vehicle","Do not block intersection","Make a U-turn","You are not allowed to park here"},
            {"Vehicles cannot change lanes into or out of a High Occupancy Vehicle (HOV) lane in this area","Pedestrian crossing ahead. Yield the right-of-way to them","Motorcycle lane do not cross","Pass the lane if traffic is high"},
            {"Narrow bridge","Divided highway ends","Divided highway starts","All of the above"},
            {"No passing through this road","No idling for more than 3 minutes","No drinking","No stopping after 3pm"},
            {"Do not enter","Do not park here","School zone","No stopping or standing in this area"},
            {"Parking only at night time","Weekend parking","You MAY park in the designated area between the signs during the times shown","You MAY NOT park in the designated area between the signs during the times shown"},
            {"Do not enter; road ends here","Do not pass any vehicles within 30 meters of a pedestrians","Do not pass; school area","Construction zone ahead"},
            {"Red light camera at the intersection","Traffic light ahead","Slow down and drive slow","All the above"},
            {"Stop for workers ahead","Road operation ahead","The might be a flagman on duty","Slow down"},
            {"A park ahead","Playground ahead","You must not pass ahead","A school crossing ahead; look out for pedestrians"},
            {"Turn right","Must not turn left","Sharp bend or turn ahead","Come to a stop first then proceed making the left turn"},
            {"Dead end ahead","Yield right of way","Stop sign ahead","Stop Sign"},

            {"Road narrows ahead","Hidden intersection ahead","Road ahead turns right, then left","Road ahead turns left, then right"},

            {"You must give the right of way","You have the right of way","Be cautious","Slow moving vehicles"},
                     {"NULL","NULL","NULL","NULL"}

    };




    private String mCorrectAnsers[] = {
            "Route to airport",
            "This road is also a bicycle route",
            "Uneven road ahead",
            "Closed lane sign",
            "Deer regulatory cross; be alert for animals",
            "Follow the detour marker until you return to a regular route",
            "Do not block intersection",
            "Vehicles cannot change lanes into or out of a High Occupancy Vehicle (HOV) lane in this area",
            "Divided highway starts",
            "No idling for more than 3 minutes",
            "No stopping or standing in this area",
            "You MAY park in the designated area between the signs during the times shown",
            "Do not pass any vehicles within 30 meters of a pedestrians",
            "Red light camera at the intersection",
            "Road operation ahead",
            "A school crossing ahead; look out for pedestrians",
            "Sharp bend or turn ahead",
            "Stop sign ahead",

            "Road ahead turns right, then left",
            "You must give the right of way",


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
