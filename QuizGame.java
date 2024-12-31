import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Quiz questions and correct answers
        String[] questions = {
            "1. What is the capital of France? (a) Berlin (b) London (c) Paris (d) Rome",
            "2. Who wrote 'To Kill a Mockingbird'? (a) Harper Lee (b) Mark Twain (c) J.K. Rowling (d) Charles Dickens",
            "3. What is 5 + 7? (a) 10 (b) 11 (c) 12 (d) 13",
            "4. Which planet is known as the Red Planet? (a) Earth (b) Mars (c) Venus (d) Jupiter",
            "5. What is the square root of 16? (a) 2 (b) 3 (c) 4 (d) 5"
        };
        char[] answers = {'c', 'a', 'c', 'b', 'c'}; // Correct answers for each question

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char answer = scanner.next().charAt(0);

            // Check if answer is correct
            if (answer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
              System.out.println("Incorrect.");
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz completed! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}