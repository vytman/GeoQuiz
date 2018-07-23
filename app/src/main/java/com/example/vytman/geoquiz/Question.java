package com.example.vytman.geoquiz;

public class Question {

    private int mTextResID;
    private boolean mAnswerTrue;
    private boolean mAlreadyAnswered;

    public Question(int textResId, boolean answerTrue) {
        mTextResID = textResId;
        mAnswerTrue = answerTrue;
        mAlreadyAnswered = false;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAlreadyAnswered() {
        return mAlreadyAnswered;
    }

    public void setAlreadyAnswered(boolean alreadyAnswered) {
        mAlreadyAnswered = alreadyAnswered;
    }
}
