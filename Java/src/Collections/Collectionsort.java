package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsort {

  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("5");
    arrayList.add("3");
    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("4");
    Collections.sort(arrayList);
    Collections.reverse(arrayList);

    for (String str: arrayList)
      System.out.println(str);
  }
}