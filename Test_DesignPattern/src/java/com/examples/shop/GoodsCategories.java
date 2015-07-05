/**
 * 
 */
package com.examples.shop;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kumark
 *
 */
public abstract class GoodsCategories {
	
	public interface Bread {		
		public static String BROWN_RICE_BREAD = "Brown_Rice_Bread";
	    public static String TOTAL_WHEAT_BREAD = "Total_Wheat_Bread";
	}
	public interface Dairy {
		public static String LOW_FAT_MILK = "1% Low Fat Milk";
		public static String FAT_FREE_SKIM_MILK = "Fat Free Skim Milk";
		public static String SILK_SOY_MILK_NATURAL = "Silk Soy Milk Natural";
			
	}
	public interface Snacks {
		
	}
	public interface Cereals {
		
	}
	public interface Salad {
		public static String ROUSES_VIDALIA_ONION_HONEY_MUSTARD_DRESSING = "Rouses Vidalia Onion Honey Mustard Dressing";
		public static String WISH_BONE_SALAD_SPRITZERS = "Wish-Bone Salad Spritzers";
		
	}
	
	public static List<String> getListOfRawGoods(){
		List<String> listRawGoods = new ArrayList<String>();
		listRawGoods.add(GoodsCategories.Bread.BROWN_RICE_BREAD);
		listRawGoods.add(GoodsCategories.Bread.TOTAL_WHEAT_BREAD);
		listRawGoods.add(GoodsCategories.Dairy.FAT_FREE_SKIM_MILK);
		listRawGoods.add(GoodsCategories.Dairy.LOW_FAT_MILK);
		listRawGoods.add(GoodsCategories.Dairy.SILK_SOY_MILK_NATURAL);
		listRawGoods.add(GoodsCategories.Salad.ROUSES_VIDALIA_ONION_HONEY_MUSTARD_DRESSING);
		listRawGoods.add(GoodsCategories.Salad.WISH_BONE_SALAD_SPRITZERS);
		return listRawGoods;
	}

}
