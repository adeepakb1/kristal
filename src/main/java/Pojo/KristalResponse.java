package Pojo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class KristalResponse{

	@SerializedName("category")
	private List<CategoryItem> category;

	@SerializedName("searchFilter")
	private SearchFilter searchFilter;

	public void setCategory(List<CategoryItem> category){
		this.category = category;
	}

	public List<CategoryItem> getCategory(){
		return category;
	}

	public void setSearchFilter(SearchFilter searchFilter){
		this.searchFilter = searchFilter;
	}

	public SearchFilter getSearchFilter(){
		return searchFilter;
	}

	@Override
 	public String toString(){
		return 
			"KristalResponse{" + 
			"category = '" + category + '\'' + 
			",searchFilter = '" + searchFilter + '\'' + 
			"}";
		}
}