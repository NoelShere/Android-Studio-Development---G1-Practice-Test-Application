package com.noelistic.g1app;

public class QuestionRulesH {





    private String mQuestions [] = {
            "1. How many demerit points will be recorded on your license for careless driving?",
            "2. If you are approaching a stop sign, what is the law requiring you to do before entering an intersection?" ,
            "3. When you are approaching a roundabout, you should______",

            "4. Your license will be suspended for 30 days if you incur 15 demerit points. After the suspension period, the number of points on your driver’s record will be reduced to_______",
            "5. When a railway crossing is signalling an approaching train, you should_______",

            "6. When signaling with your hand and arm to mean stopping/slowing down, you should put your arm_______",

            "7. Before moving from a parked position, you should_____.",
            "8. The area or spot you cannot see in your vehicle’s rear and side view mirrors is called____",
            "9. Parking lights should be used_____",
            "10 If you are driving with a G1 licence, you must have a Class G passenger______",
            "11 The front brake of your vehicle is more important than the rear one because______",
            "12 When entering a freeway, you should______",
            "13 Threshold braking means_______",
            "14 When approaching an intersection where a traffic signal light is red and a police officer signals you to go through, you should_____",
            "15 When coming down from a steep hill, a good and safe driving practice is to____",
            "16 A solid line at the left of your lane means_____",
            "17 Parking lights should be used___",
            "18 When vehicles faster than yours want to pass you, you should___",
            "19 What can wet roadways cause?",
            "20 When exiting a freeway, you should____",
            "TEST ENDED"};





    private String mChoices[][] = {
            {"3","5","7","6"},
            {"Stop, and when it is safe to do so, proceed","Slow down and then proceed when way is clear","Slow down, blow the horn and proceed","Stop, blow the horn, then move on"},
            {"Blow the horn and enter the roundabout","Slow down and watch for pedestrians on the approach to the yield line at the entrance of the roundabout. Stay in your lane, but firmly","Stop at least 3 metres from the yield line at the entrance of the roundabout and wait for traffic to stop for you","Proceed at current speed and stay at the same lane because you have the right-of-way"},
            {"Six","Three","Five","Seven"},
            {"Stop not less than 1.0 meters (5 feet) from the nearest rail or gate","Stop not less than 5 meters (15 feet) from the nearest rail or gate","Decelerate, check the distance of the train, and if you can safely cross, quickly do it", "Accelerate and cross tracks as rapidly as possible before gates are closed"},
            {"Out and up","Straight out the window", "Out and down","Up and down"},
            {"Always check other traffic, signal and pull from the curb quickly", "Always signal and check for traffic; pull out only when it is safe to do so","Blow the horn and pull from the curb slowly","Signal and pull from the curb carefully"},
            {"Safe area","Dark spot","Blind spot","Black spot"},
            {"All the time","When driving in bad weather conditions","When there is much traffic","For parking only"},


            {"Sitting in the front","With 0% blood alcohol content level if under 22, 0.05% if older than 22","With 4 years of driving experience","All of the above"},


            {"It provides most of the stopping power","It provides all of the stopping power","It provides half of the stopping power","None of the above"},
            {"Signal and speed up to merge smoothly with traffic","Slow down, and then enter freeway at a sharp angle","Stop on the acceleration lane, wait for an opening, and then enter the freeway quickly","Drive slowly and get ready to stop for freeway traffic"},

            {"You apply hard-braking and keep your foot on the brakes until the vehicle stops","You pump the brakes several times","You use all the braking force available without locking the wheels","You are braking unsafely"},

            {"Tell the police officer that traffic signal light is red","Obey the police officer's signal and proceed","Wait for the light to turn green","Stop and then drive slowly"},
            {"Take off the clutch and coast","Switch off the ignition","Keep the gear shift in neutral","Gear down and use the motor to assist in braking"},
            {"Pass only when no traffic is seen","It is unsafe to pass","Pass when you feel it is safe","Overtake and pass with extra caution"},
            {"All the time","When driving in bad weather conditions","For parking only","When there is much traffic"},
            {"Move to the right and let it pass in safety","Move to the left to prevent passing","Accelerate so that passing is not needed","Signal the other driver not to pass"},
            {"Loss of traction","Hydroplaning","Poor visibility","All of the above"},
            {"Follow what the vehicle in front of you does","Signal, move into the deceleration lane, reduce speed gradually and obey exit signs","Signal and then stop to wait for an opening in traffic","Signal, and then accelerate while merging smoothly into traffic and then move to the exit lane"},

            {"NULL","NULL","NULL","NULL"}

    };




    private String mCorrectAnsers[] = {
            "6",
            "Stop, and when it is safe to do so, proceed",
            "Slow down and watch for pedestrians on the approach to the yield line at the entrance of the roundabout. Stay in your lane, but firmly",
            "Seven",
            "Stop not less than 5 meters (15 feet) from the nearest rail or gate",
            "Out and down",
            "Always signal and check for traffic; pull out only when it is safe to do so",
            "Blind spot",
            "For parking only",
            "All of the above",
            "It provides most of the stopping power",
            "Signal and speed up to merge smoothly with traffic",
            "You use all the braking force available without locking the wheels",
            "Obey the police officer's signal and proceed",
            "Gear down and use the motor to assist in braking",
            "It is unsafe to pass",
            "For parking only",
            "Move to the right and let it pass in safety",
            "All of the above",
            "Signal, move into the deceleration lane, reduce speed gradually and obey exit signs",
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
