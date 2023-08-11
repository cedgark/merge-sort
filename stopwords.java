//c21012668
//returns an arraylist of stop words
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class stopwords {
  private Scanner in;
  private String file_name;
  private ArrayList<String> stopwords;

public stopwords(String file) {
file_name = file;
stopwords = new ArrayList<String>();

}

public ArrayList<String> stopWordsArray() {
  try{
  in = new Scanner(new File(file_name));
  while(in.hasNextLine()) {
    stopwords.add(in.nextLine());
  }

  } catch(Exception e) {
    System.out.println(e);
  }
  return stopwords;
}





}
