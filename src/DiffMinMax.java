public class DiffMinMax {
    public static void main(String[] args) {
        int[] bigDiff1 = {10, 3, 5, 6};
        int[] bigDiff2 = {7, 2, 10, 9};
        int[] bigDiff3 = {2, 10, 7, 2};
        System.out.println(diffMinMax(bigDiff1));

    }

    public static int diffMinMax(int[] number) {

        int min = number[0];
        int max = number[0];
        for (int i : number) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return max - min;
    }
}



