package supaiTech;

public class LovePercentageCalculator {

    public static void main(String[] args) {
        int lovePercentage = calculateLovePercentage("Kausar", "Rozy");
        System.out.println("Love percentage between Kausar and Rafiqun is: " + lovePercentage + "%");
    }

    private static int calculateLovePercentage(String name1, String name2) {
        int totalScore = calculateNameScore(name1) + calculateNameScore(name2);
        int maxPossibleScore = 26 * Math.min(name1.length(), name2.length()); // Assuming all letters from A to Z appear at least once in each name

        // Calculate the percentage
        int percentage = (totalScore * 100) / maxPossibleScore;

        // Cap the percentage at 100%
        return Math.min(percentage, 100);
    }

    private static int calculateNameScore(String name) {
        int score = 0;
        for (char c : name.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                score += c - 'A' + 1; // Assuming A=1, B=2, ..., Z=26
            }
        }
        return score;
    }
}


