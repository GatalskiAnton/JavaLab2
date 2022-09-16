import java.util.*;

public class Task13 {
    public static ArrayList<Integer> getRandomArrayList() {
        Random random = new Random();

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 50; ++i)
            arr.add(i);

        for (int i = 0; i < 6; ++i) {
            int currentIndex = random.nextInt(50 - (i + 1));
            randomNumbers.add(arr.get(currentIndex));
            arr.set(currentIndex, 0);
            ArrayList<Integer> newArr = new ArrayList<>();
            for (int j = 0; j < 50 - (i + 1); ++j) {
                if (arr.get(j) != 0)
                    newArr.add(arr.get(j));
            }
            arr = newArr;
        }
        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public static int[] getRandomArray() {
        Random random = new Random();
        int[] randomNumbers = new int[6];

        int[] range = new int[49];

        for (int i = 0; i < 49; ++i)
            range[i] = i + 1;

        for (int i = 0; i < 6; ++i) {
            int currentIndex = random.nextInt(50 - (i + 1));
            randomNumbers[i] = range[currentIndex];
            range[currentIndex] = 0;
            int[] newRange = new int[49 - (i + 1)];
            int k = 0;
            for (int j = 0; j < 50 - (i + 1); ++j) {
                if (range[j] != 0) {
                    newRange[k++] = range[j];
                }
            }
            range = newRange;
        }
        Arrays.sort(randomNumbers);
        return randomNumbers;
    }
}
