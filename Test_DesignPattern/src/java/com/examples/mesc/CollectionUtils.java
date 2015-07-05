/**
 * 
 */
package com.examples.mesc;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


/**
 * @author kumark
 *
 */
public class CollectionUtils <T , K>{
	
    T type;
    K key;
	
    public CollectionUtils () {
    	
    }
	@SuppressWarnings("unchecked")
	public T getCollectionObject(K k){
		
		
		key = k;
		
		/*String str1  = new String("Kanchan");
		String str2  = new String("Kanchan");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));*/
		
		boolean b  = (k.getClass().getSimpleName().equals(CollectionEnum.String.toString()));
		System.out.println(b);
		System.out.println(k.getClass().getSimpleName());
		System.out.println(CollectionEnum.String.toString());
		
		System.out.println();
	
		
		if(k.getClass().getSimpleName().equals(CollectionEnum.String.toString())){
			
		}
		if(k.getClass().getSimpleName().equals(CollectionEnum.String.toString())){
					
		}
		if(k.getClass().getSimpleName().equals(CollectionEnum.String.toString())){
			
		}
	    List<K> listK = new ArrayList<K>();
	    listK.add(k);	    
		type = (T)listK;		
		return this.type;
	}
	
	public enum CollectionEnum{
		String,List,Map
	}

}


