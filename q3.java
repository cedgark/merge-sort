//c21012668
import java.util.ArrayList;
public class q3 {
  public static void main(String[] args) {
  all_words all_words = new all_words("GPT3.txt");
  stopwords stop = new stopwords("stopwords.txt");
  ArrayList<String> words = all_words.allWordsArray();
  //System.out.println(words);
  ArrayList<String> stopwords = stop.stopWordsArray();
  validator validat = new validator(words,stopwords);
  for(String word: words) {
    validat.normalise_input(word);
  }
  ArrayList<String> no_punct_words = validat.getno_punct_array();
  validat.removeStopwords(no_punct_words,stopwords);
  ArrayList<String> imp_words = validat.get_imp_words_array();
  //System.out.println(imp_words);
  System.out.println(mergesort.mergeSort(imp_words));

}
}
