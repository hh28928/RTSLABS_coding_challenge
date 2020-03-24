/**
 * #``1  Print the number of integers in an array that are above the given input and the number that are below,
 * e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.
 */
public class AboveBelow {
    /**
     * Following solution loops through an array and checks if the number is small than the target number or larger than
     * Based on the check it increases the counter.
     * @param array
     * @param numb
     * @return
     */
    public static String aboveOrBelow(int[] array, int numb) {
        int below = 0;
        int above = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < numb) {
                below++;
            } else {
                above++;
            }
        }
        return "Above: " + above + " Below: " + below;
    }

    public static void main(String[] args) {
        String test1 = aboveOrBelow(new int[]{1, 5, 2, 1, 10, 50, 10, 10, 5, 2, 1, 3, 4}, 6);
        System.out.println(test1);
        String test2 = aboveOrBelow(new int[]{1, 5, 2, 1, 10, 50, 10, 3, 4}, 7);
        System.out.println(test2);
    }
}