package CodeWar;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class SentenceSmash {
    /**
     * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence. You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word. Be careful, there shouldn't be a space at the beginning or the end of the sentence!
     */
    public static void main(String[] args) throws NullPointerException {

        System.out.println(SmashWords.smash());
        System.out.println(SmashWords.smash("Hello", "How", "are", "you"));
    }
}

class SmashWords {

    public static String smash2(String... words) throws NullPointerException {
        String newSentance = "";
        ArrayList<String> list2 = new ArrayList<>();
        if (words.length == 0) {
            return "";
        } else {
            Collections.addAll(list2, words);
            for (int a = 0; a < list2.size(); a++) {
                newSentance += list2.get(a);
                if (a == list2.size() - 1) {
                    continue;
                }
                newSentance += " ";
            }
//            newSentance = newSentance.replaceAll("null", "");
            System.out.println(newSentance);
            return newSentance;
        }
    }

    //чужое элегантное решение
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
