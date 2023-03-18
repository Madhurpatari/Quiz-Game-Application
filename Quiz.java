import java.util.*;

@SuppressWarnings("all")
class Quiz {
    private String quizName;
    private List<Question> questions;
    private int score;

    public Quiz(String quizName, List<Question> questions) {
        this.quizName = quizName;
        this.questions = questions;
        this.score = 0;
    }

    public String getQuizName() {
        return quizName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score++;
    }

    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            List<String> answerChoices = new ArrayList<>(question.getAnswerChoices());
            Collections.shuffle(answerChoices);
            for (int i = 0; i < answerChoices.size(); i++) {
                System.out.println((i+1) + ") " + answerChoices.get(i));
            }
            int answer = scanner.nextInt();
            if (answer == answerChoices.indexOf(question.getCorrectAnswer())+1) {
                System.out.println("Correct!");
                increaseScore();
            } else {
                System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer());
            }
        }
        System.out.println("Your score is " + getScore() + " out of " + questions.size());
    }
}