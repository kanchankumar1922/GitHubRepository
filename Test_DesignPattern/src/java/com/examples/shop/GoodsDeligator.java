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
public class GoodsDeligator {

	public GoodsDeligator(){		
	}
	
    public List<Goods> getListOfGoods(String [] args){
    	
    	Goods breadBrown1 =  new Bread(1, GoodsCategories.Bread.BROWN_RICE_BREAD);
    	Goods breadBrown2 =  new Bread(1, GoodsCategories.Bread.TOTAL_WHEAT_BREAD);
    	Goods salad1 =  new Salad(1, GoodsCategories.Salad.ROUSES_VIDALIA_ONION_HONEY_MUSTARD_DRESSING);
    	Goods salad2 =  new Salad(1, GoodsCategories.Salad.WISH_BONE_SALAD_SPRITZERS);
    	Goods dairy =  new Dairy(2, GoodsCategories.Dairy.FAT_FREE_SKIM_MILK);
		List<Goods> listGoods = new ArrayList<Goods>();
		listGoods.add(breadBrown1);
		listGoods.add(breadBrown2);
		listGoods.add(salad1);
		listGoods.add(salad2);
		listGoods.add(dairy);
		
    	return listGoods;
    }
}
