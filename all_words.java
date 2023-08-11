//c21012668
//returns an array list of all words in the GPT3.txt
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class all_words {
  private Scanner in;
  private String file_name;
  private ArrayList<String> allwords;

public all_words(String file) {
file_name = file;
allwords = new ArrayList<String>();

}

public ArrayList<String> allWordsArray() {
  try{
  in = new Scanner(new File(file_name));
  while(in.hasNextLine()) {
    allwords.add(in.nextLine());
  }

  } catch(Exception e) {
    System.out.println(e);
  }
  return allwords;
}





}
