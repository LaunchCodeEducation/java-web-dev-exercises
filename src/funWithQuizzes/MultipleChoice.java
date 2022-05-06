package funWithQuizzes;

import java.util.ArrayList;

public class MultipleChoice extends Questions{
    private ArrayList<String> choices = new ArrayList<>();


    public MultipleChoice(String question, String correctAnswer,ArrayList<String> choices) {
        super(question, correctAnswer);
        this.choices = choices;
    }
}
