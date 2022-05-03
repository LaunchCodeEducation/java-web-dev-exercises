package funWithQuizzes;

public class Question {

    private static Integer iD;
    private Integer nextId = 1;
    private String questions;
    private String correctAnswer;
    private boolean isCorrect;

//    public Question(String questions){
//        this.questions = questions;
//    }

//    public Question(){
//        this.iD = nextId;
//        nextId++;
//    }

    public Question(String questions, String correctAnswer, boolean isCorrect){
        this.questions = questions;
        this.correctAnswer = correctAnswer;
        this.isCorrect = isCorrect;
        this.iD = nextId;
        nextId++;
    }
}
