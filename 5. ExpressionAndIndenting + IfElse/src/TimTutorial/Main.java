package TimTutorial;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Score: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Score: " + highScore);

        int position = calculatePosition(1500);
        displayPosition("Joe", position);

        position = calculatePosition(900);
        displayPosition("Steve", position);

        position = calculatePosition(400);
        displayPosition("Abby", position);

        position = calculatePosition(50);
        displayPosition("Tim", position);

        position = calculatePosition(-1);
        displayPosition("Frank", position);
    }

    public static void displayPosition(String playerName, int position) {
        System.out.println(playerName + " got in position " + position + " on the Leaderboard");
    }

    public static int calculatePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
//        int position = 4;
//        if (score >= 1000) {
//            position = 1;
//        } else if (score >= 500) {
//            position = 2;
//        } else if (score >= 100) {
//            position = 3;
//        }
//        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
