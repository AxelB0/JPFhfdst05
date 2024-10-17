package be.vdab.jpfhfdst5;

public class StudentScores {
    public static void main(String[] args) {
        float[] scores = new float[]{8, 6, 9, 4};
        float averageScore = 0;
        System.out.println(scores.length + " scores found");
        for (float f : scores) {
            System.out.printf(f + " ");
            averageScore += f;
        }
        System.out.println();

        averageScore /= scores.length;
        System.out.println("Average is: " + averageScore);
        System.out.println("Percentage is: " + averageScore * 10 + "%");

    }
}
