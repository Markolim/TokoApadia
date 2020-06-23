package collections.shoppingcart;

import java.util.Objects;

/**
 *
 * @author Varun Shrivastava (vslala)
 */

//fungsi
//untuk
//menambah
//requst
import java.util.*;
class request implements  Comparator{
   public int compare(Object a,Object b){
     String astr,bstr;
     astr=(String) a;
     bstr=(String) b;
     return bstr.compareTo(astr);
  }
}

class request1{
  public static void main(String args[]){
   TreeSet ts=new TreeSet(new comparecl());

   ts.add("c");
   ts.add("b");
   ts.add("f");
   ts.add("d");

   Iterator i=ts.iterator();
   while(i.hasNext()){
     Object obj=i.next();
     System.out.print(obj+" ");
   }
   System.out.println();
 }
}
