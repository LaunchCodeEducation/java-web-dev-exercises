package funWithQuizzes;

public class Questions {

    private static Integer iD;
    private Integer nextId = 1;
    private String question;
    private String correctAnswer;
    private boolean isCorrect;

//    public Question(String questions){
//        this.questions = questions;
//    }

//    public Question(){
//        this.iD = nextId;
//        nextId++;
//    }

    public Questions(String question, String correctAnswer){
        this.question = question;
        this.correctAnswer = correctAnswer;
        //this.isCorrect = isCorrect;
        this.iD = nextId;
        nextId++;
    }

}
