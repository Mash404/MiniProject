package com.example.qiuz;

public class Questions {

    public  String mQuestions[] ={
            "What is the largest social network?",
            "What is the capital city Of Bangladesh?",
            "Who won the ICC Under-19 World Cup? ",
            "What planet has the most moons?",
            "Who is the founder of microsoft?"
    };

    private String mChoices[][] = {
            {"Twitter","Facebook","WhatsApp","Snapchat"},
            {"Dhaka","Chittagong","Sylhet","Comilla"},
            {"Australia","India","England","Bangladesh"},
            {"Jupiter","Earth","Saturn","Mars"},
            {"Steve Jobs","Bill Gates","Larry Page","Sergey Brin"}

    };

    private String mCorrectAnswer[]={"Facebook","Dhaka", "Bangladesh","Saturn","Bill Gates"};

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

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}

