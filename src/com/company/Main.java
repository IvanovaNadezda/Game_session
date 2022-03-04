package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Question question1 = new Question();
        question1.setTitle("Как давно вы начали готовить к сессии?");
        Answer[] answer1 = {
                new Answer("1 - Ещё не начинал"),
                new Answer("2 - Готовлюсь уже давно")};
        question1.setAnswer(answer1);
        question1.setCorrect(1);

        Question question2 = new Question();
        question2.setTitle("А вы старательный ученик?");
        Answer[] answer2 = {
                new Answer("1 - Да"),
                new Answer("2 - Нет")};
        question2.setAnswer(answer2);
        question2.setCorrect(0);

        Question question3 = new Question();
        question3.setTitle("Вы усердно работали в течение года?");
        Answer[] answer3 = {
                new Answer("1 - Да"),
                new Answer("2 - Нет")};
        question3.setAnswer(answer3);
        question3.setCorrect(0);

        Question question4 = new Question();
        question4.setTitle("Как вы думаете, преподаватели будут мягко оценивать ваши знания?");
        Answer[] answer4 = {
                new Answer("1 - Да"),
                new Answer("2 - Нет")};
        question4.setAnswer(answer4);
        question4.setCorrect(1);

        Question question5 = new Question();
        question5.setTitle("Много ли времени вы уделяете учёбе?");
        Answer[] answer5 = {
                new Answer("1 - Да"),
                new Answer("2 - Нет")};
        question5.setAnswer(answer5);
        question5.setCorrect(0);

        Question question6 = new Question();
        question6.setTitle("Ходите на какие-то дополнительные секции или занятия?");
        Answer[] answer6 = {
                new Answer("1 - Да"),
                new Answer("2 - Нет")};
        question6.setAnswer(answer6);
        question6.setCorrect(1);

        ArrayList<Question> questions = new ArrayList<>();
        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        questions.add(question6);

        Session session = new Session("Пытаемся понять, получится ли сдать сессию", questions);
        session.start();
    }
}
