import java.util.HashMap;

public class Numericals {
    public static String of(String input) {
        HashMap<Character, Integer> character_occurrences = new HashMap<Character, Integer>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = getCharacterOccurrencesInString(input, character_occurrences, result, i);
        }
        return result;
    }

    private static String getCharacterOccurrencesInString(String input, HashMap<Character, Integer> character_occurrences, String result, int i) {
        if (!character_occurrences.containsKey(input.charAt(i))) {
            character_occurrences.put(input.charAt(i), 1);
            result += "1";
        } else {
            character_occurrences.put(input.charAt(i), character_occurrences.get(input.charAt(i)) + 1);
            result += character_occurrences.get(input.charAt(i));
        }
        return result;
    }
}
