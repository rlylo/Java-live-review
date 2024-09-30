package week09;

public class QuizArray {
    public static void main(String[] args) {
        boolean[] quizResult = {true, true, true, false, true, false, true, true, true, false};

        //check if PASS or FAIL. PASS - >= 7 correct answers otherwise fail
        int counter = 0;
        for (boolean questionResult : quizResult) {
            if (questionResult) {
                counter++;
            }

        }
        if (counter >= 7) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

    }
}
