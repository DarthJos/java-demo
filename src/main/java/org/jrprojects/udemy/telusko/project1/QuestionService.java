package org.jrprojects.udemy.telusko.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionService {
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<String> answers = new ArrayList<>();

    public QuestionService(){
        questions.add(new Question(1, "Size of int", "2", "6", "4","8", "4"));
        questions.add(new Question(2, "Size of double", "2", "6", "4","8", "8"));
        questions.add(new Question(3, "Size of char", "2", "6", "4","8", "2"));
        questions.add(new Question(4, "Size of long", "2", "6", "4","8", "8"));
        questions.add(new Question(5, "Size of boolean", "1", "2", "4","8", "1"));
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question);
            System.out.println("Write your answer: ");
            String answer = sc.nextLine();
            answers.add(answer);
        }
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.size(); i++) {
            if (questions.get(i).getAnswer().equals(answers.get(i))) {
                score++;
            }
        }

        System.out.println("\nYour Score: " + score + "/" + questions.size());
    }
}
