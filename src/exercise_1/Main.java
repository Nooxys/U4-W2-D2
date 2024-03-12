package exercise_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class Main {


    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Set<String> words = new HashSet<>();
        List<String> duplicateWords = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        logger.info("Specificate how many words u wish to insert!");
        int howManyWords = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < howManyWords; i++) {
            logger.info("add a word!");
            String wordSet = scanner.nextLine();

            boolean listWords = words.add(wordSet);
            if (!listWords) {
                duplicateWords.add(wordSet);
            }

        }


        logger.info("same words: " + duplicateWords);
        logger.info("there are " + words.size()
                + " unique words");
        logger.info("unique words: " + words);

    }

}


