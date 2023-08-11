//c21012668
import java.util.ArrayList;
//divide and conquer algorithim
public class mergesort { //make p equal 0 and r equal array.length
  private static ArrayList<Integer> arrsize = new ArrayList<Integer>();
  private static int omega_counter = 0;// to get the length of array
  private static int counter = 0;
  private static ArrayList<Double> time = new ArrayList<Double>(); //measures time taken for each word to be sorted
  private  static ArrayList<Double> performance_time = new ArrayList<Double>(); //array to hold the words and the time it took to sort them
  private  static int swaps = 0; //counter to get number of swaps and moves that occur while sorting the elements
  private static double sum = 0; // stores the total running sum
public static ArrayList<String> mergeSort(ArrayList<String> GPT3) { //p is the index of first element in array
//System.out.println("Entered a mergeSort()");     //r is the index of last element in array
if(omega_counter == 0) {
int arsize = GPT3.size();
arrsize.add(arsize);
omega_counter++;
}
ArrayList<String> s = GPT3;
int p = 0;
int r = s.size()-1;
ArrayList<String> store = new ArrayList<String>();
if(r == 0 || r == -1) { //base case: if s has zero or one element, already sorted so return the array itself
  //System.out.println(s);
return s;
} else { //s has 2 or more elements (Divide phase)
  int q = (int) Math.floor(p+r/2);
  ArrayList<String> s1 = new ArrayList<String>(s.subList(p,q+1));
  ArrayList<String> s2 = new ArrayList<String>(s.subList(q+1,r+1));
  s.clear(); //remove all elements from s and assign them to sequences s1 and s2
  merge(mergeSort(s1),mergeSort(s2),s); //recursively sort s1 and s2 into a uniquely sorted sequence
}
if(s.size() == arrsize.get(0)) {
//performance_time(); //activates the function to calculate the performance time and gives number of swaps
}
return s;
}

public static ArrayList<String> merge(ArrayList<String> s1, ArrayList<String> s2, ArrayList<String> empty_s) { //s1 and s2 in ascending order and empty array s sorted
/* System.out.println("entered merge()");
  System.out.print("empty_s:");
  System.out.println(empty_s);
  System.out.print("s1:");
  System.out.println(s1);
  System.out.print("s2:");
  System.out.println(s2); */
  //int counter1 = 0;
  //int counter2 = 0;
//  System.out.println("in merge");
  for(int e1 = 0; e1 < s1.size(); e1++) {
    for(int e2 = 0; e1 < s2.size(); e2++) {
  /*    System.out.print("e1:");
      System.out.println(e1);
          System.out.print("e2:");
      System.out.println(e2);
      System.out.print("s1.size()-counter1:");
      System.out.println(s1.size()-e1);
      System.out.print("s2.size()-counter2:");
     System.out.println(s2.size()-e2); */

while( !( s1.size()-e1 == 0) && !( s2.size()-e2 == 0) ) { //as long as the size of the array minus the number of elements gone through is not 0

//  System.out.println("in first while loop");
//  System.out.print("e1 value before if statement: ");
//  System.out.println(s1.get(e1));
//  System.out.print("e2 value before if statement: ");
//  System.out.println(s2.get(e2));
//  System.out.println(s1.get(e1).compareTo(s1.get(e2)) > 0); //1 compare to 2 should be negative*****
double time1 = System.nanoTime();
    if(!(s1.get(e1).compareTo(s2.get(e2)) > 0)) { //if e1 <= e2

      empty_s.add(s1.get(e1));
      swaps++;
    //  System.out.print("Added e1 to empty_s: ");
    //  System.out.println(s1.get(e1));

      e1++;

    } else {
      empty_s.add(s2.get(e2));
      swaps++;
    //  System.out.print("Added e2 to empty_s: ");
    //  System.out.println(s2.get(e2));
      e2++;



}
double time2 = System.nanoTime();
counter++;
time.add(time2-time1); //gets the time required to sort one element and counts this as a swap/move
helper_time();

}
while(!(s1.size()-e1 == 0)) {
  double time1 = System.nanoTime();
  empty_s.add(s1.get(e1));
  double time2 = System.nanoTime();
  swaps++; //every time we move an element, we increment swaps
  counter++;
  time.add(time2-time1);
  helper_time();
  e1++;
  //System.out.println("s2 is empty");
}
while(!(s2.size()-e2 == 0)) {
  //  System.out.println(s2.size()-e2);
  double time1 = System.nanoTime();
  empty_s.add(s2.get(e2));
  swaps++;
  double time2 = System.nanoTime();
  counter++;
  time.add(time2-time1);
  helper_time();
  e2++;
  //System.out.println("s1 is empty, added s2 elements to empty_s");


}

}
}
//System.out.print("---------- empty_s after conversions:");
//System.out.println(empty_s);
return empty_s; //sequence returned in ascending order
}

public static void performance_time() { //measures the time taken to sort the elements

  for(int i=0;i < performance_time.size();i = i + 2) {
    double counter = performance_time.get(i);
    double sum = performance_time.get(i+1);
    System.out.print("Time taken to sort ");
    System.out.print((int)counter);
    System.out.print(" words(In nano seconds): ");
    System.out.println(sum);


}
System.out.println(""); //gives the number of swaps and moves
System.out.print("Number of moves/swaps while sorting elements is: ");
System.out.println(swaps);
System.out.println("");


}

public static void helper_time() { //this function adds the counter and sum of the times for printing
  for(int z=0; z <= arrsize.get(0); z = z+100 ) { //if counter is a multiple of 100
     //print out the time taken to sort the multiple of 100 words
  if(counter == z) {


  for(Double d : time) {
      sum += d;
    }
  performance_time.add((double)counter);
  performance_time.add(sum);
  }
  }

}

}
