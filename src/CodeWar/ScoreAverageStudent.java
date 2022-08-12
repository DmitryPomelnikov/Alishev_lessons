package CodeWar;

public class ScoreAverageStudent {
    /**
     * There was a test in your class and you passed it. Congratulations!
     * But you're an ambitious person. You want to know if you're better than the average student in your class.
     * You receive an array with your peers' test scores. Now calculate the average and compare your score!
     * Return True if you're better, else False!
     */

    public static void main(String[] args) {
        int[] example1 = {2, 3};
        int[] example2 = {100, 40, 34, 57, 29, 72, 57, 88};
        int[] example3 = {12, 23, 34, 45, 56, 67, 78, 89, 90};
        int[] example4 = {100, 90};
        System.out.println(AvarageScore.betterThanAverage(example1, 5));
        System.out.println(AvarageScore.betterThanAverage(example2, 75));
        System.out.println(AvarageScore.betterThanAverage(example3, 69));
        System.out.println(AvarageScore.betterThanAverage(example4, 11));
    }
}

class AvarageScore {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int scoreClass = 0;
        for (int i = 0; i < classPoints.length; i++) {
            scoreClass += classPoints[i];
        }
        return yourPoints > scoreClass / classPoints.length;
    }
}
