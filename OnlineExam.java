
public class OnlineExam {

    public static void main(String[] args) {
        System.out.println("Online Examination System");
        System.out.println("1. View Examinations");
        System.out.println("2. Start Examination");
        System.out.println("3. View Results");
    }

    public static int calculateScore(int correctAnswers) {
        return correctAnswers;
    }
    
    public static boolean isPassing(int score) {
        return score >= 40;
    }

}
