package collections;

//import java.util.Arrayset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();//Creating set  
		  set.add("Prashant");//Adding object in set  
		  set.add("Venkatesh");  
		  set.add("Sovan");  
		  set.add("Pankaj");  
		  //Traversing set through Iterator
		  System.out.println(set);
		  System.out.println();
		  Iterator itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());
		  }
		   System.out.println();
		   for(String obj:set)
		   
			   System.out.println(obj);

	}

}
