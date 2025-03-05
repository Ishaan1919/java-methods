import java.util.Random;

public class FootballTeam {

    public static int[] generatePlayerHeights(int size) {
        Random random = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + random.nextInt(101); // Generates height between 150 and 250 cm
        }
        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            min = Math.min(min, heights[i]);
        }
        return min;
    }

    public static int findTallestHeight(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            max = Math.max(max, heights[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int teamSize = 11;
        int[] heights = generatePlayerHeights(teamSize);

        System.out.print("Player heights: ");
        for (int height : heights) {
            System.out.println(height + " cm ");
        }

        System.out.printf("Mean Height: %.2f cm\n", findMeanHeight(heights));
        System.out.println("Shortest Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(heights) + " cm");
    }
}
