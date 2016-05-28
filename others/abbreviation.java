/**
 * Consider the following style of abbreviation:
 *   "internationalization" -> "i18n",
 *   "localization" -> "l10n", etc.
 *
 * Such abbreviations are not always unique -- for example, “a11y” could
 * stand for “accessibility”, “automatically”, etc.
 *
 * Given a word and a dictionary (given as a list of words), determine if
 * the abbreviation of the word is unique. The lookup needs be O(1)
 *
 * example:
 * mouse   m3e
 * maine   m3e
 * micros  m4s
 * automatically  a11y
 * accessibility  a11y
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Abbreviation {
  private Map<String, List<String>> abbrevMap = new HashMap<String, List<String>>();

  public Abbreviation(String[] dictionary) {
    populateAbbrevMap(dictionary);
  }

  private void populateAbbrevMap(String[] dictionary) {
    for (String word : dictionary) {
      insertAbbrev(word);
    }
  }

  public String insertAbbrev(String word) {
    String abbrev = getAbbrev(word);
    List<String> words = abbrevMap.get(abbrev);

    if (words == null) words = new LinkedList<String>();
    words.add(word);

    abbrevMap.put(abbrev, words);

    return word;
  }

  public String getAbbrev(String word) {
    if (word == null) return null;

    int length = word.length();
    if (length < 3) return word;

    return word.charAt(0) + Integer.toString(length - 2) + word.charAt(length - 1);
  }

  public boolean isUnique(String word) {
    String abbrev = getAbbrev(word);
    List<String> words = abbrevMap.get(abbrev);

    return words.size() == 1;
  }

  public static void main (String[] args) {
    String[] dictionary = {"mouse", "maine", "micros", "automatically", "accessibility"};
    Abbreviation ab = new Abbreviation(dictionary);

    for (String word : dictionary) {
      System.out.println(word + "'s abbrev '" + ab.getAbbrev(word) + "' is unique? " + ab.isUnique(word));
    }
  }
}
