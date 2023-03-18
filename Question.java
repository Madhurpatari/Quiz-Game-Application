
import java.util.List;

class Question {
    private String question;
    private List<String> answerChoices;
    private String correctAnswer;

    public Question(String question, List<String> answerChoices, String correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswerChoices() {
        return answerChoices;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
