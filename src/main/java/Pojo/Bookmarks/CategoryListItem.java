package Pojo.Bookmarks;

public class CategoryListItem{
	private int categoryRank;
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
