package funWithQuizzes;

import java.util.ArrayList;

public class TrueFalse extends Questions {
    private ArrayList<String> choices = new ArrayList<>();


    public TrueFalse(String question, String correctAnswer,ArrayList<String> choices) {
        super(question, correctAnswer);
        this.choices = choices;
    }
}
