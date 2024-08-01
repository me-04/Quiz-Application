package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {

    private static List<QuestionsList> javaQuestions (){
        final List<QuestionsList> questionsLists=new ArrayList<>();

        //create object of QuestionsList class and pass question, option and answer
        final QuestionsList question1=new QuestionsList("What is the size of int varibale?","16 bit","8 bit","32 bit","64 bit","32 bit","");
        final QuestionsList question2=new QuestionsList("What is the default value of Boolean variable?","true","false","null","not defined","false","");
        final QuestionsList question3=new QuestionsList("Which of the following is the default value of instance variable?","Depends upon the type of variable","null","0","not assigned","Depends upon the type of variable","");
        final QuestionsList question4=new QuestionsList("Which is the reserved word for the JAVA programming language?","method","native","reference","array","native","");
        final QuestionsList question5=new QuestionsList("Which of the following is not a keyword or reserved word in JAVA?","if","then","goto","while","then","");
        final QuestionsList question6=new QuestionsList("Which is a valid declaration within a interface definition?","public double methoda()","public final double methoda()","static void methoda(double d1)","protected void methoda(double d1)","public double methoda()","");

        //add all questions to questionslist
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions (){
        final List<QuestionsList> questionsLists=new ArrayList<>();

        //create object of QuestionsList class and pass question, option and answer
        final QuestionsList question1=new QuestionsList("What does PHP stand for?","Proffesional home page","Hypertext preprocessor","PreHypertext Processor","Preprocessor homepage","Hypertext preprocessor","");
        final QuestionsList question2=new QuestionsList("Who is the father of PHP?","Rasmus Lerdof","William Makepiece","Drek Kolkevi","List Barely","Rasmus Lerdof","");
        final QuestionsList question3=new QuestionsList("PHP files have a file extension of.",".html",".php",".xml",".json",".php","");
        final QuestionsList question4=new QuestionsList("A PHP script should start with _____ and end with _____?","< php >","< php />","< ? ? >","< ?php ? >","< ?php ? >","");
        final QuestionsList question5=new QuestionsList("Which symbol is used to denote variables in PHP?","$","@","%","#","$","");
        final QuestionsList question6=new QuestionsList("Which of the following is the correct way to include a file in PHP?","#include 'filename.php';","include 'filename.php';","include_file 'filename.php';","require_file 'filename.php';","include 'filename.php';","");

        //add all questions to questionslist
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions (){
        final List<QuestionsList> questionsLists=new ArrayList<>();

        //create object of QuestionsList class and pass question, option and answer
        final QuestionsList question1=new QuestionsList("What does HTML stand for?","Hyper Text Markup Language","Home Tool Markup Language","Hyperlinks and Text Markup Language","Home Text Markup Language","Hyper Text Markup Language","");
        final QuestionsList question2=new QuestionsList("Who is making the Web standards?","Mozilla"," Google","The World Wide Web Consortium","Microsoft","The World Wide Web Consortium","");
        final QuestionsList question3=new QuestionsList("Choose the correct HTML element for the largest heading:","<h1>","<h6>","<heading>","<head>","<h1>","");
        final QuestionsList question4=new QuestionsList(" What is the correct HTML element for inserting a line break?","<br>","<break>","<lb>","<newline>","<br>","");
        final QuestionsList question5=new QuestionsList("What is the correct HTML for adding a background color?","<body bg=\"yellow\">","<background>yellow</background>","<body style=\"background-color: yellow;\">","<body bgcolor=\"yellow\">","<body style=\"background-color: yellow;\">","");
        final QuestionsList question6=new QuestionsList("Which HTML element defines the title of a document?","<meta>","<head>","<title>","<header>","<title>","");

        //add all questions to questionslist
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions (){
        final List<QuestionsList> questionsLists=new ArrayList<>();

        //create object of QuestionsList class and pass question, option and answer
        final QuestionsList question1=new QuestionsList("What is an activity in Android?","  A class representing the application's data model"," A class that manages the application's UIe","A class that handles database operations","A background process running in the application","A class that manages the application's UI","");
        final QuestionsList question2=new QuestionsList("Which method is used to start an activity in Android?","startActivity()"," beginActivity()","openActivity()","initActivity()","startActivity()","");
        final QuestionsList question3=new QuestionsList("What does the AndroidManifest.xml file contain?","The UI design of the application"," The application's activities, permissions, and services"," The application's source code","The application's build configuration","The application's activities, permissions, and services","");
        final QuestionsList question4=new QuestionsList("Which of the following is a valid Android resource file name?","my-icon@2x.png","My Icon.png","my_icon.png","myIcon.png","my_icon.png","");
        final QuestionsList question5=new QuestionsList("Which method is called when an activity is first created?","onStart()","onCreate()","onResume()","onInit()","onCreate()","");
        final QuestionsList question6=new QuestionsList("What is the purpose of the R file in Android?","To manage database operations","To define the application's theme","To store resource IDs"," To handle network operations","To store resource IDs","");

        //add all questions to questionslist
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case"java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}
