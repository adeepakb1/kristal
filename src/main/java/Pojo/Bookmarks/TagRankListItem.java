package Pojo.Bookmarks;

import java.util.List;

public class TagRankListItem{
	private int tagId;
	private List<CategoryListItem> categoryList;
	private String tagName;
	private int tagRank;

	public void setTagId(int tagId){
		this.tagId = tagId;
	}

	public int getTagId(){
		return tagId;
	}

	public void setCategoryList(List<CategoryListItem> categoryList){
		this.categoryList = categoryList;
	}

	public List<CategoryListItem> getCategoryList(){
		return categoryList;
	}

	public void setTagName(String tagName){
		this.tagName = tagName;
	}

	public String getTagName(){
		return tagName;
	}

	public void setTagRank(int tagRank){
		this.tagRank = tagRank;
	}

	public int getTagRank(){
		return tagRank;
	}

	@Override
 	public String toString(){
		return 
			"TagRankListItem{" + 
			"tagId = '" + tagId + '\'' + 
			",categoryList = '" + categoryList + '\'' + 
			",tagName = '" + tagName + '\'' + 
			",tagRank = '" + tagRank + '\'' + 
			"}";
		}
}