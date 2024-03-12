package exercise_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static Map<String, Integer> adressBook = new HashMap<>();
    private static Logger logger = LoggerFactory.getLogger(exercise_2.Main.class);

    public static void main(String[] args) {


//        adressBook.put("firstGuy", 333333333);
//        adressBook.put("secondGuy", 344444444);
//        adressBook.put("thirdGuy", 344444445);
//        adressBook.put("fourthGuy", 344446666);
//        adressBook.put("fifthGuy", 344447777);
//        adressBook.remove("secondGuy");
//        logger.info(adressBook.toString());
////        adressBook.get("fistGuy");
//        logger.info(adressBook.values().toString());
//
//
//        System.out.println(adressBook.get("firstGuy"));
//
//        Set<String> keys = adressBook.keySet();
//        for (String key : keys) {
//            logger.info("key : " + key);
//            logger.info("value : " + adressBook.get(key));
//        }
        addPerson("firstGuy", 333333333);
        addPerson("secondGuy", 333333334);
        addPerson("thirdGuy", 333333335);
        addPerson("fourthGuy", 333333336);
        addPerson("fifthGuy", 333333337);
        removePerson("fifthGuy");
        
        searchNumbers(333333334);
        printAdressBook();
    }

    public static void addPerson(String name, int number) {
        adressBook.put(name, number);
    }

    public static void removePerson(String name) {
        adressBook.remove(name);
    }

    public static void searchPerson(int number) {

    }

    public static void searchNumbers(int number) {
        String name = String.valueOf(adressBook.get(number));
    }

    public static void printAdressBook() {
        Set<String> keys = adressBook.keySet();
        for (String key : keys) {
            logger.info("Person : " + key + "  Number: " + adressBook.get(key));

        }
    }
}