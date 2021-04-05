package com.noelistic.g1app;

public class QuestionRulesM {



    private String mQuestions [] = {
            "1. Driving in heavy fog, driver should use:",
            "2. Whenever Lights are required, drivers must use low beam headlights when following behind a vehicle within:" ,
            "3. If you are is under 19, and you have had G2  license for less than 6 months then:",
            "4. When at night, or when head lights are required, drivers must use low beam headlights:",
            "5. Whenever making a left turn on a one way street, what position must you be in?",
            "6. What is the level of alcohol much be for a g2 driver:",
            "7. When you see a flashing amber signal at an intersection, but are not able to stop in time,what must you do?:",
            "8. If you want to pass a motorcycle – what should you do?:",
            "9. When does the law require you to turn your vehicle lights on?",
            "10. What must you do when you approach a yield sign?",
            "11. What should you do at a railway crossing where the warning signal is flashing?",
            "12. If you see a stop sign approaching, driver must:",
            "13. If you are convicted of driving 50 km/h over the legal speed limit:",
            "14. Before moving your car out of a parked position, you should:",
            "15. When are you allowed to pass another vehicle from the right side?",
            "16. Are you as a driver responsible for people in your car wearing their seatbelts?",
            "17. What does a red light signal with a green arrow mean?",
            "18. What does a flashing green signal mean?",
            "19. When is it too dangerous to make a “U” turn?",
            "20. If you are ever involved in an accident where someone is injured, you have to:",



            "TEST ENDED"};





    private String mChoices[][] = {
            {"High beam lights","Hazard lights","Low beam lights","Parking lights"},
            {"120 meters","60 meters","30 meters","None of the above"},
            {"You can have no passengers in your car who are 19 and under between 12am and 5am","You can have 3 passengers in your car who are 19 and under between 12am and 5am","You can have 1 passenger in your car who is 19 and under between 12am and 5am.","You can have 4 passengers in your car who are 19 and under between 12am and 5am"},
            {"When you are within 1000 m of approaching another vehicle","When you are within 300 m of approaching another vehicle","When you are within 150 m of approaching another vehicle","When you are within 200 m of approaching another vehicle"},
            {"As long as the turn can be made safely", "it does not matter","Close to the left side of the road","Close to the right side of the road", "Directly in the middle of the road"},
            {"1.00%", "0.001%","0.10%","0.00%",},
            {"Stop if you are making a left turn","Do not slow down and go through as long as the way is clear", "Stop and wait for the signal to turn green","Slow down and proceed with caution"},
            {"Pass the motorcycle just as you would pass any other car", "Honk to warn the motorcyclist and then pass with the same lane","Warn the motorcyclist with your high‐beam headlights then pass","Use half the lane to pass"},
            {"A)Anytime between 6pm to 6am the next morning","B)Between half an hour before sunset and half an hour after sunrise","C)Any time you cannot see clearly for a distance of 150 meters","D)Both B and C"},


//            {"Traffic regulations","Presence of trees, fire hydrants or poles near the curb","Turning radius of your car","Height of curb"},


            {"Since you have the right of way, slow down for 3 seconds and then pick up speed","Slow down, stop if needed, and yield the right‐of‐way","Slow down","Always come to a complete stop and yield the right‐of‐way"},

            {"Stop at least 5 meters from the nearest rail","Stop at least 1 meter from the nearest rail","Stop at least 15 meters from the nearest rail","Stop at least 25 meters from the nearest rail"},
            {"A)Come to a rolling stop and proceed when it is safe to do so","B)Come to a complete stop and proceed when it is safe to do so","C)Stop and then sound horn to alert pedestrians and other cars before proceeding","D)None of the above"},
            {"You can have your license suspended for 30 days","You can have your license suspended for 6 months","You can have your license suspended for 8 months","Your vehicle can be impounded for 4 weeks"},
            {"Signal and proceed","Check traffic and proceed when the way is clear. There is no need to signal","Check traffic, signal, and proceed only when it is safe to do so","Both A and C"},
            {"You can always pass on the right side no matter what kind of street or highway","When the street or highway has two lanes going in opposite directions","When the street or highway has two or more lanes going in the same direction","You are never allowed to pass on the right side. You must always pass on the left"},
            {"Only for passengers who sit in the front","Only for passengers who sit in the back","Yes. All the time","Only for passengers aged 5 to 16"},
            {"Proceed with caution in direction of arrow. Yield right‐of‐way to pedestrians","Come to a complete stop. Then proceed with caution in the direction of the arrow","Cars must stop. But public transit vehicles may proceed in the direction of the arrow","The red light is for motor vehicles, and the green is strictly for pedestrians"},
            {"A)You may turn left","B)You may turn right","C)You may proceed straight through","D)All of the above"},
            {"A) Within 150 meters of a bridge or tunnel if your view is obstructed","B) On a railway crossing. Within 30 meters of the railway crossing","C) On a hill or curve there a clear view of less than 150 meters in either direction","D) All of the above"},

            {"Report the accident to law enforcement officials within 3 hours of the accident","Report the accident to the nearest law enforcement officials at once","Report the accident to your insurance company only","Report the accident to law enforcement officials within 1 week"},



            {"NULL","NULL","NULL","NULL"}

    };




    private String mCorrectAnsers[] = {
            "Low beam lights",
            "60 meters",
            "You can have 1 passenger in your car who is 19 and under between 12am and 5am.",
            "When you are within 150 m of approaching another vehicle",
            "Close to the left side of the road",
            "0.00%",
            "Slow down and proceed with caution",
            "Pass the motorcycle just as you would pass any other car",

            "D)Both B and C",
            "Slow down, stop if needed, and yield the right‐of‐way",
            "Stop at least 15 meters from the nearest rail",
            "B)Come to a complete stop and proceed when it is safe to do so",
            "You can have your license suspended for 30 days",
            "Check traffic, signal, and proceed only when it is safe to do so",
            "When the street or highway has two or more lanes going in the same direction",
            "Only for passengers aged 5 to 16",
            "Proceed with caution in direction of arrow. Yield right‐of‐way to pedestrians",
            "D)All of the above",
            "D) All of the above",
            "Report the accident to the nearest law enforcement officials at once",



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
