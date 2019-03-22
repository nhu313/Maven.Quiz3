package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String newWord = null;
            if (VowelUtils.startsWithVowel(word)) {
                newWord = word + "way";
            } else {
                Integer vowelIndex = VowelUtils.getIndexOfFirstVowel(word);
                if (vowelIndex == null) {
                    newWord = word + "ay";
                } else {
                    String beginning = word.substring(0, vowelIndex);
                    String ending = word.substring(vowelIndex);
                    newWord = ending + beginning + "ay";
                }
            }
            words[i] = newWord;
        }


        return String.join(" ", words);
    }
}
