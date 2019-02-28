package collections;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMap1
{ 
   public static void main(String args[]) 
   { 
       Map< String,Integer> hm =  
                        new HashMap< String,Integer>(); 
       hm.put("a", new Integer(100)); 
       hm.put("b", new Integer(200)); 
       hm.put("c", new Integer(300)); 
       hm.put("d", new Integer(400)); 
  
       // Returns Set view      
       Set set=hm.entrySet();   //converts into set
  
       Iterator itr=set.iterator();
       while(itr.hasNext())
       {
           System.out.println(itr.next()); 
           //System.out.println(); 
       }
      
   } 
}
