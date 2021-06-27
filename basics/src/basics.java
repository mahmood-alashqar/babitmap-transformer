import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class basics {
    public static void main(String[] args) {
        String word = "";
        int dogCount = 1;

        System.out.println("I own " + dogCount + " " + pluralize(word, dogCount) + ".");
        flipNHeads(6);
        clock();
    }

    public static String pluralize(String word, int num) {
        if (num == 0 || num > 1) {
            return (word + "s");
        } else {
            return word;
        }

    }

    public static void flipNHeads(int n) {
        int headCount = 0;
        int headsMax = 0;
        int[] arr = {};
        for (int i = 0; i < n; i++) {
            if (Math.random() < 0.5) {
                System.out.println("tails");
                if (headCount > headsMax) {
                    headsMax = headCount;
                    headCount = 0;
                }
            } else {
                System.out.println("heads");
                headCount++;
            }
        }
        System.out.println("It took " + n + " flips to flip " + Math.max(headCount, headsMax) + " head in a row.");
    }


    public static void clock() {
        int currentSec = 0;
        for (int i = 0; i >= 0; i++) {
            LocalDateTime now = LocalDateTime.now();
            int second = now.getSecond();
            if (currentSec != second) {
                currentSec=second;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

                System.out.println(time);
            }

        }


    }

}
