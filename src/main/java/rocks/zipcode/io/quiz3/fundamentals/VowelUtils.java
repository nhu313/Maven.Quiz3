package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    private static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U',
                                                'a', 'e', 'i', 'o', 'u'};

    public static Boolean hasVowels(String word) {
        for(int i = 0; i < VOWELS.length; i++) {
            if(word.contains(VOWELS[i].toString())) {
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i = 0; i < word.length(); i++) {
            Character c = word.charAt(i);
            if (isVowel(c)) {
                return i;
            }
        }
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        for(int i = 0; i < VOWELS.length; i++) {
            if(character == VOWELS[i]) {
                return true;
            }
        }
        return false;
    }
}
