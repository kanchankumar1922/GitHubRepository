package com.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildcards {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		Bar bar = new Bar();
		bar.doInsert(myList);
	}
}

class Bar {
	void doInsert(List<Integer> list) {
		list.add(new Integer(1));
	}
}