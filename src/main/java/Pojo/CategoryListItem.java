package Pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CategoryListItem{

	@SerializedName("categoryRank")
	private int categoryRank;

	@SerializedName("categoryName")
	private String categoryName;

	public void setCategoryRank(int categoryRank){
		this.categoryRank = categoryRank;
	}

	public int getCategoryRank(){
		return categoryRank;
	}

	public void setCategoryName(String categoryName){
		this.categoryName = categoryName;
	}

	public String getCategoryName(){
		return categoryName;
	}

	@Override
 	public String toString(){
		return 
			"CategoryListItem{" + 
			"categoryRank = '" + categoryRank + '\'' + 
			",categoryName = '" + categoryName + '\'' + 
			"}";
		}
}