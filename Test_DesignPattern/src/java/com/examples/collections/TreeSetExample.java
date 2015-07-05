/**
 * 
 */
package com.examples.collections;

/**
 * @author kumark
 *
 */
import java.util.*;

public class TreeSetExample{
  public static void main(String[] args) {
  System.out.println("Tree Set Example!\n");
  TreeSet <String>tree = new TreeSet<String>();
  
  HashSet <String>hashSet = new HashSet<String>();
  Set<String> set  =  new TreeSet<String>();
  
  //ArrayList<String> list = new ArrayList<String>();
  List<String> list = new ArrayList<String>();
  
  tree.add("Kanu");
  tree.add("Manu");
  tree.add("Ranu");
  tree.add("Janu");
  tree.add("Ganu");
  tree.add("Lagu");
  tree.add("Aanu"); 
  //tree.add(n); 
  
  hashSet.add("One");
  hashSet.add("Two");
  hashSet.add("T");
  hashSet.add("Three");
  hashSet.add("Four");
  hashSet.add("Five");
  hashSet.add("F");
  hashSet.add("One");
  //hashSet.add(null);
  
  System.out.println("hashSet  NEXT --- " +hashSet.toString());
  System.out.println("treeSet  NEXT --- " +tree.toString());
  
  //TreeSet <String>newtreeSetbyHashSet = new TreeSet<String>(hashSet);
  TreeSet <String>newtreeSetbyHashSet = new TreeSet<String>(hashSet);
  
  System.out.println(" newtreeSetbyHashSet NEXT --- " +newtreeSetbyHashSet.toString());
  
  Iterator iterator;
  iterator = tree.iterator();
  System.out.print("Tree set data: ");
  //Displaying the Tree set data
  while (iterator.hasNext()){
  System.out.println(" NEXT " + iterator.next() + " " +tree.toString());
  }
  System.out.println();
  //Check impty or not
  if (tree.isEmpty()){
  System.out.print("Tree Set is empty.");
  }
  else{
  System.out.println("Tree Set size: " + tree.size());
  }
  //Retrieve first data from tree set
  System.out.println("First data: " + tree.first());
  //Retrieve last data from tree set
  System.out.println("Last data: " + tree.last());
  if (tree.remove(30)){
  System.out.println("Data is removed from tree set");
  }
  else{
  System.out.println("Data doesn't exist!");
  }
  System.out.print("Now the tree set contain: ");
  iterator = tree.iterator();
  //Displaying the Tree set data
  while (iterator.hasNext()){
  System.out.print(iterator.next() + " ");
  }
  System.out.println();
  System.out.println("Now the size of tree set: " + tree.size());
  //Remove all
  tree.clear();
  if (tree.isEmpty()){
  System.out.print("Tree Set is empty.");
  }
  else{
  System.out.println("Tree Set size: " + tree.size());
  }
  }
}
