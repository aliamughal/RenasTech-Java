package studyHall;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 3, 4, 5, 5, 5, 55, 6, 6, 67, 8, 8, 0};

        for (int each : arr) {

            int count = 0; // for the frequency of the numbers in the err

            for (int a : arr) { // for counting the frequency of the numbers
                if (a == each) {
                    count++;

                }
            }
            if (count == 1) { // if it's unique
                System.out.println(each);
            }
        }
    }
}
