package com.noelistic.g1app;

public class QuestionSignH {



    private String mQuestions [] = {
            "1. What does this sign mean?",
            "2. What does this sign mean?" ,
            "3. What does this sign mean?",
            "4. What does this sign mean?",
            "5. What does this sign mean?",
            "6. What does this sign mean?",
            "7. What does this sign mean?",
            "8. What does this sign mean?",
            "9. What does this sign mean?",
            "10. What does this sign mean?",
            "11. What does this sign mean?",
            "12. What does this sign mean?",
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
            {"There is a slight bend or curve in the road","The lane exits to the left","Keep to the left","One way road"},
            {"Bicycle repair","Bicycle crossing ahead","Bicycle parking only","Bicycle lane"},
            {"Only for parents with children","No Parking for people with a valid disabled person parking permit","Parking only for people with wheelchair","Only for vehicles displaying a valid disabled person parking permit"},
            {"Intersection ahead","Railway ahead","Drivers on the side road at the intersection ahead do not have a clear view of traffic","Narrow road head"},
            {"One way road","Hidden intersection","Narrow bridge ahead", "You are approaching a winding road"},
            {"Pavement narrows ahead","Hidden intersection","Divided highway ahead", "You are approaching a winding road"},
            {"Do not stop if you are riding a bicycle","No bicycles allowed on this road", "Do not park bicycles on this road","Bicycles are allowed on this road"},
            {"Turn left safely", "You may drive straight through the intersection","You must not turn left","Do not drive straight through the intersection"},
            {"No left turn allowed","No right turn allowed","You must make a U-turn","You must not make a U-turn"},
            {"Keep to the right", "Traffic may travel in one direction only","There is a sharp curve or bend ahead","Vehicle must turn right"},
            {"Sand on the road ahead","Road slippery when wet","Be ware of falling rocks","The paved surface ends ahead"},
            {"Permissive sign; you may or must do the activity shown inside the green circle","Stop sign","Do not enter","Be cautious"},
            {"There is a roundabout 300 metres ahead","There is a roundabout 200 metres ahead","Keep to the right from 300 metres ahead","Make a U-turn after 300 metres ahead"},
            {"This sign is not useful and can be ignored","You may pass a school buss with flashing lights","Slow down and drive with caution","You must stop if a school bus has flashing signals"},
            {"During school hours when the yellow lights are flashing, follow the speed limit shown","Children playground; drive with caution","Watch for pedestrians","Watch only for children"},
            {"Slow down and drive with caution","Slippery road ahead","Pavement ends ahead","Share the road with oncoming traffic"},
            {"Turn left","Turn right","The sign guides the drivers around sharp curves in the road","Keep to the right"},
            {"Maximum safe speed for the curve","Maximum safe speed at night","Speed limit in school zone","Minimum safe speed for the curve"},
            {"Traffic light is broken","Traffic light ahead","Railway crossing ahead","Stop when you see this sign"},
            {"Truck route","Truck entrance ahead on the right","No trucks permitted","Heavy vehicles only"},



            {"NULL","NULL","NULL","NULL"}

    };




    private String mCorrectAnsers[] = {

            "There is a slight bend or curve in the road",
            "Bicycle crossing ahead",
            "Only for vehicles displaying a valid disabled person parking permit",
            "Drivers on the side road at the intersection ahead do not have a clear view of traffic",
            "Narrow bridge ahead",
            "Pavement narrows ahead",
            "No bicycles allowed on this road",
            "Do not drive straight through the intersection",
            "You must not make a U-turn",
            "Traffic may travel in one direction only",
            "The paved surface ends ahead",
            "Permissive sign; you may or must do the activity shown inside the green circle",
            "There is a roundabout 300 metres ahead",
            "You must stop if a school bus has flashing signals",
            "During school hours when the yellow lights are flashing, follow the speed limit shown",
            "Share the road with oncoming traffic",
            "The sign guides the drivers around sharp curves in the road",
            "Maximum safe speed for the curve",
            "Traffic light ahead",
            "Truck entrance ahead on the right",

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
