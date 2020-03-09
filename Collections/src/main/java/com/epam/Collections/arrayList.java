package com.epam.Collections;

import java.util.Arrays;

public class arrayList<G> {
	
	int asize = 0;
    private Object array[];
	private final int fsize=10;
    
    public arrayList() 
    {
    	array = new Object[fsize];
       for(int i=0;i<fsize;i++)
       {
    	   array[asize++] = 2*i+1;
       }
   }
    
   public int size() 
   {
       return asize;
   }

   public void add(G val) 
   {
       if (asize == array.length) 
       {
    	   int newSize = array.length * 4;
	       array = Arrays.copyOf(array, newSize);
       }
       array[asize++] = val;
   }
   
   public void print()
   {
	   for(int i=0;i<asize;i++)
	   {
		   System.out.println(array[i]);
	   }
   }
   
   public G get(int position) 
   {
	   if (position < asize && position > 0)
	   {
		   return (G) array[position-1];
	   }
	   else
	   {
		   System.out.println(position+" out of boundary Exception");
	   }
	   return null;
   }
    
   public G remove(int position) 
   {
	   Object item = null;
	   if (position < asize && position > 0) 
	   {
		   item = array[position];
	       int delete = array.length - ( position + 1 ) ;
	       System.arraycopy( array, position + 1, array, position, delete ) ;
	       asize--;		   	       
	   }		   
	   else
	   {
		   System.out.println(position+" out of boundary Exception");
	   }
	   return (G) item;
   }
}
