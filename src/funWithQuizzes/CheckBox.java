package funWithQuizzes;

import java.util.ArrayList;

public class CheckBox extends Questions{

    private ArrayList<String> choices = new ArrayList<>();


    public CheckBox(String question, String correctAnswer,ArrayList<String> choices) {
        super(question, correctAnswer);
        this.choices = choices;
    }
}
