package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    private String name;
    private ArrayList<Question> questionArrayList;
    private Scanner scanner;

    public Session(String name, ArrayList<Question> questionArrayList) {
        this.name = name;
        this.questionArrayList = questionArrayList;
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Приветствуем вас!");
        System.out.println("Ниже будет рассчитана вероятность, с которой у вас получиться сдать сессию!");

        for(Question q: questionArrayList) {
            System.out.println("Вопрос: " + q.getTitle());
            System.out.print("Ответы: ");
            for(Answer a: q.getAnswer()) {
                System.out.print(" "+a);
            }
            System.out.println("\n ------------------------------- ");
            int x = scanner.nextInt();
            if((x-1) == q.getCorrect()) {
                Rating.counter++;
            }
        }
        if(Rating.counter == 6) {
            System.out.print("Уверены, у вас всё получится. Вероятность сдать сессию ");
            System.out.printf("%.0f", Rating.counter / 6 * 100);
            System.out.print("%");
        } else if(Rating.counter < 6 && Rating.counter >= 1) {
            System.out.print("Вам следует задуматься об учёбе. Вероятность сдать сессию ");
            System.out.printf("%.0f", Rating.counter / 6 * 100);
            System.out.print("%");
        } else {
            System.out.print("Сожлеем, но ваши шансы очень малы. Вероятность сдать сессию ");
            System.out.printf("%.0f", Rating.counter / 6 * 100);
            System.out.print("%");
        }
    }
}
