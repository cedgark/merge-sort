//c21012668
//validates the words and filters out unimportant words
import java.util.Scanner;
import java.util.ArrayList;
public class validator {
  private Scanner in;
  private ArrayList<String> allwords;
  private ArrayList<String> no_punct_words;
  private ArrayList<String> skip_words;
  private ArrayList<String> imp_words;

public validator(ArrayList<String> all_words, ArrayList<String> skipwords) {
allwords = new ArrayList<String>();
skip_words = new ArrayList<String>();
allwords.addAll(all_words);
skip_words.addAll(skipwords);
no_punct_words = new ArrayList<String>();
imp_words = new ArrayList<String>();
}

public String remove_punct(String text) { //Code bit recycled from cm1101 game function we created
    String no_punct = "";   //removes punctuations from text
    String punctuation = "!“”#$%&\'()*+,-./:;<=>?@[\\]^_`{|}~-";
    for (int i=0;i < text.length();i++) {
      String c = "" + text.charAt(i);

      if (!(punctuation.contains(c))) {
        no_punct = no_punct + c;
      }
    }


    return no_punct;
}

public void normalise_input(String text) { //generates an array with no punctuations using for loop
  //split words based on Spaces
  //then use those words and loop with them to remove punctuation and whitespace
  String[] parts = text.split(" ");

  for(String charact:parts) {


      if(charact.isBlank()) {
        continue;
      }



    String no_punct = remove_punct(charact);

    no_punct = no_punct.replaceAll(" ", "");
      //System.out.println(no_punct);
    no_punct_words.add(no_punct); //adds the text to an array


  }


}

public ArrayList<String> getno_punct_array() {

return no_punct_words;
}


public void removeStopwords(ArrayList<String> GPT3, ArrayList<String> stopwords) {

for(String word: GPT3) {
if (!(stopwords.contains(word.toLowerCase()))) {
imp_words.add(word);
}

}


}

public ArrayList<String> get_imp_words_array() {

return imp_words;
}

}
