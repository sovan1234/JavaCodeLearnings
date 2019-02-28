package collections;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayList1{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Sovan");  
  list.add("Pankaj");  
  //Traversing list through Iterator
  System.out.println(list);
  System.out.println();
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());
  }
   System.out.println();
   for(String obj:list)
   
	   System.out.println(obj);
   
 }  
}
