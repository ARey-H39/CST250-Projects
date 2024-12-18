package src.TestScores;

public class TestScores {
    // Declare fields
    private double[] scores;

    // Constructor
    public TestScores(double[] scores) {
        this.scores = scores;
    }

    // Accessor and modifier for private field
    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    // Method to determine average score
    public double average() throws IllegalArgumentException {
        // Checks for any illegal arguments
        for (int i = 0; i < scores.length; i++) {
            // Throwa exception if an input is less than 0
            if(scores[i] < 0) throw new IllegalArgumentException("Negative number found.\nAverage cannot be calculated.");
            // Throws an exception if a number greater than 100 is found
            if(scores[i] > 100) throw new IllegalArgumentException("Number greater than 100 found.\nAverage cannot be calculated.");
        }

        // Calculate average and return it
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return sum / scores.length;
    }
}
