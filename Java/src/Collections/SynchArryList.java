package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchArryList {
  public static void main(String[] args) {
    ArrayList arrayList = new ArrayList();
    arrayList.add("abc");
    arrayList.add("def");
    arrayList.add("ghi");
    List list = Collections.synchronizedList(arrayList);
    System.out.println(list);
    System.out.println(arrayList);
  }
}