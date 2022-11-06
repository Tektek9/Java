public class RootMeanSquare {
 
    public static double rootMeanSquare(double... nums) {
        double sum = 0.0;
        for (double num : nums)
            sum += num * num;
        return Math.sqrt(sum / nums.length);
    }
 
    public static void main(String[] args) {
        double[] nums = {1, 4, 5, 7, 8,};
        System.out.println("The RMS of the numbers from 1 to 10 is " + rootMeanSquare(nums));
    }
}