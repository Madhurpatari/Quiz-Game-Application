import java.util.List;
public class Main {
    public static void main(String[] args) {
        Question q1 = new Question("What is the capital of France?",
                List.of("Paris", "Berlin", "Madrid", "London"), "Paris");
        Question q2 = new Question("What is the largest planet in our solar system?",
                List.of("Mars", "Jupiter", "Saturn", "Venus"), "Jupiter");
        Question q3 = new Question("Who wrote the novel 'To Kill a Mockingbird'?",
                List.of("John Steinbeck", "Harper Lee", "Ernest Hemingway", "F. Scott Fitzgerald"), "Harper Lee");
        List<Question> questions = List.of(q1, q2, q3);
        Quiz quiz = new Quiz("General Knowledge", questions);
        System.out.println("Welcome to " + quiz.getQuizName() + " quiz!");
        quiz.takeQuiz();
    }
}