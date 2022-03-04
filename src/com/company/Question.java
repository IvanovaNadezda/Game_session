package com.company;

public class Question {
    private String title;
    private Answer[] answer;
    private int correct;
    private int correct1;
    private int correct2;
    private int correct3;
    private int correct4;

    public int getCorrect2() {
        return correct2;
    }

    public void setCorrect2(int correct2) {
        this.correct2 = correct2;
    }

    public int getCorrect3() {
        return correct3;
    }

    public void setCorrect3(int correct3) {
        this.correct3 = correct3;
    }

    public int getCorrect4() {
        return correct4;
    }

    public void setCorrect4(int correct4) {
        this.correct4 = correct4;
    }

    public int getCorrect1() {
        return correct1;
    }

    public void setCorrect1(int correct1) {
        this.correct1 = correct1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Answer[] getAnswer() {
        return answer;
    }

    public void setAnswer(Answer[] answer) {
        this.answer = answer;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
}
class Answer{
    private String text;

    public Answer(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
