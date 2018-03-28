package com.example.rishabhspc.agkquiz;


public class Questions {

    public String mQuestions[] = {
            "India ranked __________ in the list of wealthiest countries:",
            "This ministry launched the Mission Retro-Fitment recently:",
            "Which ministry bans the cattle slaughter Across India?",
            "Entomology is the science that studies:",
            "Gilt-edged market means",
            "If one-third of one-fourth of a number is 15, then three-tenth of that number is:",
            "The largest 4 digit number exactly divisible by 88 is:",
            "The sum of two number is 25 and their difference is 13. Find their product:",
            "The product of two numbers is 120 and the sum of their squares is 289. The sum of the number is:"

    };

    private String mChoices [][] = {
            {"5", "6", "8", "9"},
            {"Ministry of Railways", "Ministry of Rural Development", "Ministry of Consumer Affairs", "Ministry of External Affair"},
            {"Ministry of Environment", "Ministry of Civil Aviation", "Ministry of Human Resource Development", "Ministry of agriculture and Farmer welfare"},
            {"Behaviour of human beings", "Insects", "The origin and history of technical and scientific terms", "The formation of rocks"},
            {"Bullion market", "Market of government securities", "Market of guns", "Market of pure metals"},
            {"35", "36", "45", "54"},
            {"9944","9768", "9988", "8888"},
            {"104", "114", "315", "325"},
            {"20", "23", "69", "29"}

          };
    private String mCorrectAnswers[] = {"6", "Ministry of Railways", "Ministry of Environment", "Insects", "Market of government securities", "54", "9944", "114", "23" };


    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswers(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
