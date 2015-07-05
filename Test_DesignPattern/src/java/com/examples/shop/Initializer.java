/**
 * 
 */
package com.examples.shop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

/**
 * @author kumark
 *
 */
public class Initializer {

	private static GenericInterface genericInterface = null;
	
	/**
	 * @param args
	 * @return
	 */
	public static GenericInterface initializeStoreKeeper(String [] args , Class type){
		List<Goods> listGoods = new GoodsDeligator().getListOfGoods(args);
		try {
			//genericInterface = (GenericInterface)Class.forName("com.examples.shop.StoreKeeper").newInstance();
				//Class<?> storeKeeperClass = Class.forName("com.examples.shop.StoreKeeper");
				try {
					//Constructor<StoreKeeper> storeKeeperConstructor = storeKeeperClass.getConstructor(new Class[]{List.class});
					Constructor<StoreKeeper> storeKeeperConstructor = StoreKeeper.class.getConstructor(new Class[]{type});
					//Constructor<StoreKeeper> storeKeeperConstructor = StoreKeeper.class.getConstructor(new Class[]{Map.class});
					try {
						if(null == genericInterface)
						genericInterface = storeKeeperConstructor.newInstance(listGoods);
					} catch (IllegalArgumentException e) {
						System.out.println();
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return genericInterface;
	}
}
