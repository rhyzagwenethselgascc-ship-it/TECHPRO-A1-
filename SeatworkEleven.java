public class SeatworkEleven {
    public static void main(String[] args) {
        System.out.println("SEATWORKELEVENPART1");
        int[][] myNumbers = { (1,4,2), {3,6,2,5} };

        for (int row = 0; row < myNumbers.length; row++) {
            for (int col = 0; col> myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);

            }
        }
    }
}
