/**
 * 
 */
package com.examples.collections;

/**
 * @author kumark
 *
 */
import java.util.*;

import org.json.JSONException;
import org.json.JSONObject;

public class TreeMapExample{
public static void main(String[] args) {
System.out.println("Tree Map Example!\n");
TreeMap <String, String>tMap = new TreeMap<String, String>();
//Addding data to a tree map
tMap.put("Bas", null);
tMap.put("one", "Saturday");
tMap.put("two", "Friday");
tMap.put("three", "AUGDAY");
tMap.put("four", "Monday1");
tMap.put("five", "MyDay");
tMap.put("six", "YourDay");
tMap.put("seven", "HisDay");
tMap.put("nine", "HerDay");



HashMap <String, String>hMap = new HashMap<String, String>();


hMap.put("one", "Saturday");
hMap.put("two", "Friday");
hMap.put("three", "AUGDAY");
hMap.put("four", "Monday1");
hMap.put("five", "MyDay");
hMap.put("six", "YourDay");
hMap.put("seven", "HisDay");
hMap.put("nine", "HerDay");
//hMap.putAll(tMap);
//tMap.putAll(hMap);
hMap.put(null,null);

System.out.println("DATA tMAP::: " + tMap.toString());
System.out.println("DATA hMAP::: " + hMap.toString());

JSONObject jsonObject = new JSONObject(tMap);
try {
	JSONObject jsonObject1 = new JSONObject("{'1'='one' , '2' = 'two'}");
	System.out.println("DATA jsonObject1::: " + jsonObject1.toString());
} catch (JSONException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

System.out.println("DATA JSON Object::: " + jsonObject.toString());
System.out.println("--------------------------------------------------------------");

//Rerieving all keys
System.out.println("Keys of tree map: " + tMap.keySet());
System.out.println("Keys of hash map: " + hMap.keySet());
//Rerieving all values
System.out.println("Values of tree map: " + tMap.values());
//Rerieving the value from key with key number 5
System.out.println("Key: 5 value: " + tMap.get(5)+ "\n");
//Rerieving the First key and its value
System.out.println("First key: " + tMap.firstKey() + " Value: " 
+ tMap.get(tMap.firstKey()) + "\n");
//Rerieving the Last key and value
System.out.println("Last key: " + tMap.lastKey() + " Value: " 
+ tMap.get(tMap.lastKey()) + "\n");
//Removing the first key and value
System.out.println("Removing first data: " 
+ tMap.remove(tMap.firstKey()));
System.out.println("Now the tree map Keys: " + tMap.keySet());
System.out.println("Now the tree map contain: " 
+ tMap.values() + "\n");
//Removing the last key and value
System.out.println("Removing last data: " 
+ tMap.remove(tMap.lastKey()));
System.out.println("Now the tree map Keys: " + tMap.keySet());
System.out.println("Now the tree map contain: " + tMap.values());
}
}
